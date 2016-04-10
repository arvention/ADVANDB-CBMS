/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Arces
 */
public class ClientGUI extends javax.swing.JFrame {
    private static ClientGUI guiInstance = new ClientGUI();
    
    private ClientGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        clientLogArea.setEditable(false);
        this.setVisible(true);
        areaBtnGroup.add(palawanRadio);
        areaBtnGroup.add(marinduqueRadio);
        marinduqueRadio.setSelected(true);
    }
    
    public static ClientGUI getInstance(){
        return guiInstance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaBtnGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        headerTitleLabel = new javax.swing.JLabel();
        readPanel = new javax.swing.JPanel();
        readQueryLabel = new javax.swing.JLabel();
        readTimesLabel = new javax.swing.JLabel();
        read1CheckBox = new javax.swing.JCheckBox();
        read2CheckBox = new javax.swing.JCheckBox();
        read3CheckBox = new javax.swing.JCheckBox();
        read4CheckBox = new javax.swing.JCheckBox();
        read5CheckBox = new javax.swing.JCheckBox();
        read6CheckBox = new javax.swing.JCheckBox();
        read7CheckBox = new javax.swing.JCheckBox();
        read1Spinner = new javax.swing.JSpinner();
        read2Spinner = new javax.swing.JSpinner();
        read3Spinner = new javax.swing.JSpinner();
        read4Spinner = new javax.swing.JSpinner();
        read5Spinner = new javax.swing.JSpinner();
        read6Spinner = new javax.swing.JSpinner();
        read7Spinner = new javax.swing.JSpinner();
        updatePanel = new javax.swing.JPanel();
        updateQueryLabel = new javax.swing.JLabel();
        updateTimeLabel = new javax.swing.JLabel();
        update1CheckBox = new javax.swing.JCheckBox();
        update2CheckBox = new javax.swing.JCheckBox();
        update3CheckBox = new javax.swing.JCheckBox();
        update4CheckBox = new javax.swing.JCheckBox();
        update5CheckBox = new javax.swing.JCheckBox();
        update6CheckBox = new javax.swing.JCheckBox();
        update7CheckBox = new javax.swing.JCheckBox();
        update1Spinner = new javax.swing.JSpinner();
        update2Spinner = new javax.swing.JSpinner();
        update3Spinner = new javax.swing.JSpinner();
        update4Spinner = new javax.swing.JSpinner();
        update5Spinner = new javax.swing.JSpinner();
        update6Spinner = new javax.swing.JSpinner();
        update7Spinner = new javax.swing.JSpinner();
        deletePanel = new javax.swing.JPanel();
        deleteQueryLabel = new javax.swing.JLabel();
        deleteTuplesLabel = new javax.swing.JLabel();
        delete1CheckBox = new javax.swing.JCheckBox();
        delete2CheckBox = new javax.swing.JCheckBox();
        delete3CheckBox = new javax.swing.JCheckBox();
        delete4CheckBox = new javax.swing.JCheckBox();
        delete5CheckBox = new javax.swing.JCheckBox();
        delete6CheckBox = new javax.swing.JCheckBox();
        delete7CheckBox = new javax.swing.JCheckBox();
        delete1Spinner = new javax.swing.JSpinner();
        delete2Spinner = new javax.swing.JSpinner();
        delete3Spinner = new javax.swing.JSpinner();
        delete4Spinner = new javax.swing.JSpinner();
        delete5Spinner = new javax.swing.JSpinner();
        delete6Spinner = new javax.swing.JSpinner();
        delete7Spinner = new javax.swing.JSpinner();
        footerPanel = new javax.swing.JPanel();
        startTransactionBtn = new javax.swing.JButton();
        marinduqueRadio = new javax.swing.JRadioButton();
        palawanRadio = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientLogArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Combined Client");
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerTitleLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        headerTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTitleLabel.setText("Combined Client");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        readPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reading Queries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        readPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        readPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        readQueryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readQueryLabel.setText("Query");

        readTimesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readTimesLabel.setText("# of times");

        read1CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read1CheckBox.setText("Calamity Report");
        read1CheckBox.setFocusable(false);
        read1CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read2CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read2CheckBox.setText("Government Service Report");
        read2CheckBox.setFocusable(false);
        read2CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read3CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read3CheckBox.setText("Crop Report");
        read3CheckBox.setFocusable(false);
        read3CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read4CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read4CheckBox.setText("Death Report");
        read4CheckBox.setFocusable(false);
        read4CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read5CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read5CheckBox.setText("Fishing Equipment Report");
        read5CheckBox.setFocusable(false);
        read5CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read6CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read6CheckBox.setText("Fish and Crop Income Report");
        read6CheckBox.setFocusable(false);
        read6CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read7CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        read7CheckBox.setText("Agricultural Status Report");
        read7CheckBox.setFocusable(false);
        read7CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        read1Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        read1Spinner.setPreferredSize(new java.awt.Dimension(50, 20));

        read2Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        read3Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        read4Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        read5Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        read6Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        read7Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout readPanelLayout = new javax.swing.GroupLayout(readPanel);
        readPanel.setLayout(readPanelLayout);
        readPanelLayout.setHorizontalGroup(
            readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(readPanelLayout.createSequentialGroup()
                        .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(read2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read1CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read3CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read4CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read5CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read6CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read7CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(read1Spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(read2Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(read3Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(read4Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(read5Spinner)
                            .addComponent(read6Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(read7Spinner, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(readPanelLayout.createSequentialGroup()
                        .addComponent(readQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(readTimesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        readPanelLayout.setVerticalGroup(
            readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readQueryLabel)
                    .addComponent(readTimesLabel))
                .addGap(0, 0, 0)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read4CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read4Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read5CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read5Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read6CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read6Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read7CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read7Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        updatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Updating Queries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        updatePanel.setMaximumSize(new java.awt.Dimension(250, 250));
        updatePanel.setPreferredSize(new java.awt.Dimension(250, 250));

        updateQueryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateQueryLabel.setText("Query");

        updateTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateTimeLabel.setText("# of times");

        update1CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update1CheckBox.setText("Add 1 to calam1_hwmny");
        update1CheckBox.setFocusable(false);
        update1CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update2CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update2CheckBox.setText("Subtract 1 to calam1_hwmny");
        update2CheckBox.setFocusable(false);
        update2CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update3CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update3CheckBox.setText("Add 1 to nprog");
        update3CheckBox.setFocusable(false);
        update3CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update4CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update4CheckBox.setText("Add 100 to crop_vol");
        update4CheckBox.setFocusable(false);
        update4CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update5CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update5CheckBox.setText("Subtract 100 from crop_vol");
        update5CheckBox.setFocusable(false);
        update5CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update6CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update6CheckBox.setText("Change mdeady randomly");
        update6CheckBox.setFocusable(false);
        update6CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update7CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        update7CheckBox.setText("Add 100 to aquani_vol");
        update7CheckBox.setFocusable(false);
        update7CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        update1Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update2Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update3Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update4Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update5Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update6Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        update7Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(update2CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update1CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update3CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update4CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update5CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update6CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update7CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update1Spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(update2Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update3Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update4Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update5Spinner)
                            .addComponent(update6Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update7Spinner, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(updateQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateQueryLabel)
                    .addComponent(updateTimeLabel))
                .addGap(0, 0, 0)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update4CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update4Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update5CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update5Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update6CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update6Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update7CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update7Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        deletePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deleting Queries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        deletePanel.setMaximumSize(new java.awt.Dimension(250, 250));
        deletePanel.setPreferredSize(new java.awt.Dimension(250, 250));

        deleteQueryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteQueryLabel.setText("Query");

        deleteTuplesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteTuplesLabel.setText("# of tuples");

        delete1CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete1CheckBox.setText("Delete from hpq_hh");
        delete1CheckBox.setFocusable(false);
        delete1CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete2CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete2CheckBox.setText("Delete from hpq_crop");
        delete2CheckBox.setFocusable(false);
        delete2CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete3CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete3CheckBox.setText("Delete from hpq_death");
        delete3CheckBox.setFocusable(false);
        delete3CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete4CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete4CheckBox.setText("Delete from hpq_aquaequip");
        delete4CheckBox.setFocusable(false);
        delete4CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete5CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete5CheckBox.setText("Delete from hpq_aquani");
        delete5CheckBox.setFocusable(false);
        delete5CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete6CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete6CheckBox.setText("Delete from hpq_mem");
        delete6CheckBox.setFocusable(false);
        delete6CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete7CheckBox.setBackground(new java.awt.Color(241, 241, 241));
        delete7CheckBox.setText("Delete from hpq_arcdp_mem");
        delete7CheckBox.setFocusable(false);
        delete7CheckBox.setPreferredSize(new java.awt.Dimension(103, 40));

        delete1Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        delete1Spinner.setMinimumSize(new java.awt.Dimension(30, 20));

        delete2Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        delete3Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        delete4Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        delete5Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        delete6Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        delete7Spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete2CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete1CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete3CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete4CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete5CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete6CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete7CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete1Spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(delete2Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete3Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete4Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete5Spinner)
                            .addComponent(delete6Spinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete7Spinner, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addComponent(deleteQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteTuplesLabel)))
                .addGap(14, 14, 14))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteTuplesLabel)
                    .addComponent(deleteQueryLabel))
                .addGap(0, 0, 0)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete4CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete4Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete5CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete5Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete6CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete6Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete7CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete7Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        footerPanel.setBackground(new java.awt.Color(255, 255, 255));

        startTransactionBtn.setBackground(new java.awt.Color(241, 241, 241));
        startTransactionBtn.setText("Start Transactions");

        marinduqueRadio.setText("Marinduque");

        palawanRadio.setText("Palawan");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(marinduqueRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(palawanRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTransactionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marinduqueRadio)
                    .addComponent(palawanRadio))
                .addContainerGap())
        );

        clientLogArea.setColumns(20);
        clientLogArea.setRows(5);
        jScrollPane2.setViewportView(clientLogArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(footerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(readPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updatePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(readPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup areaBtnGroup;
    private javax.swing.JTextArea clientLogArea;
    private javax.swing.JCheckBox delete1CheckBox;
    private javax.swing.JSpinner delete1Spinner;
    private javax.swing.JCheckBox delete2CheckBox;
    private javax.swing.JSpinner delete2Spinner;
    private javax.swing.JCheckBox delete3CheckBox;
    private javax.swing.JSpinner delete3Spinner;
    private javax.swing.JCheckBox delete4CheckBox;
    private javax.swing.JSpinner delete4Spinner;
    private javax.swing.JCheckBox delete5CheckBox;
    private javax.swing.JSpinner delete5Spinner;
    private javax.swing.JCheckBox delete6CheckBox;
    private javax.swing.JSpinner delete6Spinner;
    private javax.swing.JCheckBox delete7CheckBox;
    private javax.swing.JSpinner delete7Spinner;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel deleteQueryLabel;
    private javax.swing.JLabel deleteTuplesLabel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerTitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton marinduqueRadio;
    private javax.swing.JRadioButton palawanRadio;
    private javax.swing.JCheckBox read1CheckBox;
    private javax.swing.JSpinner read1Spinner;
    private javax.swing.JCheckBox read2CheckBox;
    private javax.swing.JSpinner read2Spinner;
    private javax.swing.JCheckBox read3CheckBox;
    private javax.swing.JSpinner read3Spinner;
    private javax.swing.JCheckBox read4CheckBox;
    private javax.swing.JSpinner read4Spinner;
    private javax.swing.JCheckBox read5CheckBox;
    private javax.swing.JSpinner read5Spinner;
    private javax.swing.JCheckBox read6CheckBox;
    private javax.swing.JSpinner read6Spinner;
    private javax.swing.JCheckBox read7CheckBox;
    private javax.swing.JSpinner read7Spinner;
    private javax.swing.JPanel readPanel;
    private javax.swing.JLabel readQueryLabel;
    private javax.swing.JLabel readTimesLabel;
    private javax.swing.JButton startTransactionBtn;
    private javax.swing.JCheckBox update1CheckBox;
    private javax.swing.JSpinner update1Spinner;
    private javax.swing.JCheckBox update2CheckBox;
    private javax.swing.JSpinner update2Spinner;
    private javax.swing.JCheckBox update3CheckBox;
    private javax.swing.JSpinner update3Spinner;
    private javax.swing.JCheckBox update4CheckBox;
    private javax.swing.JSpinner update4Spinner;
    private javax.swing.JCheckBox update5CheckBox;
    private javax.swing.JSpinner update5Spinner;
    private javax.swing.JCheckBox update6CheckBox;
    private javax.swing.JSpinner update6Spinner;
    private javax.swing.JCheckBox update7CheckBox;
    private javax.swing.JSpinner update7Spinner;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel updateQueryLabel;
    private javax.swing.JLabel updateTimeLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the delete1CheckBox
     */
    public javax.swing.JCheckBox getDelete1CheckBox() {
        return delete1CheckBox;
    }

    /**
     * @param delete1CheckBox the delete1CheckBox to set
     */
    public void setDelete1CheckBox(javax.swing.JCheckBox delete1CheckBox) {
        this.delete1CheckBox = delete1CheckBox;
    }

    /**
     * @return the delete1Spinner
     */
    public javax.swing.JSpinner getDelete1Spinner() {
        return delete1Spinner;
    }

    /**
     * @param delete1Spinner the delete1Spinner to set
     */
    public void setDelete1Spinner(javax.swing.JSpinner delete1Spinner) {
        this.delete1Spinner = delete1Spinner;
    }

    /**
     * @return the delete2CheckBox
     */
    public javax.swing.JCheckBox getDelete2CheckBox() {
        return delete2CheckBox;
    }

    /**
     * @param delete2CheckBox the delete2CheckBox to set
     */
    public void setDelete2CheckBox(javax.swing.JCheckBox delete2CheckBox) {
        this.delete2CheckBox = delete2CheckBox;
    }

    /**
     * @return the delete2Spinner
     */
    public javax.swing.JSpinner getDelete2Spinner() {
        return delete2Spinner;
    }

    /**
     * @param delete2Spinner the delete2Spinner to set
     */
    public void setDelete2Spinner(javax.swing.JSpinner delete2Spinner) {
        this.delete2Spinner = delete2Spinner;
    }

    /**
     * @return the delete3CheckBox
     */
    public javax.swing.JCheckBox getDelete3CheckBox() {
        return delete3CheckBox;
    }

    /**
     * @param delete3CheckBox the delete3CheckBox to set
     */
    public void setDelete3CheckBox(javax.swing.JCheckBox delete3CheckBox) {
        this.delete3CheckBox = delete3CheckBox;
    }

    /**
     * @return the delete3Spinner
     */
    public javax.swing.JSpinner getDelete3Spinner() {
        return delete3Spinner;
    }

    /**
     * @param delete3Spinner the delete3Spinner to set
     */
    public void setDelete3Spinner(javax.swing.JSpinner delete3Spinner) {
        this.delete3Spinner = delete3Spinner;
    }

    /**
     * @return the delete4CheckBox
     */
    public javax.swing.JCheckBox getDelete4CheckBox() {
        return delete4CheckBox;
    }

    /**
     * @param delete4CheckBox the delete4CheckBox to set
     */
    public void setDelete4CheckBox(javax.swing.JCheckBox delete4CheckBox) {
        this.delete4CheckBox = delete4CheckBox;
    }

    /**
     * @return the delete4Spinner
     */
    public javax.swing.JSpinner getDelete4Spinner() {
        return delete4Spinner;
    }

    /**
     * @param delete4Spinner the delete4Spinner to set
     */
    public void setDelete4Spinner(javax.swing.JSpinner delete4Spinner) {
        this.delete4Spinner = delete4Spinner;
    }

    /**
     * @return the delete5CheckBox
     */
    public javax.swing.JCheckBox getDelete5CheckBox() {
        return delete5CheckBox;
    }

    /**
     * @param delete5CheckBox the delete5CheckBox to set
     */
    public void setDelete5CheckBox(javax.swing.JCheckBox delete5CheckBox) {
        this.delete5CheckBox = delete5CheckBox;
    }

    /**
     * @return the delete5Spinner
     */
    public javax.swing.JSpinner getDelete5Spinner() {
        return delete5Spinner;
    }

    /**
     * @param delete5Spinner the delete5Spinner to set
     */
    public void setDelete5Spinner(javax.swing.JSpinner delete5Spinner) {
        this.delete5Spinner = delete5Spinner;
    }

    /**
     * @return the delete6CheckBox
     */
    public javax.swing.JCheckBox getDelete6CheckBox() {
        return delete6CheckBox;
    }

    /**
     * @param delete6CheckBox the delete6CheckBox to set
     */
    public void setDelete6CheckBox(javax.swing.JCheckBox delete6CheckBox) {
        this.delete6CheckBox = delete6CheckBox;
    }

    /**
     * @return the delete6Spinner
     */
    public javax.swing.JSpinner getDelete6Spinner() {
        return delete6Spinner;
    }

    /**
     * @param delete6Spinner the delete6Spinner to set
     */
    public void setDelete6Spinner(javax.swing.JSpinner delete6Spinner) {
        this.delete6Spinner = delete6Spinner;
    }

    /**
     * @return the delete7CheckBox
     */
    public javax.swing.JCheckBox getDelete7CheckBox() {
        return delete7CheckBox;
    }

    /**
     * @param delete7CheckBox the delete7CheckBox to set
     */
    public void setDelete7CheckBox(javax.swing.JCheckBox delete7CheckBox) {
        this.delete7CheckBox = delete7CheckBox;
    }

    /**
     * @return the delete7Spinner
     */
    public javax.swing.JSpinner getDelete7Spinner() {
        return delete7Spinner;
    }

    /**
     * @param delete7Spinner the delete7Spinner to set
     */
    public void setDelete7Spinner(javax.swing.JSpinner delete7Spinner) {
        this.delete7Spinner = delete7Spinner;
    }

    /**
     * @return the read1CheckBox
     */
    public javax.swing.JCheckBox getRead1CheckBox() {
        return read1CheckBox;
    }

    /**
     * @param read1CheckBox the read1CheckBox to set
     */
    public void setRead1CheckBox(javax.swing.JCheckBox read1CheckBox) {
        this.read1CheckBox = read1CheckBox;
    }

    /**
     * @return the read1Spinner
     */
    public javax.swing.JSpinner getRead1Spinner() {
        return read1Spinner;
    }

    /**
     * @param read1Spinner the read1Spinner to set
     */
    public void setRead1Spinner(javax.swing.JSpinner read1Spinner) {
        this.read1Spinner = read1Spinner;
    }

    /**
     * @return the read2CheckBox
     */
    public javax.swing.JCheckBox getRead2CheckBox() {
        return read2CheckBox;
    }

    /**
     * @param read2CheckBox the read2CheckBox to set
     */
    public void setRead2CheckBox(javax.swing.JCheckBox read2CheckBox) {
        this.read2CheckBox = read2CheckBox;
    }

    /**
     * @return the read2Spinner
     */
    public javax.swing.JSpinner getRead2Spinner() {
        return read2Spinner;
    }

    /**
     * @param read2Spinner the read2Spinner to set
     */
    public void setRead2Spinner(javax.swing.JSpinner read2Spinner) {
        this.read2Spinner = read2Spinner;
    }

    /**
     * @return the read3CheckBox
     */
    public javax.swing.JCheckBox getRead3CheckBox() {
        return read3CheckBox;
    }

    /**
     * @param read3CheckBox the read3CheckBox to set
     */
    public void setRead3CheckBox(javax.swing.JCheckBox read3CheckBox) {
        this.read3CheckBox = read3CheckBox;
    }

    /**
     * @return the read3Spinner
     */
    public javax.swing.JSpinner getRead3Spinner() {
        return read3Spinner;
    }

    /**
     * @param read3Spinner the read3Spinner to set
     */
    public void setRead3Spinner(javax.swing.JSpinner read3Spinner) {
        this.read3Spinner = read3Spinner;
    }

    /**
     * @return the read4CheckBox
     */
    public javax.swing.JCheckBox getRead4CheckBox() {
        return read4CheckBox;
    }

    /**
     * @param read4CheckBox the read4CheckBox to set
     */
    public void setRead4CheckBox(javax.swing.JCheckBox read4CheckBox) {
        this.read4CheckBox = read4CheckBox;
    }

    /**
     * @return the read4Spinner
     */
    public javax.swing.JSpinner getRead4Spinner() {
        return read4Spinner;
    }

    /**
     * @param read4Spinner the read4Spinner to set
     */
    public void setRead4Spinner(javax.swing.JSpinner read4Spinner) {
        this.read4Spinner = read4Spinner;
    }

    /**
     * @return the read5CheckBox
     */
    public javax.swing.JCheckBox getRead5CheckBox() {
        return read5CheckBox;
    }

    /**
     * @param read5CheckBox the read5CheckBox to set
     */
    public void setRead5CheckBox(javax.swing.JCheckBox read5CheckBox) {
        this.read5CheckBox = read5CheckBox;
    }

    /**
     * @return the read5Spinner
     */
    public javax.swing.JSpinner getRead5Spinner() {
        return read5Spinner;
    }

    /**
     * @param read5Spinner the read5Spinner to set
     */
    public void setRead5Spinner(javax.swing.JSpinner read5Spinner) {
        this.read5Spinner = read5Spinner;
    }

    /**
     * @return the read6CheckBox
     */
    public javax.swing.JCheckBox getRead6CheckBox() {
        return read6CheckBox;
    }

    /**
     * @param read6CheckBox the read6CheckBox to set
     */
    public void setRead6CheckBox(javax.swing.JCheckBox read6CheckBox) {
        this.read6CheckBox = read6CheckBox;
    }

    /**
     * @return the read6Spinner
     */
    public javax.swing.JSpinner getRead6Spinner() {
        return read6Spinner;
    }

    /**
     * @param read6Spinner the read6Spinner to set
     */
    public void setRead6Spinner(javax.swing.JSpinner read6Spinner) {
        this.read6Spinner = read6Spinner;
    }

    /**
     * @return the read7CheckBox
     */
    public javax.swing.JCheckBox getRead7CheckBox() {
        return read7CheckBox;
    }

    /**
     * @param read7CheckBox the read7CheckBox to set
     */
    public void setRead7CheckBox(javax.swing.JCheckBox read7CheckBox) {
        this.read7CheckBox = read7CheckBox;
    }

    /**
     * @return the read7Spinner
     */
    public javax.swing.JSpinner getRead7Spinner() {
        return read7Spinner;
    }

    /**
     * @param read7Spinner the read7Spinner to set
     */
    public void setRead7Spinner(javax.swing.JSpinner read7Spinner) {
        this.read7Spinner = read7Spinner;
    }

    /**
     * @return the startTransactionBtn
     */
    public javax.swing.JButton getStartTransactionBtn() {
        return startTransactionBtn;
    }

    /**
     * @param startTransactionBtn the startTransactionBtn to set
     */
    public void setStartTransactionBtn(javax.swing.JButton startTransactionBtn) {
        this.startTransactionBtn = startTransactionBtn;
    }

    /**
     * @return the update1CheckBox
     */
    public javax.swing.JCheckBox getUpdate1CheckBox() {
        return update1CheckBox;
    }

    /**
     * @param update1CheckBox the update1CheckBox to set
     */
    public void setUpdate1CheckBox(javax.swing.JCheckBox update1CheckBox) {
        this.update1CheckBox = update1CheckBox;
    }

    /**
     * @return the update1Spinner
     */
    public javax.swing.JSpinner getUpdate1Spinner() {
        return update1Spinner;
    }

    /**
     * @param update1Spinner the update1Spinner to set
     */
    public void setUpdate1Spinner(javax.swing.JSpinner update1Spinner) {
        this.update1Spinner = update1Spinner;
    }

    /**
     * @return the update2CheckBox
     */
    public javax.swing.JCheckBox getUpdate2CheckBox() {
        return update2CheckBox;
    }

    /**
     * @param update2CheckBox the update2CheckBox to set
     */
    public void setUpdate2CheckBox(javax.swing.JCheckBox update2CheckBox) {
        this.update2CheckBox = update2CheckBox;
    }

    /**
     * @return the update2Spinner
     */
    public javax.swing.JSpinner getUpdate2Spinner() {
        return update2Spinner;
    }

    /**
     * @param update2Spinner the update2Spinner to set
     */
    public void setUpdate2Spinner(javax.swing.JSpinner update2Spinner) {
        this.update2Spinner = update2Spinner;
    }

    /**
     * @return the update3CheckBox
     */
    public javax.swing.JCheckBox getUpdate3CheckBox() {
        return update3CheckBox;
    }

    /**
     * @param update3CheckBox the update3CheckBox to set
     */
    public void setUpdate3CheckBox(javax.swing.JCheckBox update3CheckBox) {
        this.update3CheckBox = update3CheckBox;
    }

    /**
     * @return the update3Spinner
     */
    public javax.swing.JSpinner getUpdate3Spinner() {
        return update3Spinner;
    }

    /**
     * @param update3Spinner the update3Spinner to set
     */
    public void setUpdate3Spinner(javax.swing.JSpinner update3Spinner) {
        this.update3Spinner = update3Spinner;
    }

    /**
     * @return the update4CheckBox
     */
    public javax.swing.JCheckBox getUpdate4CheckBox() {
        return update4CheckBox;
    }

    /**
     * @param update4CheckBox the update4CheckBox to set
     */
    public void setUpdate4CheckBox(javax.swing.JCheckBox update4CheckBox) {
        this.update4CheckBox = update4CheckBox;
    }

    /**
     * @return the update4Spinner
     */
    public javax.swing.JSpinner getUpdate4Spinner() {
        return update4Spinner;
    }

    /**
     * @param update4Spinner the update4Spinner to set
     */
    public void setUpdate4Spinner(javax.swing.JSpinner update4Spinner) {
        this.update4Spinner = update4Spinner;
    }

    /**
     * @return the update5CheckBox
     */
    public javax.swing.JCheckBox getUpdate5CheckBox() {
        return update5CheckBox;
    }

    /**
     * @param update5CheckBox the update5CheckBox to set
     */
    public void setUpdate5CheckBox(javax.swing.JCheckBox update5CheckBox) {
        this.update5CheckBox = update5CheckBox;
    }

    /**
     * @return the update5Spinner
     */
    public javax.swing.JSpinner getUpdate5Spinner() {
        return update5Spinner;
    }

    /**
     * @param update5Spinner the update5Spinner to set
     */
    public void setUpdate5Spinner(javax.swing.JSpinner update5Spinner) {
        this.update5Spinner = update5Spinner;
    }

    /**
     * @return the update6CheckBox
     */
    public javax.swing.JCheckBox getUpdate6CheckBox() {
        return update6CheckBox;
    }

    /**
     * @param update6CheckBox the update6CheckBox to set
     */
    public void setUpdate6CheckBox(javax.swing.JCheckBox update6CheckBox) {
        this.update6CheckBox = update6CheckBox;
    }

    /**
     * @return the update6Spinner
     */
    public javax.swing.JSpinner getUpdate6Spinner() {
        return update6Spinner;
    }

    /**
     * @param update6Spinner the update6Spinner to set
     */
    public void setUpdate6Spinner(javax.swing.JSpinner update6Spinner) {
        this.update6Spinner = update6Spinner;
    }

    /**
     * @return the update7CheckBox
     */
    public javax.swing.JCheckBox getUpdate7CheckBox() {
        return update7CheckBox;
    }

    /**
     * @param update7CheckBox the update7CheckBox to set
     */
    public void setUpdate7CheckBox(javax.swing.JCheckBox update7CheckBox) {
        this.update7CheckBox = update7CheckBox;
    }

    /**
     * @return the update7Spinner
     */
    public javax.swing.JSpinner getUpdate7Spinner() {
        return update7Spinner;
    }

    /**
     * @param update7Spinner the update7Spinner to set
     */
    public void setUpdate7Spinner(javax.swing.JSpinner update7Spinner) {
        this.update7Spinner = update7Spinner;
    }

    /**
     * @return the clientLogArea
     */
    public javax.swing.JTextArea getClientLogArea() {
        return clientLogArea;
    }

    /**
     * @param clientLogArea the clientLogPane to set
     */
    public void setClientLogArea(javax.swing.JTextArea clientLogPane) {
        this.clientLogArea = clientLogPane;
    }

    /**
     * @return the marinduqueRadio
     */
    public javax.swing.JRadioButton getMarinduqueRadio() {
        return marinduqueRadio;
    }

    /**
     * @return the palawanRadio
     */
    public javax.swing.JRadioButton getPalawanRadio() {
        return palawanRadio;
    }
}
