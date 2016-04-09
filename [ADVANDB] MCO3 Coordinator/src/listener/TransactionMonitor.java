

package listener;

import java.util.ArrayList;
import model.Transaction;

/**
 *
 * @author Arces
 */
public class TransactionMonitor {
    private ArrayList<Transaction> transactionList;
    
    public TransactionMonitor(){
        this.transactionList = new ArrayList<>();
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
        transactionList.add(t);
    }
}
