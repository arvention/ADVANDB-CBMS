/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIController {

    private ClientGUI gui;

    private String address = "localhost";
    private int port = 1234;
    private Socket soc;
    private PrintWriter pw;

    public GUIController() {
        // -- GUI ---
        this.gui = new ClientGUI();
        gui.setVisible(true);

        // -- Transactions ---
        gui.getStartTransactionBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    // -- Connect to Server ---
                    soc = new Socket(address, port);
                    pw = new PrintWriter(soc.getOutputStream(), true);

                    // -- Send Queries ---
                    sendReadingQueries();
                    sendUpdatingQueries();

                    // -- Disconnect to Server ---
                    pw.close();
                    soc.close();

                } catch (IOException ex) {
                    Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // -- SEND QUERIES --------------
    public void sendQuery(String sql, int times) {
        int source = 1; //marinduque id
        for (int i = 0; i < times; i++) {
            pw.println(source + "-" + sql);
        }
    }

    public void sendReadingQueries() {
        String sql;
        int times;
        // read 1 query
        if (gui.getRead1CheckBox().isSelected()) {
            sql = getRead1Query();
            times = (Integer) gui.getRead1Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 2 query
        if (gui.getRead2CheckBox().isSelected()) {
            sql = getRead2Query();
            times = (Integer) gui.getRead2Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 3 query
        if (gui.getRead3CheckBox().isSelected()) {
            sql = getRead3Query();
            times = (Integer) gui.getRead3Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 4 query
        if (gui.getRead4CheckBox().isSelected()) {
            sql = getRead4Query();
            times = (Integer) gui.getRead4Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 5 query
        if (gui.getRead5CheckBox().isSelected()) {
            sql = getRead5Query();
            times = (Integer) gui.getRead5Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 6 query
        if (gui.getRead6CheckBox().isSelected()) {
            sql = getRead6Query();
            times = (Integer) gui.getRead6Spinner().getValue();

            sendQuery(sql, times);
        }

        // read 7 query
        if (gui.getRead7CheckBox().isSelected()) {
            sql = getRead7Query();
            times = (Integer) gui.getRead7Spinner().getValue();

            sendQuery(sql, times);
        }
    }

    public void sendUpdatingQueries() {
        String sql;
        int times;
        // update 1 query
        if (gui.getUpdate1CheckBox().isSelected()) {
            sql = getUpdate1Query();
            times = (Integer) gui.getUpdate1Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 2 query
        if (gui.getUpdate2CheckBox().isSelected()) {
            sql = getUpdate2Query();
            times = (Integer) gui.getUpdate2Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 3 query
        if (gui.getUpdate3CheckBox().isSelected()) {
            sql = getUpdate3Query();
            times = (Integer) gui.getUpdate3Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 4 query
        if (gui.getUpdate4CheckBox().isSelected()) {
            sql = getUpdate4Query();
            times = (Integer) gui.getUpdate4Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 5 query
        if (gui.getUpdate5CheckBox().isSelected()) {
            sql = getUpdate5Query();
            times = (Integer) gui.getUpdate5Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 6 query
        if (gui.getUpdate6CheckBox().isSelected()) {
            sql = getUpdate6Query();
            times = (Integer) gui.getUpdate6Spinner().getValue();

            sendQuery(sql, times);
        }

        // Update 7 query
        if (gui.getUpdate7CheckBox().isSelected()) {
            sql = getUpdate7Query();
            times = (Integer) gui.getUpdate7Spinner().getValue();

            sendQuery(sql, times);
        }
    }

    public void sendDeletingQueries() {
        String sql;
        int tuples;
        // delete 1 query
        if (gui.getDelete1CheckBox().isSelected()) {
            sql = getDelete1Query();
            tuples = (Integer) gui.getDelete1Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 2 query
        if (gui.getDelete2CheckBox().isSelected()) {
            sql = getDelete2Query();
            tuples = (Integer) gui.getDelete2Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 3 query
        if (gui.getDelete3CheckBox().isSelected()) {
            sql = getDelete3Query();
            tuples = (Integer) gui.getDelete3Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 4 query
        if (gui.getDelete4CheckBox().isSelected()) {
            sql = getDelete4Query();
            tuples = (Integer) gui.getDelete4Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 5 query
        if (gui.getDelete5CheckBox().isSelected()) {
            sql = getDelete5Query();
            tuples = (Integer) gui.getDelete5Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 6 query
        if (gui.getDelete6CheckBox().isSelected()) {
            sql = getDelete6Query();
            tuples = (Integer) gui.getDelete6Spinner().getValue();

            sendQuery(sql, tuples);
        }

        // Delete 7 query
        if (gui.getDelete7CheckBox().isSelected()) {
            sql = getDelete7Query();
            tuples = (Integer) gui.getDelete7Spinner().getValue();

            sendQuery(sql, tuples);
        }
    }

    // -- GET QUERIES --------------
    // --- READ QUERIES --------------------------------------------------
    public String getRead1Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getRead2Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getRead3Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getRead4Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getRead5Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getRead6Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getRead7Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    // --- UPDATE QUERIES ---------------------------------------------
    public String getUpdate1Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getUpdate2Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getUpdate3Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getUpdate4Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getUpdate5Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getUpdate6Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getUpdate7Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    // --- DELETE QUERIES ---------------------------------------------
    public String getDelete1Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getDelete2Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getDelete3Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getDelete4Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getDelete5Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

    public String getDelete6Query() {
        String sql = "SELECT * FROM hpq_crop;";

        return sql;
    }

    public String getDelete7Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }

}
