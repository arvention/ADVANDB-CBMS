/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marinduque.client.driver;

import GUI.ClientGUI;
import GUI.GUIController;
import server.listener.ServerListener;

/**
 *
 * @author Arces
 */
public class MarinduqueClientDriver {
    public static void main(String[] args) {
        Thread listener = new Thread(new ServerListener());
        listener.start();
        
        new GUIController();
    }
    
}
