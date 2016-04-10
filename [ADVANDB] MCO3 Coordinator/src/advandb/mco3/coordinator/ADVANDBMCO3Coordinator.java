
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
        
        Sender senderMarinduque1 = new Sender(listener.getTmMarinduque(), addressMarinduque, portMarinduque, idMarinduque);
        senderMarinduque1.addObserver(Controller.getInstance());
        new Thread(senderMarinduque1).start();
        
        Sender senderCentral1 = new Sender(listener.getTmCentral(), addressCentral, portCentral, idCentral);
        senderCentral1.addObserver(Controller.getInstance());
        new Thread(senderCentral1).start();
        
        Sender senderPalawan1 = new Sender(listener.getTmPalawan(), addressPalawan, portPalawan, idPalawan);
        senderPalawan1.addObserver(Controller.getInstance());
        new Thread(senderPalawan1).start();
        
        Sender senderMarinduque2 = new Sender(listener.getTmMarinduque(), addressMarinduque, portMarinduque, idMarinduque);
        senderMarinduque2.addObserver(Controller.getInstance());
        new Thread(senderMarinduque2).start();
        
        Sender senderCentral2 = new Sender(listener.getTmCentral(), addressCentral, portCentral, idCentral);
        senderCentral2.addObserver(Controller.getInstance());
        new Thread(senderCentral2).start();
        
        Sender senderPalawan2 = new Sender(listener.getTmPalawan(), addressPalawan, portPalawan, idPalawan);
        senderPalawan2.addObserver(Controller.getInstance());
        new Thread(senderPalawan2).start();
    }
    
}
