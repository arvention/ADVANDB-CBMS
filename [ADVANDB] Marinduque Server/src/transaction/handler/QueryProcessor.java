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

    private Socket socket;
    private String address = "localhost";
    private int port = 123;
    private PrintWriter pw;
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

            if (t != null) {
                try {
                    String query = t.getQuery();

                    if (query.contains("SELECT")) {
                        sendQuery = query;
                    } else if (query.contains("UPDATE")) {
                        db.processUpdateQuery(query);
                        sendQuery = query;
                    } else if (query.contains("DELETE")) {
                        String[] querySplit = query.split(" ");

                        String table = querySplit[querySplit.length - 1];
                        sendQuery = db.processDeleteQuery(query, table);
                    }

                    //if source came from client
                    //connect to coordinator
                    socket = new Socket(address, port);
                    pw = new PrintWriter(socket.getOutputStream(), true);
                    if (t.getSource() == MARINDUQUE_ID) {
                        //send transaction to coordinator
                        String sendProtocol = t.getId() + "-" + t.getSource() + "-" + t.getDestination() + "-" + sendQuery;
                        System.out.println(sendProtocol);
                        pw.println(sendProtocol);

                    } else {
                        //send ok message to coordinator
                        String sendProtocol = "OK-" + t.getId();
                        System.out.println(sendProtocol);
                        pw.println(sendProtocol);
                    }
                    //disconnect to coordinator
                    pw.close();
                    socket.close();
                } catch (IOException ex) {
                    Logger.getLogger(QueryProcessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
