package listener;

import controller.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Listener implements Runnable{
    private Controller observer;

    private final int port = 123;
    private final int numThreads = 8;
    
    private ServerSocket serverSocket;
    private ExecutorService pool;
    
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    
    private String line;
    
    public void addObserver(Controller observer){
        this.observer = observer;
        try {
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(numThreads);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                System.out.println("Accepted");
                
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    private void notifyObservers(){
        observer.notifyObserver();
    }
}
