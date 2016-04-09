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

            if (t != null) {
                try {
                    String query = t.getQuery();

                    if (query.contains("SELECT")) {

                    } else if (query.contains("UPDATE")) {
                        //update db
                        System.out.println("update");
                    } else if (query.contains("DELETE")) {
                        String[] querySplit = query.split(" ");

                        String table = querySplit[querySplit.length - 1];
                        //delete db
                        String deleteQuery = db.processDeleteQuery(query, table);
                        System.out.println(deleteQuery);
                    }

                    System.out.println("client source " + t.getSource());
                    //if source came from client
                    if (t.getSource() == MARINDUQUE_ID) {
                        System.out.println("client source!");
                        //connect to coordinator
                        socket = new Socket(address, port);
                        pw = new PrintWriter(socket.getOutputStream(), true);

                        //send transaction to coordinator
                        pw.println(t.getSource() + "-" + t.getQuery() + "-" + t.getDestination());

                        //disconnect to coordinator
                        pw.close();
                        socket.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(QueryProcessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
