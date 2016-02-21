package mvc;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import database.FacadeDatabase;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance(), FacadeDatabase.getInstance());
	private final View view;
	private final ModelTable modelTable;
	private final FacadeDatabase facadeDatabase;
	
	public static Controller getInstance(){
		return controller;
	}
	
	public Controller(View view, ModelTable modelTable, FacadeDatabase facadeDatabase){
		this.view = view;
		this.modelTable = modelTable;
		this.facadeDatabase = facadeDatabase;
		addListeners();
		
		this.view.setVisible(true);
	}

	public View getView() {
		return view;
	}

	public ModelTable getModelTable() {
		return modelTable;
	}
	
	public FacadeDatabase getFacadeDatabase() {
		return facadeDatabase;
	}
	
	public void addListeners(){
		view.getTextAreaQuery().addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				if(view.getTextAreaQuery().getText().equals("Enter Query Here"))
					view.getTextAreaQuery().setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(view.getTextAreaQuery().getText().equals(""))
					view.getTextAreaQuery().setText("Enter Query Here");
			}
		});
	}
}
