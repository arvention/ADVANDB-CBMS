package transaction.handler;

import database.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    }
}
