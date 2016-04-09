
package model;

public class Transaction {
    private int id;
    private int source;
    private String query;
    private int sendTo;
    
    public Transaction(int id, int source, String query, int sendTo){
        this.id = id;
        this.source = source;
        this.query = query;
        this.sendTo = sendTo;
    }

    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getSendTo() {
        return sendTo;
    }

    public void setSendTo(int sendTo) {
        this.sendTo = sendTo;
    }
}
