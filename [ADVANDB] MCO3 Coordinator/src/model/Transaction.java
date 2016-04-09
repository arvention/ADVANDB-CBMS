
package model;

public class Transaction {
    private int id;
    private int source;
    private int sendTo;
    private String query;
    
    public Transaction(int id, int source, int sendTo, String query){
        this.id = id;
        this.source = source;
        this.sendTo = sendTo;
        this.query = query;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getSendTo() {
        return sendTo;
    }

    public void setSendTo(int sendTo) {
        this.sendTo = sendTo;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
