package listener;

import controller.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import model.Transaction;


public class Sender implements Runnable {
    private Controller observer;
    
    private TransactionMonitor tm;
    private BufferedReader bufferedReader;
    private PrintWriter pw;
    
    private Socket socket;
    private String address;
    private int port;
    private int ID;
    
    public Sender(TransactionMonitor tm, String address, int port, int ID) {
        this.tm = tm;
        this.address = address;
        this.port = port;
        this.ID = ID;
    }

    public void addObserver(Controller observer){
        this.observer = observer;
    }
    
    @Override
    public void run() {
        while (true) {
            Transaction t = tm.dequeueTransaction();

            if (t != null) {
                try {
                    socket = new Socket(address, port);
                    socket.setSoTimeout(5000);
                    
                    pw = new PrintWriter(socket.getOutputStream(), true);
                    bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    
                    String sendProtocol = t.getId() + "-" + t.getSource() + "-" + t.getSendTo() + "-" + t.getQuery();
                    System.out.println(sendProtocol);
                    pw.println(sendProtocol);
                    
                    String ok = bufferedReader.readLine();
                    System.out.println(ok);
                    
                    int requestID = Integer.parseInt(ok.split("-")[1]);
                    notifyObservers(requestID, ID);
                    
                    pw.close();
                    socket.close();
                    
                }  catch (SocketTimeoutException ex){
                    tm.addTransaction(t);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    private void notifyObservers(int ID, int location){
        observer.notifyObserver(ID, location);
    }
}