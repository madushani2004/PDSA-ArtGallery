package assessment04;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Logger;

public class Upload extends javax.swing.JInternalFrame {
    private String artName;
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
    public static ArtWorkLinkedList art = new ArtWorkLinkedList();

    public Upload(ArtWorkLinkedList art) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titletxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        artistName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        artPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        labelImage = new javax.swing.JLabel();
        selectfolder = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        uploadbtn1 = new javax.swing.JButton();
        uploadCancelbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(124, 152, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 400));

        titletxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setBackground(new java.awt.Color(246, 224, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Artist             :");

        artistName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistName.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Title               :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Price              :");

        artPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artPrice.setForeground(new java.awt.Color(102, 102, 102));
        artPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artPriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Description    :");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        labelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectfolder.setBackground(new java.awt.Color(40, 102, 110));
        selectfolder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectfolder.setForeground(new java.awt.Color(255, 255, 255));
        selectfolder.setText("Browse");
        selectfolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectfolderMouseClicked(evt);
            }
        });
        selectfolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectfolderActionPerformed(evt);
            }
        });

        imagePath.setMinimumSize(new java.awt.Dimension(64, 26));

        uploadbtn1.setBackground(new java.awt.Color(40, 102, 110));
        uploadbtn1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        uploadbtn1.setForeground(new java.awt.Color(255, 255, 255));
        uploadbtn1.setText("Upload");
        uploadbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadbtn1MouseClicked(evt);
            }
        });
        uploadbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtn1ActionPerformed(evt);
            }
        });

        uploadCancelbtn.setBackground(new java.awt.Color(40, 102, 110));
        uploadCancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        uploadCancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadCancelbtn.setText("Cancel");
        uploadCancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadCancelbtnMouseClicked(evt);
            }
        });
        uploadCancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadCancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(artPrice)
                                    .addComponent(titletxt1)
                                    .addComponent(artistName))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(uploadbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(selectfolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectfolder, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titletxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadCancelbtn)
                    .addComponent(uploadbtn1))
                .addGap(23, 23, 23))
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

    }//GEN-LAST:event_artPriceActionPerformed

    private void selectfolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectfolderMouseClicked

    }//GEN-LAST:event_selectfolderMouseClicked

    private boolean isValidImageFile(File file) {
        String fileName = file.getName();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png");
    }
    
    private void selectfolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectfolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        try {
            int load = fileChooser.showOpenDialog(null);

            if (load == JFileChooser.APPROVE_OPTION) {
                f = fileChooser.getSelectedFile();

                if (!isValidImageFile(f)) {
                    JOptionPane.showMessageDialog(this, "Please select a valid image file.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                path = f.getAbsolutePath();
                imagePath.setText(path);
                ImageIcon li = new ImageIcon(path);
                Image img = li.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                labelImage.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            Logger.getLogger(HomeArtist.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error in file selection.", "File Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selectfolderActionPerformed

    private void uploadbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadbtn1MouseClicked

    private void uploadbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtn1ActionPerformed
   
    }//GEN-LAST:event_uploadbtn1ActionPerformed

    private void uploadCancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadCancelbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadCancelbtnMouseClicked

    private void uploadCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadCancelbtnActionPerformed
       
    }//GEN-LAST:event_uploadCancelbtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artPrice;
    private javax.swing.JTextField artistName;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField imagePath;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JButton selectfolder;
    private javax.swing.JTextField titletxt1;
    private javax.swing.JButton uploadCancelbtn;
    private javax.swing.JButton uploadbtn1;
    // End of variables declaration//GEN-END:variables
}
