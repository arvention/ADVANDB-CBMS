
package advandb.mco3.coordinator;

import controller.Controller;
import listener.Listener;
import listener.Sender;

public class ADVANDBMCO3Coordinator {

    public static void main(String[] args) {
        
        String addressMarinduque = "localhost";
        String addressCentral = "localhost";
        String addressPalawan = "localhost";
        int portMarinduque = 1234;
        int portCentral = 1235;
        int portPalawan = 1236;
        int idMarinduque = 1;
        int idPalawan = 2;
        int idCentral = 3;
        
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
        
        Sender senderMarinduque = new Sender(listener.getTmMarinduque(), addressMarinduque, portMarinduque, idMarinduque);
        senderMarinduque.addObserver(Controller.getInstance());
        new Thread(senderMarinduque).start();
        
        Sender senderCentral = new Sender(listener.getTmCentral(), addressCentral, portCentral, idCentral);
        senderCentral.addObserver(Controller.getInstance());
        new Thread(senderCentral).start();
        
        Sender senderPalawan = new Sender(listener.getTmPalawan(), addressPalawan, portPalawan, idPalawan);
        senderPalawan.addObserver(Controller.getInstance());
        new Thread(senderPalawan).start();
    }
    
}
