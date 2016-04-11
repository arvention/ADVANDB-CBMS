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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIController {

    private ClientGUI gui;

    private String address = "localhost";
    private int port = 1235;
    private Socket soc;
    private PrintWriter pw;

    public GUIController() {
        // -- GUI ---
        this.gui = ClientGUI.getInstance();

        // -- Transactions ---
        gui.getStartTransactionBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // -- Send Queries ---
                sendReadingQueries();
                sendUpdatingQueries();
                sendDeletingQueries();

            }
        });
    }

    // -- SEND QUERIES --------------
    public void sendQuery(String sql, int times) {
        for (int i = 0; i < times; i++) {
            try {
                // -- Connect to Server ---
                soc = new Socket(address, port);

                pw = new PrintWriter(soc.getOutputStream(), true);

                int id = 0;
                int source = 3;
                int destination = 0;
                if (gui.getMarinduqueRadio().isSelected()) {
                    destination = 1;
                } else if (gui.getPalawanRadio().isSelected()) {
                    destination = 2;
                }
                pw.println(id + "-" + source + "-" + destination + "-" + sql);

                // -- Disconnect to Server ---
                pw.close();
                soc.close();
            } catch (IOException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        String sql = "SELECT id AS ID, mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', calam1_hwmny AS 'Typhoon Count', house_type AS 'House Type', nbr AS 'Room Count',"
                + " roof AS 'Roof Composition', wall AS 'Wall Composition', nofw AS 'Number of OFW',"
                + " nnucfam AS 'Number of Families' FROM hpq_hh";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 2445351 or id = 2192989 or id = 1636555 or id = 1636423 or id = 203774)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 2041075 or id = 1844468 or id = 1979123 or id = 443737 or id = 448751)";
        }
        sql += " GROUP BY mun, zone, brgy, purok;";

        return sql;
    }

    public String getRead2Query() {
        String sql = "SELECT id AS 'ID', mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', nofw AS 'Number of OFW', nnucfam AS 'Number of Families',"
                + " prog_slp_nmem AS 'Number of Beneficiaries of Sustainable Livelihood Program',"
                + " prog_fudforsch_nmem AS 'Number of Beneficiaries of Food for School Program',"
                + " prog_fudforwrk_nmem AS 'Number of Beneficiaries of Food for Work Program',"
                + " prog_cshforwrk_nmem AS 'Number of Beneficiaries of Cash for Work Program',"
                + " prog_spisc_nmem AS 'Number of Beneficiaries of Social Pension for the Indigent Senior Citizen',"
                + " prog_cct_nmem AS 'Number of Beneficiaries of Pantawid Pamilyang Pilipino Program',"
                + " prog_arcdp_nmem AS 'Number of Beneficiaries of Agrarian Reform Community Development Program',"
                + " prog_cbep_nmem AS 'Number of Beneficiaries of Community-Based Employment Program',"
                + " prog_phiheal_ofw_nmem AS 'Number of Beneficiaries of Philhealth - OFW',"
                + " prog_phiheal_empl_nmem AS 'Number of Beneficiaries of Philhealth - Employed',"
                + " prog_phiheal_indiv_nmem AS 'Number of Beneficiaries of Philhealth - Individually Paying',"
                + " prog_phiheal_spon_nmem AS 'Number of Beneficiaries of Philhealth - Sponsored',"
                + " prog_phiheal_life_nmem AS 'Number of Beneficiaries of Philhealth - Lifetime',"
                + " nprog AS 'Number of Other Programs Where the Household Benefits From'"
                + " FROM hpq_hh";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 2445351 or id = 2192989 or id = 1636555 or id = 1636423 or id = 203774)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 2041075 or id = 1844468 or id = 1979123 or id = 443737 or id = 448751)";
        }
        sql += " GROUP BY mun, zone, brgy, purok;";

        return sql;
    }

    public String getRead3Query() {
        String sql = "SELECT mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', croptype AS 'Different Types of Crop',"
                + " COUNT(croptype) AS 'Number of Household That Plants This Type of Crop' FROM hpq_crop"
                + " JOIN hpq_hh ON hpq_crop.`main.id` = hpq_hh.id ";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 2445351 or id = 2192989 or id = 1636555 or id = 1636423 or id = 203774)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 2041075 or id = 1844468 or id = 1979123 or id = 443737 or id = 448751)";
        }
        sql += " GROUP BY mun, zone, brgy, purok;";

        return sql;
    }

    public String getRead4Query() {
        String sql = "SELECT mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', mdeady AS 'Cause of Death', COUNT(mdeady) AS 'Total Number of Death'"
                + " FROM hpq_death JOIN hpq_hh ON hpq_death.`main.id` = hpq_hh.id";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 2445351 or id = 2192989 or id = 1636555 or id = 1636423 or id = 203774)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 2041075 or id = 1844468 or id = 1979123 or id = 443737 or id = 448751)";
        }
        sql += " GROUP BY mun, zone, brgy, purok, mdeady;";

        return sql;
    }

    public String getRead5Query() {
        String sql = "SELECT mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', aquaequiptype AS 'Equipment for Fishing',"
                + " SUM(aquani_vol) AS 'Number of Fish Caught' FROM hpq_hh JOIN hpq_aquaequip"
                + " ON hpq_hh.id = hpq_aquaequip.`main.id` JOIN hpq_aquani ON hpq_aquaequip.`main.id` ="
                + " hpq_aquani.`main.id`";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 388262)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 21142)";
        }
        sql += " GROUP BY mun, zone, brgy, purok, aquaequiptype;";

        return sql;
    }

    public String getRead6Query() {
        String sql = "SELECT mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay',"
                + " purok AS 'Purok', SUM(cropincsh) AS 'Total Income From Farming',"
                + " SUM(crop_vol) AS 'Total Volume of Crop Harvested',"
                + " SUM(fishincsh) AS 'Total Income from Fishing',"
                + " SUM(aquani_vol) AS 'Total Volume of Fish Caught'"
                + " FROM hpq_hh JOIN hpq_crop ON hpq_hh.id = hpq_crop.`main.id`";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 2445351 or id = 2192989 or id = 1636555 or id = 1636423 or id = 203774)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 2041075 or id = 1844468 or id = 1979123 or id = 443737 or id = 448751)";
        }
        sql += " GROUP BY mun, zone, brgy, purok;";

        return sql;
    }

    public String getRead7Query() {
        String sql = "SELECT id AS 'ID of Household', memno AS 'ID of Member',"
                + " mun AS 'Municipality', zone AS 'Zone', brgy AS 'Barangay', purok AS 'Purok',"
                + " age_yr AS 'Age', occup AS 'Work', yrs_in_cropind AS 'Number of Years in the Farming Industry',"
                + " nalp AS 'Number of Parcel Farm Land', ncrop AS 'Number of Crops Planted Last Year',"
                + " wagcshm AS 'Total Salary', agriequip1 AS 'Uses Beast of Burden',"
                + " agriequip2 AS 'Uses Plow', agriequip3 AS 'Uses Harrow', agriequip4 AS 'Uses Mower',"
                + " agriequip5 AS 'Thresher', agriequip6 AS 'Uses Insecticide Sprayer', agriequip7 AS 'Uses Farm Tractor',"
                + " agriequip8 AS 'Uses Hand Tractor', agriequip9 AS 'Uses Mudboat', agriequip10 AS 'Uses Planter',"
                + " agriequip11 AS 'Uses Mechanical Dryer', agriequip12 AS 'Uses Drying Pavement',"
                + " agriequip13 AS 'Uses Feed Mill', agriequip14 AS 'Uses Harvester', agriequip15 AS 'Uses Warehouse Granary',"
                + " agriequip16 AS 'Uses Farmshed', agriequip17 AS 'Uses Irrigation Pump',"
                + " agriequip18 AS 'Uses Other Tools', u_amt_harv AS 'Total Volume of Crop Harvested Last Year',"
                + " u_low_harv AS 'Cause of Low Yield', croptype AS 'Type of Crop', SUM(crop_vol) AS 'Total Volume of Crop Harvested'"
                + " FROM hpq_hh JOIN hpq_mem ON hpq_hh.id = hpq_mem.`main.id` JOIN hpq_crop on hpq_hh.id = hpq_crop.`main.id`"
                + " JOIN hpq_arcdp_mem ON hpq_hh.id = hpq_arcdp_mem.`main.id` AND hpq_arcdp_mem.arcdp_mem_refno ="
                + " hpq_mem.memno";
        if (gui.getMarinduqueRadio().isSelected()) {
            sql += " WHERE (id = 150196)";
        } else if (gui.getPalawanRadio().isSelected()) {
            sql += " WHERE (id = 258375)";
        }
        sql += " GROUP BY id, mun, zone, brgy, purok, memno, croptype;";

        return sql;
    }

    // --- UPDATE QUERIES ---------------------------------------------
    public String getUpdate1Query() {
        String sql = "UPDATE hpq_hh SET calam1_hwmny = calam1_hwmny + 1;";

        return sql;
    }

    public String getUpdate2Query() {
        String sql = "UPDATE hpq_hh SET calam1_hwmny = calam1_hwmny - 1;";

        return sql;
    }

    public String getUpdate3Query() {
        String sql = "UPDATE hpq_hh SET nprog = nprog + 1;";

        return sql;
    }

    public String getUpdate4Query() {
        String sql = "UPDATE hpq_crop SET crop_vol = crop_vol + 100;";

        return sql;
    }

    public String getUpdate5Query() {
        String sql = "UPDATE hpq_crop SET crop_vol = crop_vol - 100;";

        return sql;
    }

    public String getUpdate6Query() {
        Random random = new Random();
        int number = random.nextInt(17) + 1;

        String sql = "UPDATE hpq_death SET mdeady = " + number + ";";

        return sql;
    }

    public String getUpdate7Query() {
        String sql = "UPDATE hpq_aquani SET aquani_vol = aquani_vol + 100;";

        return sql;
    }

    // --- DELETE QUERIES ---------------------------------------------
    public String getDelete1Query() {
        String sql = "DELETE FROM hpq_hh;";

        return sql;
    }

    public String getDelete2Query() {
        String sql = "DELETE FROM hpq_crop;";

        return sql;
    }

    public String getDelete3Query() {
        String sql = "DELETE FROM hpq_death;";

        return sql;
    }

    public String getDelete4Query() {
        String sql = "DELETE FROM hpq_aquaequip;";

        return sql;
    }

    public String getDelete5Query() {
        String sql = "DELETE FROM hpq_aquani;";

        return sql;
    }

    public String getDelete6Query() {
        String sql = "DELETE FROM hpq_mem;";

        return sql;
    }

    public String getDelete7Query() {
        String sql = "DELETE FROM hpq_arcdp_mem;";

        return sql;
    }

}
