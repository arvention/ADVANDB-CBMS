package controller;

import javax.swing.table.DefaultTableModel;
import listener.Listener;
import view.View;

public class Controller {
    private static final Controller controller = new Controller();
    private final View view;
    
    private final int MARINDUQUEID = 1;
    private final int PALAWANID = 2;
    private final int CENTRALID = 3;
    
    private final String ONQUEUE = "On Queue";
    private final String FINISHED = "Finished";
    
    private Controller(){
        view = View.getInstance();
        view.setVisible(true);
    }
    
    public static Controller getInstance(){
        return controller;
    }
    
    public void notifyObserver(String query, int location){
        if(location == MARINDUQUEID){
            DefaultTableModel model = (DefaultTableModel) view.getTableMarinduque().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        } else if(location == PALAWANID){
            DefaultTableModel model = (DefaultTableModel) view.getTablePalawan().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        } else if(location == CENTRALID){
            DefaultTableModel model = (DefaultTableModel) view.getTableCentral().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        }
    }
    
}
