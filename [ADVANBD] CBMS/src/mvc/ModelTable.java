package mvc;

public class ModelTable {
	private static ModelTable modelTable = new ModelTable();
	private String[][] table;
	
	public ModelTable(){
		
	}
	
	public static ModelTable getInstance(){
		return modelTable;
	}
	
	public String[][] getTable() {
		return table;
	}
	public void setTable(String[][] table) {
		this.table = table;
	}
}
