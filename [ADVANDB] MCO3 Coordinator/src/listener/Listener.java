package listener;

import controller.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import model.Transaction;

public class Listener implements Runnable {

    private Controller observer;

    private final int port = 123;
    private final int numThreads = 8;
    private final int MARINDUQUEID = 1;
    private final int PALAWANID = 2;
    private final int CENTRALID = 3;

    private ServerSocket serverSocket;
    //private ExecutorService pool;

    private BufferedReader bufferedReader;

    private String request;

    private final TransactionMonitor tmMarinduque;
    private final TransactionMonitor tmCentral;
    private final TransactionMonitor tmPalawan;

    public Listener() {
        try {
            serverSocket = new ServerSocket(port);
            //pool = Executors.newFixedThreadPool(numThreads);
        } catch (IOException e) {
            e.printStackTrace();
        }
        tmMarinduque = new TransactionMonitor();
        tmCentral = new TransactionMonitor();
        tmPalawan = new TransactionMonitor();
    }

    public void addObserver(Controller observer) {
        this.observer = observer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                System.out.println("Accepted");

                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                request = bufferedReader.readLine();
                System.out.println("RECIEVED: " + request + " " + socket.getPort());
                if (request != null) {
                    String[] splitRequest = request.split("-");
                    String query = "";

                    for (int i = 3; i < splitRequest.length; i++) {
                        if (i > 3) {
                            query += " - ";
                        }
                        query += splitRequest[i];
                    }

                    Transaction transaction = new Transaction(Integer.parseInt(splitRequest[0]), Integer.parseInt(splitRequest[1]),
                            Integer.parseInt(splitRequest[2]), query);

                    if (Integer.parseInt(splitRequest[2]) == MARINDUQUEID) {
                        tmMarinduque.addTransaction(transaction);
                        notifyObservers(request, MARINDUQUEID);
                    } else if (Integer.parseInt(splitRequest[2]) == PALAWANID) {
                        tmPalawan.addTransaction(transaction);
                        notifyObservers(request, PALAWANID);
                    } else if (Integer.parseInt(splitRequest[2]) == CENTRALID) {
                        tmCentral.addTransaction(transaction);
                        notifyObservers(request, CENTRALID);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void notifyObservers(String query, int location) {
        observer.notifyObserver(query, location);
    }

    public TransactionMonitor getTmMarinduque() {
        return tmMarinduque;
    }

    public TransactionMonitor getTmCentral() {
        return tmCentral;
    }

    public TransactionMonitor getTmPalawan() {
        return tmPalawan;
    }
}
