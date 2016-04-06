package requester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Request extends Thread {
	//private final String address = "192.168.254.6";
	
	private final String address = "localhost";
	private final int port = 1234;

	public void run() {

		Socket s;
		PrintWriter sender;
		BufferedReader br;
		@SuppressWarnings("unused")
		String line;
		
		try {
			s = new Socket(address, port);
			sender = new PrintWriter(s.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			sender.println("SELECT * from hpq_hh");
			
			//while ((line = br.readLine()) != null) {
				//System.out.println(line);
			//}
			s.close();
			//System.out.println("Finished running. Time: " + (endTime-startTime)+ " millisecs");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
