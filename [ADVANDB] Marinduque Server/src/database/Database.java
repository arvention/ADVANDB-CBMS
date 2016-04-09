/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Arces
 */
public class Database {

    private Connection con;
    private String sql;
    private static Database databaseInstance = new Database();

    private Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/poverty_profiling_marinduque?user=root";
            String uUser = "root";
            String uPass = "admin";

            con = DriverManager.getConnection(host, uUser, uPass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return databaseInstance;
    }
}
