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
                String sql;
                int times;
                try {
                    // -- Connect to Server ---   
                    soc = new Socket(address, port);
                    pw = new PrintWriter(soc.getOutputStream(), true);

                    // -- Send Queries ---
                    // read 1 query
                    if (gui.getRead1CheckBox().isSelected()) {
                        sql = getRead1Query();
                        times = (Integer) gui.getRead1Spinner().getValue();

                        sendQuery(sql, times);
                    }
                    
                    // read 2 query
                    if (gui.getRead2CheckBox().isSelected()) {
                        sql = getRead2Query();
                        times = (Integer) gui.getRead1Spinner().getValue();

                        sendQuery(sql, times);
                    }
                    
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
        for (int i = 0; i < times; i++) {
            pw.println(sql);
        }
    }

    // -- GET QUERIES --------------
    public String getRead1Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }
    
    public String getRead2Query() {
        String sql = "SELECT * FROM hpq_hh;";

        return sql;
    }
}
