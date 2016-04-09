/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transaction.handler;

import java.util.ArrayList;
import java.util.Observer;
import model.Transaction;

/**
 *
 * @author Arces
 */
public class TransactionMonitor {
    private ArrayList<Transaction> transactionList;
    private static TransactionMonitor monitorInstance = new TransactionMonitor();
    
    private TransactionMonitor(){
        this.transactionList = new ArrayList<>();
    }
    
    public static TransactionMonitor getInstance(){
        return monitorInstance;
    }
    
    public synchronized ArrayList<Transaction> getTransactions(){
        return transactionList;
    }
    
    public synchronized Transaction dequeueTransaction(){
        Transaction t = null;
        if(!transactionList.isEmpty()){
            t = transactionList.remove(0);
        }
        return t;
    }
    
    public synchronized void addTransaction(Transaction t){
        t.setId(generateID());
        transactionList.add(t);
    }
    
    public int generateID(){
        int id;
        if(transactionList.isEmpty()){
            id = 1;
        }else{
            id = transactionList.get(transactionList.size() - 1).getId() + 1;
        }
        return id;
    }
}
