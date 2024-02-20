package assessment04;

import static assessment04.HomeArtist.art;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class UpdateRemove extends javax.swing.JInternalFrame {

    public UpdateRemove(ArtWorkLinkedList art) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        artistName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        titletxt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        artPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        removebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        path = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(124, 152, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 400));

        jLabel8.setBackground(new java.awt.Color(246, 224, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Artist ");

        artistName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistName.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Title");

        titletxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Price");

        artPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artPrice.setForeground(new java.awt.Color(102, 102, 102));
        artPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artPriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Description");

        desc.setColumns(5);
        desc.setRows(2);
        desc.setTabSize(5);
        desc.setMinimumSize(new java.awt.Dimension(200, 20));
        desc.setPreferredSize(new java.awt.Dimension(200, 84));
        jScrollPane1.setViewportView(desc);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Image Path");

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\STZ\\Downloads\\9004762_search_find_zoom_magnifier_icon (1).png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        removebtn.setBackground(new java.awt.Color(40, 102, 110));
        removebtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        removebtn.setForeground(new java.awt.Color(255, 255, 255));
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(40, 102, 110));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(40, 102, 110));
        cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        path.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        path.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(titletxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(artistName))))
                                .addComponent(jLabel5))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(updatebtn)
                            .addGap(70, 70, 70)
                            .addComponent(removebtn)
                            .addGap(80, 80, 80)
                            .addComponent(cancelbtn))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titletxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn)
                    .addComponent(removebtn)
                    .addComponent(cancelbtn))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artPriceActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
      
    }//GEN-LAST:event_searchFieldActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        if (artistName.getText().isEmpty() || artPrice.getText().isEmpty()
                || titletxt1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!titletxt1.getText().matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid title format. Please enter a title with only alphabetic characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if numeric fields contain valid numeric values
        if (!isNumeric(artPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if the price is a valid double value
        try {
            Double.parseDouble(artPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (desc.getText().isEmpty() || path == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String title = titletxt1.getText();
        String artist = artistName.getText();
        String description = desc.getText();
        double price = Double.parseDouble(artPrice.getText());
        String imgPath = path.getText();
        
        art.removeArtwork(title);
        art.displayArtworks();

    }//GEN-LAST:event_removebtnActionPerformed
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        if (artistName.getText().isEmpty() || artPrice.getText().isEmpty()
                || titletxt1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!titletxt1.getText().matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid title format. Please enter a title with only alphabetic characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if numeric fields contain valid numeric values
        if (!isNumeric(artPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if the price is a valid double value
        try {
            Double.parseDouble(artPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (desc.getText().isEmpty() || path == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String title = titletxt1.getText();
        String artist = artistName.getText();
        String description = desc.getText();
        double price = Double.parseDouble(artPrice.getText());
        String imgPath = path.getText();
        
        

        art.updateArtworkDetails(title, title, artist, price, description, imgPath);
        art.displayArtworks();
        artistName.setText("");
        artPrice.setText("");
        desc.setText("");
        path.setText("");
        titletxt1.setText("");
    }//GEN-LAST:event_updatebtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        artistName.setText("");
        artPrice.setText("");
        desc.setText("");
        path.setText("");
        titletxt1.setText("");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String search = searchField.getText();
        ArtworkNode artWork = art.searchArtworkByTitle(search);
        displayArtworkDetails(artWork);
        

    }//GEN-LAST:event_jLabel1MouseClicked

    private void displayArtworkDetails(ArtworkNode artwork) {
        // Populate the fields with artwork details
        if (artwork != null) {
            titletxt1.setText(artwork.title);
            artistName.setText(artwork.artist);
            artPrice.setText(String.valueOf(artwork.price));
            desc.setText(artwork.description);
            path.setText(artwork.imagePath);
        } else {
            System.out.println("List is empty");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artPrice;
    private javax.swing.JTextField artistName;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField path;
    private javax.swing.JButton removebtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField titletxt1;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
