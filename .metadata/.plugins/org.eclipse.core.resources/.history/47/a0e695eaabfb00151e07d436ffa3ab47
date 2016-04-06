package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Accepter implements Runnable{

	private int port;
	private ServerSocket serverSocket;
	private ExecutorService pool;

	public Accepter(){
		port = 1234;
		try {
			serverSocket = new ServerSocket(port);
			pool = Executors.newFixedThreadPool(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while(true){
				System.out.println("Waiting");
				Socket socket = serverSocket.accept();
				System.out.println("Accepted");
				pool.submit(new FileRetriever(socket));
				//Thread thread = new Thread(new FileRetriever(socket));
				//thread.start();
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
