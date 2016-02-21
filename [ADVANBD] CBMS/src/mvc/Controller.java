package mvc;

import database.FacadeDatabase;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance(), FacadeDatabase.getInstance());
	private final View view;
	private final ModelTable modelTable;
	private final FacadeDatabase facadeDatabase;
	
	public Controller getInstance(){
		return controller;
	}
	
	public Controller(View view, ModelTable modelTable, FacadeDatabase facadeDatabase){
		this.view = view;
		this.modelTable = modelTable;
		this.facadeDatabase = facadeDatabase;
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
		
	}
}
