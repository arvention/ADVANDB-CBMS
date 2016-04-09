package transaction.handler;

import database.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transaction;

public class QueryProcessor implements Runnable {

    private Socket coorSocket, clientSocket;
    private String coorAddress = "localhost";
    private int coorPort = 123;

    private String clientAddress = "localhost";
    private int clientPort = 1235;

    private PrintWriter coorPrintWriter, clientPrintWriter;
    private Database db;
    private TransactionMonitor tm;
    private final int MARINDUQUE_ID = 1;

    public QueryProcessor() {
        this.db = Database.getInstance();
        this.tm = TransactionMonitor.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            Transaction t = tm.dequeueTransaction();
            String sendQuery = "";
            String clientMessage = "";
            
            if (t != null) {
                clientMessage += "[T" + t.getId() + "] ";
                
                try {
                    String query = t.getQuery();

                    if (query.contains("SELECT")) {
                        int row = db.processReadQuery(query);
                        clientMessage += "READING: Query returned " + row + " rows.";
                    } else if (query.contains("UPDATE")) {
                        db.processUpdateQuery(query);
                        sendQuery = query;
                    } else if (query.contains("DELETE")) {
                        String[] querySplit = query.split(" ");

                        String table = querySplit[querySplit.length - 1];
                        sendQuery = db.processDeleteQuery(query, table);
                        
                        String[] deleteSplit = sendQuery.split(" ");
                        String deleteID = deleteSplit[deleteSplit.length - 1];
                        clientMessage += "DELETING: Deleted Row with ID, " + deleteID + ", from " + table;
                    }

                    //connect to client
                    clientSocket = new Socket(clientAddress, clientPort);
                    clientPrintWriter = new PrintWriter(clientSocket.getOutputStream(), true);
                    
                    //send log to client
                    clientPrintWriter.println(clientMessage);
                    
                    //disconnect to client
                    clientPrintWriter.close();
                    clientSocket.close();
                    
                    if (!query.contains("SELECT")) {
                        //connect to coordinator
                        coorSocket = new Socket(coorAddress, coorPort);
                        coorPrintWriter = new PrintWriter(coorSocket.getOutputStream(), true);

                        //if source came from client
                        if (t.getSource() == MARINDUQUE_ID) {
                            //send transaction to coordinator
                            String sendProtocol = t.getId() + "-" + t.getSource() + "-" + t.getDestination() + "-" + sendQuery;
                            System.out.println(sendProtocol);
                            coorPrintWriter.println(sendProtocol);

                        } else {
                            //send ok message to coordinator
                            String sendProtocol = "OK-" + t.getId();
                            System.out.println(sendProtocol);
                            coorPrintWriter.println(sendProtocol);
                        }
                        //disconnect to coordinator
                        coorPrintWriter.close();
                        coorSocket.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(QueryProcessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
