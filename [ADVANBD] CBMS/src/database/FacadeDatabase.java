package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FacadeDatabase {
	private static FacadeDatabase facadeDatabase = new FacadeDatabase();
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private FacadeDatabase(){
		try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/equilibrium_spsweng?user=root";
            String uUser = "root";
            String uPass = "admin";
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
	
	public String[][] getResult(String query){
		
		try{
			rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			rs.last();
			String[][] result = new String[rs.getRow()][rsmd.getColumnCount()];
			
			rs.beforeFirst();
			
			for(int i = 0; i < rsmd.getColumnCount(); i++){
				result[0][i] = rsmd.getColumnName(i);
			}
			
			for(int i = 1; rs.next(); i++){
				for(int j = 0; j < rsmd.getColumnCount(); j++){
					Object object = rs.getObject(j);
					String value = (object == null ? "" : object.toString());
					result[i][j] = value;
				}
			}
			
			return result;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
