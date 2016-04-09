
package view;

public class View extends javax.swing.JFrame {

    public static View view = new View();
    
    
    private View() {
        initComponents();
    }

    public static View getInstance(){
        return view;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCoordinator = new javax.swing.JLabel();
        scrollpaneMarinduque = new javax.swing.JScrollPane();
        tableMarinduque = new javax.swing.JTable();
        scrollpaneCentral = new javax.swing.JScrollPane();
        tableCentral = new javax.swing.JTable();
        scrollpanePalawan = new javax.swing.JScrollPane();
        tablePalawan = new javax.swing.JTable();
        scrollpaneStatus = new javax.swing.JScrollPane();
        textpaneStatus = new javax.swing.JTextPane();
        labelMarinduque = new javax.swing.JLabel();
        labelCentral = new javax.swing.JLabel();
        labelPalawan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCoordinator.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCoordinator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCoordinator.setText("COORDINATOR");

        tableMarinduque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Query", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneMarinduque.setViewportView(tableMarinduque);

        tableCentral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Query", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneCentral.setViewportView(tableCentral);

        tablePalawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Query", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpanePalawan.setViewportView(tablePalawan);

        textpaneStatus.setEditable(false);
        scrollpaneStatus.setViewportView(textpaneStatus);

        labelMarinduque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarinduque.setText("Marinduque");

        labelCentral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCentral.setText("Central");

        labelPalawan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPalawan.setText("Palawan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCoordinator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollpaneStatus)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMarinduque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(scrollpaneMarinduque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollpaneCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(labelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollpanePalawan, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(labelPalawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelCoordinator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMarinduque, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(labelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPalawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpaneMarinduque, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollpanePalawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollpaneCentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpaneStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCentral;
    private javax.swing.JLabel labelCoordinator;
    private javax.swing.JLabel labelMarinduque;
    private javax.swing.JLabel labelPalawan;
    private javax.swing.JScrollPane scrollpaneCentral;
    private javax.swing.JScrollPane scrollpaneMarinduque;
    private javax.swing.JScrollPane scrollpanePalawan;
    private javax.swing.JScrollPane scrollpaneStatus;
    private javax.swing.JTable tableCentral;
    private javax.swing.JTable tableMarinduque;
    private javax.swing.JTable tablePalawan;
    private javax.swing.JTextPane textpaneStatus;
    // End of variables declaration//GEN-END:variables
}
