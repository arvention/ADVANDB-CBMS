package controller;

import javax.swing.table.DefaultTableModel;
import view.View;

public class Controller {

    private static final Controller controller = new Controller();
    private final View view;

    private final int MARINDUQUEID = 1;
    private final int PALAWANID = 2;
    private final int CENTRALID = 3;

    private final String ONQUEUE = "On Queue";
    private final String FINISHED = "Finished";

    private Controller() {
        view = View.getInstance();
        view.setVisible(true);
    }

    public static Controller getInstance() {
        return controller;
    }

    public void notifyObserver(String query, int location) {
        if (location == MARINDUQUEID) {
            DefaultTableModel model = (DefaultTableModel) view.getTableMarinduque().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        } else if (location == PALAWANID) {
            DefaultTableModel model = (DefaultTableModel) view.getTablePalawan().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        } else if (location == CENTRALID) {
            DefaultTableModel model = (DefaultTableModel) view.getTableCentral().getModel();
            model.addRow(new Object[]{query, ONQUEUE});
        }
    }

    public void notifyObserver(int ID, int location){
        if(location == MARINDUQUEID){
            DefaultTableModel model = (DefaultTableModel) view.getTableMarinduque().getModel();
            markFinished(model, ID);
        } else if(location == PALAWANID){
            DefaultTableModel model = (DefaultTableModel) view.getTablePalawan().getModel();
            markFinished(model, ID);
        } else if(location == CENTRALID){
            DefaultTableModel model = (DefaultTableModel) view.getTableCentral().getModel();
            markFinished(model, ID);
        }
    }
    
    private void markFinished(DefaultTableModel model, int ID){
        int index = -1;
            for(int i = 0; i < model.getRowCount() && index == -1; i++){
                if(Integer.parseInt(model.getValueAt(i, 0).toString().split("-")[0]) == ID){
                    index = i;
                }
                if(index != -1){
                    model.setValueAt(FINISHED, index, 1);
                }
            }
    }
    
}
