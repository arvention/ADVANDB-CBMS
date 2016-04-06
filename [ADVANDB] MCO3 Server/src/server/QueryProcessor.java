package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class QueryProcessor implements Runnable{

	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	
	private ArrayList<String> request;
	
	public QueryProcessor(Socket socket){
		this.socket = socket;
		
		request = new ArrayList<>();
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		String message;
		boolean flag = true;
		
		// get request from client
		while(flag){
			try {
				message = bufferedReader.readLine();
				//System.out.println(message);
				if(message.isEmpty()){
					flag = false;
				}else{
					request.add(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Finished");
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
