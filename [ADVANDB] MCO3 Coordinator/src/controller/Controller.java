package controller;

import listener.Listener;
import view.View;

public class Controller {
    private static final Controller controller = new Controller();
    private final View view;
    
    private Controller(){
        view = View.getInstance();
        view.setVisible(true);
    }
    
    public static Controller getInstance(){
        return controller;
    }
    
    public void notifyObserver(){
        
    }
    
}
