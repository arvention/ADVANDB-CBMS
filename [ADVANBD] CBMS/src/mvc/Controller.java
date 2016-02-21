package mvc;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;

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
		
		view.getTextAreaQuery().addCaretListener(new CaretListener(){

			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(view.getTextAreaQuery().getText().length() == 0)
					view.getButtonExecuteQuery().setEnabled(false);
				else
					view.getButtonExecuteQuery().setEnabled(true);
			}
			
		});
		
		view.getButtonExecuteQuery().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				long startTime = System.nanoTime();
				facadeDatabase.getResult(view.getTextAreaQuery().getText(), modelTable);
				long endTime = System.nanoTime() - startTime;
				double seconds = endTime / 1.0E09;
				view.getLabelRunningTime().setText("Running time: " + seconds + " seconds");
				
				DefaultTableModel dtm = new DefaultTableModel(modelTable.getData(), modelTable.getColumnName());
				view.getTableResults().setModel(dtm);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			
		});
	}
}
