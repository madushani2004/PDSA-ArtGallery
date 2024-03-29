package assessment04;

import static assessment04.HomeArtist.art;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AddCommission extends javax.swing.JInternalFrame {

    private double sumCommission = 0;
    private double totalIncome = 0;
    private double totalPriceAmount = 0;
    private ArtWorkBinarySearchTree bst;

    public AddCommission(ArtWorkLinkedList art) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        bst = new ArtWorkBinarySearchTree();

        displayArtDetails();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalCommission = new javax.swing.JLabel();
        updatePriceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalInomes = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(631, 400));

        jPanel1.setBackground(new java.awt.Color(124, 152, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 400));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        grid.setBackground(new java.awt.Color(124, 152, 133));
        grid.setForeground(new java.awt.Color(255, 0, 51));
        grid.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(grid);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Income Amount Of Art Works              :");

        totalCommission.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalCommission.setForeground(new java.awt.Color(255, 255, 255));
        totalCommission.setText("0.0");

        updatePriceBtn.setBackground(new java.awt.Color(40, 102, 110));
        updatePriceBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updatePriceBtn.setForeground(new java.awt.Color(255, 255, 255));
        updatePriceBtn.setText("Update Prices");
        updatePriceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePriceBtnMouseClicked(evt);
            }
        });
        updatePriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePriceBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Commission Amount Of Art Works      :");

        totalInomes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalInomes.setForeground(new java.awt.Color(255, 255, 255));
        totalInomes.setText("0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalInomes)
                            .addComponent(totalCommission))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatePriceBtn)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(totalCommission))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(totalInomes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(updatePriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatePriceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePriceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePriceBtnMouseClicked

    private void updatePriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePriceBtnActionPerformed

        transferAndCalculate();
        //calculateTotalIncome();

        art.clear();
        grid.removeAll();
        
        grid.revalidate();
        grid.repaint();
        
        bst.inOrderTraversal(bst.root);

    }//GEN-LAST:event_updatePriceBtnActionPerformed

    public final void displayArtDetails() {
        ArtworkNode current = art.head;
        while (current != null) {
            String titleName = current.title;
            String artist = current.artist;
            double priceAmount = current.price;
            String newPrice = String.valueOf(priceAmount);
            String description = current.description;
            String imagePath = current.imagePath;

            artWork artNode = new artWork(); // Create a new instance of artWork for each artwork
            artNode.configure(titleName, artist, newPrice);

            grid.add(artNode);

            current = current.next;
        }
    }

    public void transferAndCalculate() {
        Component[] components = grid.getComponents();
        for (Component component : components) {
            if (component instanceof artWork) {
                artWork artwork = (artWork) component;
                JTextField commissionText = artwork.getCommissionField();
                JLabel priceLabel = artwork.getPrice();
                String price = priceLabel.getText().trim();
                String commissionValue = commissionText.getText().trim(); // Trim any leading or trailing whitespace

                JLabel titleLabel = artwork.getTitle();
                String myTitle = titleLabel.getText().trim();

                if (!commissionValue.isEmpty()) {
                    double commissionPercentage = Double.parseDouble(commissionValue);
                    double priceAmount = Double.parseDouble(price);
                    double commissionAmount = priceAmount * (commissionPercentage / 100);

                    calculateTotalPrice(priceAmount);
                    sumCommission += commissionAmount;
                    calculateTotalIncome();

                    ArtworkNode newSet = art.searchArtworkByTitle(myTitle);

                    String titleName = newSet.title;
                    String artist = newSet.artist;
                    double amount = newSet.price;
                    String description = newSet.description;
                    String imagePath = newSet.imagePath;

                    bst.insert(new ArtworkSet(artist, title, priceAmount, imagePath, description), commissionAmount);
                }

            }

        }

        totalCommission.setText(String.valueOf(sumCommission));

        grid.revalidate();
        grid.repaint();
    }

    public void calculateTotalIncome() {
        totalIncome = totalPriceAmount + sumCommission;
        totalInomes.setText(String.valueOf(totalIncome));
    }

    public void calculateTotalPrice(double price) {
        totalPriceAmount += price;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalCommission;
    private javax.swing.JLabel totalInomes;
    private javax.swing.JButton updatePriceBtn;
    // End of variables declaration//GEN-END:variables
}
