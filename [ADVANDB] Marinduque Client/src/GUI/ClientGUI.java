/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author Arces
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientGUI
     */
    public ClientGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marinduque Client");
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerTitleLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        headerTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTitleLabel.setText("Marinduque Client");

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
        read1Spinner.setMinimumSize(new java.awt.Dimension(31, 20));
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

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(startTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startTransactionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
}
