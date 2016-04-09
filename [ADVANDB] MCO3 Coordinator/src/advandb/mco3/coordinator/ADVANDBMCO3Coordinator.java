
package advandb.mco3.coordinator;

import controller.Controller;
import listener.Listener;

public class ADVANDBMCO3Coordinator {

    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        Listener listener = new Listener();
        listener.addObserver(Controller.getInstance());
        new Thread(listener).start();
    }
    
}
