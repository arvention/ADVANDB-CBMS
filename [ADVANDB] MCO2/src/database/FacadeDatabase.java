package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FacadeDatabase {
	private static final FacadeDatabase facadeDatabase = new FacadeDatabase();
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private FacadeDatabase(){
		try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/poverty_profiling_combined?user=root";
            String uUser = "root";
            String uPass = "password";
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
	
}
