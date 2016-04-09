/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction.handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Arces
 */
public class Accepter implements Runnable {

    private int port;
    private ServerSocket serverSocket;
    private ExecutorService pool;

    public Accepter(int numThreads) {
        port = 1234;
        try {
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(numThreads);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                System.out.println("Accepted");
                pool.submit(new QueryProcessor(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}