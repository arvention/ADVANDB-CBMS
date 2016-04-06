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

public class FileRetriever implements Runnable{

	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	
	private ArrayList<String> request;
	
	public FileRetriever(Socket socket){
		this.socket = socket;
		
		request = new ArrayList<>();
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
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
		String[] requestLine1 = request.get(0).split(" ");
		//System.out.println(requestLine1[1]);
		
		if(requestLine1[1].equalsIgnoreCase("/file1.html")){
			//System.out.println("Reading file 1");
			readFile("file1.html");
		} else if(requestLine1[1].equalsIgnoreCase("/file2.html")){
			//System.out.println("Reading file 2");
			readFile("file2.html");
		} else if(requestLine1[1].equalsIgnoreCase("/favicon.ico")) {
			
		}else{
			//System.out.println("Reading notfound");
			readFile("notfound.html");
		}
		System.out.println("Finished");
		/*try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	private void readFile(String fileName){
		sendHeader();
		Path path = Paths.get(fileName);
		try {
			byte[] data  = Files.readAllBytes(path);
			socket.getOutputStream().write(data);
			//socket.getOutputStream().write('\0');
			//socket.shutdownOutput();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*try {
			BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
			sendHeader();
			String line;
			while((line = fileReader.readLine()) != null){
				printWriter.println(line);
			}
			
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	
	public void sendHeader(){
		printWriter.println("HTTP/1.0 200 OK");
		printWriter.println("Content-type: text/html");
	}
	
}
