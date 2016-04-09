/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.listener;

import GUI.ClientGUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arces
 */
public class ServerListener implements Runnable{
    private ClientGUI gui;
    private ServerSocket listenerSocket;
    private int port = 1235;
    private BufferedReader br;
    
    public ServerListener(){
        this.gui = ClientGUI.getInstance();
        try {
            this.listenerSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Socket socket = listenerSocket.accept();
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                
                String message;
                while((message = br.readLine()) != null){
                    gui.getClientLogArea().append(message + "\n");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
