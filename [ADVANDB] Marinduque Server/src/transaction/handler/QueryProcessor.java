package transaction.handler;

import database.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class QueryProcessor implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter pw;
    private Database db;

    private ArrayList<String> request;

    public QueryProcessor(Socket socket) {
        this.socket = socket;

        this.db = Database.getInstance();
        request = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        String requests = "";

        String received;
        // get request from client
        try {
            while ((received = bufferedReader.readLine()) != null) {
                requests += received;
            }
            String[] requestList = requests.split(";");

            for (int i = 0; i < requestList.length; i++) {
                System.out.println(i + " " + requestList[i]);
            }

            // request.add(message);
            //              System.out.println(message);
            //            if (message.contains(";")) {
            //              flag = false;
            //        }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Finished");
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
