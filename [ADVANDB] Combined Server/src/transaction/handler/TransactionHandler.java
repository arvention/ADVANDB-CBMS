/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction.handler;

import GUI.ServerGUI;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arces
 */
public class TransactionHandler {

    private QueryReceiver receiver;
    private QueryProcessor processor;
    private ServerGUI gui;
    private int numProcessor;
    private ArrayList<Thread> processors;
    
    public TransactionHandler() {
        this.gui = gui.getInstance();
        
        this.numProcessor = 8;
        this.processors = new ArrayList<>();
        
        startServer();
    }

    public void startServer() {
        this.receiver = new QueryReceiver(8);
        Thread r = new Thread(receiver);
        r.start();

        for (int i = 0; i < numProcessor; i++) {
            this.processor = new QueryProcessor();
            Thread p = new Thread(processor);
            processors.add(p);
            p.start();
        }
        
        for(Thread p: processors){
            try {
                p.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(TransactionHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
