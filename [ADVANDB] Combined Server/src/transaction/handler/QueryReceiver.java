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
import java.io.PrintWriter;
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
    private BufferedReader bufferedReader;
    private ServerGUI gui;
    private TransactionMonitor tm;
    private PrintWriter pw;
    private int COMBINED_ID = 1;

    public QueryReceiver(int numThreads) {
        port = 1235;
        this.gui = ServerGUI.getInstance();
        try {
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(numThreads);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.tm = TransactionMonitor.getInstance();
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                
                System.out.println("Accepted");
                //pool.submit(new QueryProcessor(socket));
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                pw = new PrintWriter(socket.getOutputStream(), true);
                
                String request = bufferedReader.readLine();

                //add transaction
                String[] splitRequest = request.split("-");
                int id = Integer.parseInt(splitRequest[0]);
                int source = Integer.parseInt(splitRequest[1]);
                int destination = Integer.parseInt(splitRequest[2]);
                String query = "";

                for (int j = 3; j < splitRequest.length; j++) {
                    if (j > 3) {
                        query += " - ";
                    }
                    query += splitRequest[j];
                }
                
                query = query.substring(0, query.length() - 1);
                
                String log = "TRANSACTION RECEIVED: " + query;
                System.out.println(log);
                gui.getServerLogArea().append(log + "\n");
                Transaction transaction = new Transaction(id, source, query, destination);

                tm.addTransaction(transaction);
                
                if(source != COMBINED_ID){
                    pw.println("OK-" + id);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
