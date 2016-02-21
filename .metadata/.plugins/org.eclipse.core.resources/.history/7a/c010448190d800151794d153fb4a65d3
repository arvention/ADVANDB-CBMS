package mvc;

public class Controller {
	private static final Controller controller = new Controller(View.getInstance(), ModelTable.getInstance());
	private final View view;
	private final ModelTable modelTable;
	
	public Controller getInstance(){
		return controller;
	}
	
	public Controller(View view, ModelTable modelTable){
		this.view = view;
		this.modelTable = modelTable;
	}

	public View getView() {
		return view;
	}

	public ModelTable getModelTable() {
		return modelTable;
	}
}
