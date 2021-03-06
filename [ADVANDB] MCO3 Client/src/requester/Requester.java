
package requester;

import java.util.ArrayList;

public class Requester {
	
	public static void main(String[] args) {
		ArrayList<Request> requests = new ArrayList<>();
		
		int threadCount = 10;
		for(int i = 0; i < threadCount; i++){
			requests.add(new Request());
			requests.get(i).start();
		}
		
		for(Request request : requests){
			try {
				request.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
