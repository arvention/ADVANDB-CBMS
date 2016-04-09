/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arces
 */
public class Database {

    private Connection con;
    private String sql;
    private Statement stmt;
    private static Database databaseInstance = new Database();

    private Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/poverty_profiling_marinduque?user=root";
            String uUser = "root";
            String uPass = "admin";

            con = DriverManager.getConnection(host, uUser, uPass);
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return databaseInstance;
    }

    public int processReadQuery(String sql) {
        int row = 0;
        try {
            ResultSet rs = stmt.executeQuery(sql);

            row = rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public String processUpdateQuery(String sql) {
        String result = "";

        return result;
    }

    public String processDeleteQuery(String sql, String table) {
        int id = getFirstID(table);

        if (table.equals("hpq_hh")) {
            sql += " WHERE id = " + id;
        } else {
            sql += " WHERE `main.id` = " + id;
        }

        return sql;
    }

    public int getFirstID(String table) {
        sql = "";
        ResultSet rs;
        int id = 0;

        try {
            if (table.equals("hpq_hh")) {
                sql = "SELECT distinct id FROM " + table;
            } else {
                sql = "SELECT distinct `main.id` FROM " + table;
            }
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                if (table.equals("hpq_hh")) {
                    id = rs.getInt("id");
                } else {
                    id = rs.getInt("main.id");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
