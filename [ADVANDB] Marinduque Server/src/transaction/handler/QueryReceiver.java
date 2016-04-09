/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction.handler;

import GUI.ServerGUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import model.Transaction;

/**
 *
 * @author Arces
 */
public class QueryReceiver implements Runnable {

    private int port;
    private ServerSocket serverSocket;
    private ExecutorService pool;
    private String received;
    private BufferedReader bufferedReader;
    private ServerGUI gui;
    private TransactionMonitor tm;

    public QueryReceiver(int numThreads) {
        port = 1234;
        try {
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(numThreads);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.tm = TransactionMonitor.getInstance();
        this.gui = new ServerGUI();
    }

    @Override
    public void run() {
        try {
            while (true) {
                String requests = "";
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                System.out.println("Accepted");
                //pool.submit(new QueryProcessor(socket));
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while ((received = bufferedReader.readLine()) != null) {
                    System.out.println(received);
                    requests += received;
                }
                String[] requestList = requests.split(";");

                //store transaction
                for (int i = 0; i < requestList.length; i++) {
                    int source = 1; //change for other areas
                    String query = requestList[i];

                    Transaction transaction = new Transaction(source, query, 3);

                    tm.addTransaction(transaction);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
