package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import mvc.ModelTable;

public class FacadeDatabase {
	private static FacadeDatabase facadeDatabase = new FacadeDatabase();
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private FacadeDatabase(){
		try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/poverty_profiling?user=root";
            String uUser = "root";
<<<<<<< HEAD
            String uPass = "password";
=======
            String uPass = "admin";
>>>>>>> origin/master
            con = DriverManager.getConnection(host, uUser, uPass);
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR: FAILED TO GET CONNECTION");
        }
	}
	
	public static FacadeDatabase getInstance(){
		return facadeDatabase;
	}
	
	public Connection getConnection(){
		return con;
	}
	
	public ModelTable getResult(String query, ModelTable modelTable){
		
		try{
			rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			rs.last();
			modelTable.setColumnName(new String[rsmd.getColumnCount()]);
			modelTable.setData(new String[rs.getRow()][rsmd.getColumnCount()]);
			
			rs.beforeFirst();
			for(int i = 0; i < rsmd.getColumnCount(); i++){
				modelTable.getColumnName()[i] = rsmd.getColumnLabel(i+1);
			}
			
			for(int i = 0; rs.next(); i++){
				for(int j = 0; j < rsmd.getColumnCount(); j++){
					Object object = rs.getObject(j+1);
					String value = (object == null ? "" : object.toString());
					modelTable.getData()[i][j] = value;
				}
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		return modelTable;
	}
}
