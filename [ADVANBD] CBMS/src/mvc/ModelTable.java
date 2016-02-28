package mvc;

public class ModelTable {
	private static ModelTable modelTable = new ModelTable();
	private String[] columnName;
	private String[][] data;
	
	public static ModelTable getInstance(){
		return modelTable;
	}

	public String[] getColumnName() {
		return columnName;
	}

	public void setColumnName(String[] columnName) {
		this.columnName = columnName;
	}

	public String[][] getData() {
		return data;
	}

	public void setData(String[][] data) {
		this.data = data;
	}
}
