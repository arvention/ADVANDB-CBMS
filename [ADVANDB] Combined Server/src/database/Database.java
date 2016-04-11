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
import java.util.Random;
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

    private ArrayList<Integer> marinduqueID, palawanID;
    private final int marinduqueQuery5ID = 388262;
    private final int palawanQuery5ID = 21142;

    private Database() {
        //Marinduque IDs
        this.marinduqueID = new ArrayList<>();
        marinduqueID.add(2445351);
        marinduqueID.add(2192989);
        marinduqueID.add(1636555);
        marinduqueID.add(1636423);
        marinduqueID.add(203774);
        marinduqueID.add(150196);

        //Palawan IDs
        this.palawanID = new ArrayList<>();
        palawanID.add(2041075);
        palawanID.add(1844468);
        palawanID.add(1979123);
        palawanID.add(443737);
        palawanID.add(448751);
        palawanID.add(258375);

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/poverty_profiling?user=root";
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

    public synchronized int processReadQuery(String sql) {
        int row = 0;
        try {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                row++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public synchronized String processUpdateQuery(String sql, int area) {
        if (!sql.contains("WHERE")) {
            if (sql.contains("hpq_hh")) {
                sql += " WHERE id = ";
            } else {
                sql += " WHERE `main.id` = ";
            }
            if (sql.contains("aquani_vol")) {
                if (area == 1) {
                    sql += marinduqueQuery5ID;
                } else if (area == 2) {
                    sql += marinduqueQuery5ID;
                }
            } else {
                if (area == 1) {
                    for (int i = 0; i < marinduqueID.size(); i++) {
                        if (i < marinduqueID.size() - 1) {
                            sql += marinduqueID.get(i) + " OR ";
                        } else {
                            sql += marinduqueID.get(i);
                        }
                        if (i < marinduqueID.size() - 1) {
                            if (sql.contains("hpq_hh")) {
                                sql += "id = ";
                            } else {
                                sql += "`main.id` = ";
                            }
                        }
                    }
                } else if (area == 2) {
                    for (int i = 0; i < palawanID.size(); i++) {
                        if (i < palawanID.size() - 1) {
                            sql += palawanID.get(i) + " OR ";
                        } else {
                            sql += palawanID.get(i);
                        }
                        if (i < palawanID.size() - 1) {
                            if (sql.contains("hpq_hh")) {
                                sql += "id = ";
                            } else {
                                sql += "`main.id` = ";
                            }
                        }
                    }
                }
                /*
                 Random random = new Random();
                 int id = idList.get(random.nextInt(idList.size() - 1) + 1);

                 sql += id;*/
            }
        }
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sql;
    }

    public synchronized String processDeleteQuery(String sql, String table) {
        if (!sql.contains("WHERE")) {
            int id = getFirstID(table);

            if (table.equals("hpq_hh")) {
                sql += " WHERE id = " + id;
            } else {
                sql += " WHERE `main.id` = " + id;
            }
        }
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
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
