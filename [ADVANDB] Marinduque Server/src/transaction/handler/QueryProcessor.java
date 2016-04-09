package transaction.handler;

import database.Database;
import java.io.BufferedReader;
import java.io.PrintWriter;
import model.Transaction;

public class QueryProcessor implements Runnable {

    private BufferedReader bufferedReader;
    private PrintWriter pw;
    private Database db;
    private TransactionMonitor tm;

    public QueryProcessor() {
        this.db = Database.getInstance();
        this.tm = TransactionMonitor.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            Transaction t = tm.dequeueTransaction();

            if (t != null) {
                String query = t.getQuery();

                if (query.contains("SELECT")) {
                    //read from db
                } else if (query.contains("UPDATE")) {
                    //update db
                } else if (query.contains("DELETE")) {
                    //delete db
                }
                
                System.out.println(query + " " + tm.getTransactions().size());
            }
        }
    }
}
