package transaction.handler;

import GUI.ServerGUI;
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
    private int clientPort = 1000;

    private PrintWriter coorPrintWriter, clientPrintWriter;
    private Database db;
    private TransactionMonitor tm;
    private final int MARINDUQUE_ID = 1;

    private ServerGUI gui;

    public QueryProcessor() {
        this.db = Database.getInstance();
        this.tm = TransactionMonitor.getInstance();
        this.gui = ServerGUI.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            Transaction t = tm.dequeueTransaction();
            String sendQuery = "";
            String clientMessage = "";
            String logMessage = "";

            if (t != null) {
                clientMessage += "[T" + t.getId() + "] ";

                try {
                    String query = t.getQuery();

                    if (query.contains("SELECT")) {
                        logMessage = "[T" + t.getId() + "] " + "PROCESSING: Read Query.";
                        gui.getServerLogArea().append(logMessage + "\n");

                        int row = db.processReadQuery(query);
                        clientMessage += "READING: Query returned " + row + " rows.";
                    } else if (query.contains("UPDATE")) {
                        logMessage = "[T" + t.getId() + "] " + "PROCESSING: Update Query.";
                        gui.getServerLogArea().append(logMessage + "\n");

                        sendQuery = db.processUpdateQuery(query);
                        logMessage = "[T" + t.getId() + "] " + "COMMITTED: Update Query.";
                        gui.getServerLogArea().append(logMessage + "\n");
                        
                        String[] updateSplit = sendQuery.split(" ");
                        String updateID = sendQuery.substring(sendQuery.indexOf("WHERE"));
                        String updatedField = updateSplit[3];
                        clientMessage += "UPDATING: Updated " + updatedField + " of entries " + updateID + ".";
                    } else if (query.contains("DELETE")) {
                        logMessage = "[T" + t.getId() + "] " + "PROCESSING: Delete Query.";
                        gui.getServerLogArea().append(logMessage + "\n");
                        String[] querySplit = query.split(" ");

                        String table = querySplit[querySplit.length - 1];
                        sendQuery = db.processDeleteQuery(query, table);

                        logMessage = "[T" + t.getId() + "] " + "COMMITTED: Delete Query.";
                        gui.getServerLogArea().append(logMessage + "\n");

                        String[] deleteSplit = sendQuery.split(" ");
                        String deleteID = deleteSplit[deleteSplit.length - 1];
                        clientMessage += "DELETING: Deleted Row with ID, " + deleteID + ", from " + table;
                    }
                    
                    logMessage = "[T" + t.getId() + "] " + "TRANSACTION COMPLETE.";
                    gui.getServerLogArea().append(logMessage + "\n");
                    
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
