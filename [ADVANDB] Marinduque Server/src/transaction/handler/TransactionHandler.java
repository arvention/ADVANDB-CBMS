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
    private QueryReceiver receiver;
    private QueryProcessor processor;
    
    public TransactionHandler(){
        
        this.receiver = new QueryReceiver(8);
        Thread r = new Thread(receiver);
        r.start();
        
        this.processor = new QueryProcessor();
        Thread p = new Thread(processor);
        p.start();
    }
}
