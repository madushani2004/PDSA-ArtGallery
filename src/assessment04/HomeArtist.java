package assessment04;

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
import java.awt.Color;

public class HomeArtist extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    private String artName;
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
    public static ArtWorkLinkedList art = new ArtWorkLinkedList();

    public HomeArtist() {
        initComponents();

        DefaultColor = new Color(40, 102, 110);
        ClickedColor = new Color(124, 152, 133);

        uploadArtwork.setBackground(DefaultColor);
        updateRemove.setBackground(DefaultColor);
        addCommision.setBackground(DefaultColor);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        uploadArtwork = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateRemove = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addCommision = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        artistName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        artPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titletxt1 = new javax.swing.JTextField();
        imagePath = new javax.swing.JTextField();
        selectfolder = new javax.swing.JButton();
        uploadbtn1 = new javax.swing.JButton();
        uploadCancelbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(124, 152, 133));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(3, 63, 99));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        uploadArtwork.setBackground(new java.awt.Color(40, 102, 110));
        uploadArtwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadArtworkMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uploadArtworkMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(40, 102, 110));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Upload Art Work");

        javax.swing.GroupLayout uploadArtworkLayout = new javax.swing.GroupLayout(uploadArtwork);
        uploadArtwork.setLayout(uploadArtworkLayout);
        uploadArtworkLayout.setHorizontalGroup(
            uploadArtworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadArtworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        uploadArtworkLayout.setVerticalGroup(
            uploadArtworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadArtworkLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        updateRemove.setBackground(new java.awt.Color(40, 102, 110));
        updateRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateRemoveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateRemoveMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(10, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update  & Remove");

        javax.swing.GroupLayout updateRemoveLayout = new javax.swing.GroupLayout(updateRemove);
        updateRemove.setLayout(updateRemoveLayout);
        updateRemoveLayout.setHorizontalGroup(
            updateRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateRemoveLayout.setVerticalGroup(
            updateRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        addCommision.setBackground(new java.awt.Color(40, 102, 110));
        addCommision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCommisionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addCommisionMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(10, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Commision ");

        javax.swing.GroupLayout addCommisionLayout = new javax.swing.GroupLayout(addCommision);
        addCommision.setLayout(addCommisionLayout);
        addCommisionLayout.setHorizontalGroup(
            addCommisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCommisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addCommisionLayout.setVerticalGroup(
            addCommisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCommisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uploadArtwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addCommision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadArtwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addCommision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 410));

        jPanel2.setBackground(new java.awt.Color(3, 63, 99));

        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Art Gallery");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel6)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 90));

        jDesktopPane1.setBackground(new java.awt.Color(124, 152, 133));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Title               :");

        artistName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistName.setForeground(new java.awt.Color(102, 102, 102));

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

        labelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(246, 224, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Artist             :");

        titletxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt1.setForeground(new java.awt.Color(102, 102, 102));

        imagePath.setMinimumSize(new java.awt.Dimension(64, 26));

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

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(artistName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(artPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(titletxt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(imagePath, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(selectfolder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(uploadbtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(uploadCancelbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(artPrice)
                                    .addComponent(titletxt1)
                                    .addComponent(artistName))
                                .addGap(18, 18, 18))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(uploadbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(selectfolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectfolder, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titletxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadCancelbtn)
                    .addComponent(uploadbtn1))
                .addGap(23, 23, 23))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 630, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void artPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artPriceActionPerformed

    private void selectfolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectfolderMouseClicked
        // TODO add your handling code here:
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


    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void uploadbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadbtn1MouseClicked
         // TODO add your handling code here:
    }//GEN-LAST:event_uploadbtn1MouseClicked

    private void uploadbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtn1ActionPerformed

        if (artistName.getText().isEmpty() || artPrice.getText().isEmpty()
            || titletxt1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if the title contains only alphabetic characters
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
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (desc.getText().isEmpty() || path == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

         
        try {
            String title = titletxt1.getText();
            String artist = artistName.getText();
            String description = desc.getText();
            
            double price = Double.parseDouble(artPrice.getText());

            File f = new File(path);
            InputStream is = new FileInputStream(f);
            
            
            art.addArtwork(title, artist, price,description,path);
            art.displayArtworks();
            //UpdateRemove search = new UpdateRemove(art);
            
            
            artistName.setText("");
            artPrice.setText("");
            desc.setText("");
            imagePath.setText("");
            titletxt1.setText("");
            labelImage.setIcon(null);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeArtist.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "File not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_uploadbtn1ActionPerformed

    private void uploadCancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadCancelbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadCancelbtnMouseClicked

    private void uploadCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_uploadCancelbtnActionPerformed
        artistName.setText("");
        artPrice.setText("");
        desc.setText("");
        imagePath.setText("");
        artistName.setText("");
        labelImage.setIcon(null);
       

    }//GEN-LAST:event_uploadCancelbtnActionPerformed

    private void uploadArtworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadArtworkMousePressed
        uploadArtwork.setBackground(ClickedColor);
        updateRemove.setBackground(DefaultColor);
        addCommision.setBackground(DefaultColor);
    }//GEN-LAST:event_uploadArtworkMousePressed

    private void updateRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRemoveMousePressed
        uploadArtwork.setBackground(DefaultColor);
        updateRemove.setBackground(ClickedColor);
        addCommision.setBackground(DefaultColor);
    }//GEN-LAST:event_updateRemoveMousePressed

    private void addCommisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCommisionMousePressed
        uploadArtwork.setBackground(DefaultColor);
        updateRemove.setBackground(DefaultColor);
        addCommision.setBackground(ClickedColor);
    }//GEN-LAST:event_addCommisionMousePressed

    private void uploadArtworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadArtworkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadArtworkMouseClicked

    private void updateRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRemoveMouseClicked
        UpdateRemove remove = new UpdateRemove(art);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(remove).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_updateRemoveMouseClicked

    private void addCommisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCommisionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addCommisionMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeArtist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCommision;
    private javax.swing.JTextField artPrice;
    private javax.swing.JTextField artistName;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField imagePath;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JButton selectfolder;
    private javax.swing.JTextField titletxt1;
    private javax.swing.JPanel updateRemove;
    private javax.swing.JPanel uploadArtwork;
    private javax.swing.JButton uploadCancelbtn;
    private javax.swing.JButton uploadbtn1;
    // End of variables declaration//GEN-END:variables
}
