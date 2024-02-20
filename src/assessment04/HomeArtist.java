package assessment04;


import java.awt.Color;
import javax.swing.JInternalFrame;

public class HomeArtist extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    
    public static ArtWorkLinkedList art = new ArtWorkLinkedList();

    public HomeArtist() {
        initComponents();

        DefaultColor = new Color(40, 102, 110);
        ClickedColor = new Color(124, 152, 133);

        uploadArtwork.setBackground(ClickedColor);
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

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
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
       Upload upload = new Upload(art);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(upload).setVisible(true);
    }//GEN-LAST:event_uploadArtworkMouseClicked

    private void updateRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRemoveMouseClicked
        UpdateRemove remove = new UpdateRemove(art);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(remove).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_updateRemoveMouseClicked

    private void addCommisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCommisionMouseClicked
        AddCommission commission = new AddCommission();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(commission).setVisible(true);
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel updateRemove;
    private javax.swing.JPanel uploadArtwork;
    // End of variables declaration//GEN-END:variables
}
