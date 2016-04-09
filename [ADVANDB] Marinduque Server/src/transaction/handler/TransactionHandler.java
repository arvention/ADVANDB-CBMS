/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transaction.handler;

import GUI.ServerGUI;

/**
 *
 * @author Arces
 */
public class TransactionHandler {
    private ServerGUI gui;
    private Accepter accepter;
    
    public TransactionHandler(){
        this.gui = new ServerGUI();
        gui.setVisible(true);
        
        this.accepter = new Accepter(8);
        Thread a = new Thread(accepter);
        
        a.start();
    }
}
