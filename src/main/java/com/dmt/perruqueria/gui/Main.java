package com.dmt.perruqueria.gui;

import java.awt.Color;
import java.awt.Toolkit;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLoadForm = new javax.swing.JPanel();
        lblButtonLoadForm = new javax.swing.JLabel();
        btnReadForm = new javax.swing.JPanel();
        lblButtonReadForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perruqueria");
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(251, 237, 236));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perruqueria.png"))); // NOI18N
        bg.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 500, 500));

        lblTitle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Perruqueria");
        bg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        btnLoadForm.setBackground(new java.awt.Color(251, 237, 236));
        btnLoadForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));
        btnLoadForm.setForeground(new java.awt.Color(0, 0, 0));
        btnLoadForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblButtonLoadForm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblButtonLoadForm.setForeground(new java.awt.Color(0, 0, 0));
        lblButtonLoadForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonLoadForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Icon.png"))); // NOI18N
        lblButtonLoadForm.setText("  Cargar Mascota");
        lblButtonLoadForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonLoadFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonLoadFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonLoadFormMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLoadFormLayout = new javax.swing.GroupLayout(btnLoadForm);
        btnLoadForm.setLayout(btnLoadFormLayout);
        btnLoadFormLayout.setHorizontalGroup(
            btnLoadFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonLoadForm, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnLoadFormLayout.setVerticalGroup(
            btnLoadFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonLoadForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(btnLoadForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 180, 252, 48));

        btnReadForm.setBackground(new java.awt.Color(251, 237, 236));
        btnReadForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        lblButtonReadForm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblButtonReadForm.setForeground(new java.awt.Color(0, 0, 0));
        lblButtonReadForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonReadForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Read-Icon.png"))); // NOI18N
        lblButtonReadForm.setText("  Ver Mascotas");
        lblButtonReadForm.setToolTipText("");
        lblButtonReadForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonReadForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonReadFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonReadFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonReadFormMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReadFormLayout = new javax.swing.GroupLayout(btnReadForm);
        btnReadForm.setLayout(btnReadFormLayout);
        btnReadFormLayout.setHorizontalGroup(
            btnReadFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonReadForm, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnReadFormLayout.setVerticalGroup(
            btnReadFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonReadForm, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        bg.add(btnReadForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 252, 252, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonLoadFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadFormMouseClicked
        LoadPet loadPetView = new LoadPet();
        loadPetView.setVisible(true);
        loadPetView.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblButtonLoadFormMouseClicked

    private void lblButtonLoadFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadFormMouseEntered
        btnLoadForm.setBackground(new Color(232, 185, 169));
        lblButtonLoadForm.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonLoadFormMouseEntered

    private void lblButtonLoadFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadFormMouseExited
        btnLoadForm.setBackground(new Color(251, 237, 236));
        lblButtonLoadForm.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonLoadFormMouseExited

    private void lblButtonReadFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonReadFormMouseClicked
        ReadPet readPetView = new ReadPet();
        readPetView.setVisible(true);
        readPetView.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblButtonReadFormMouseClicked

    private void lblButtonReadFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonReadFormMouseEntered
        btnReadForm.setBackground(new Color(232, 185, 169));
        lblButtonReadForm.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonReadFormMouseEntered

    private void lblButtonReadFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonReadFormMouseExited
        btnReadForm.setBackground(new Color(251, 237, 236));
        lblButtonReadForm.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonReadFormMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnLoadForm;
    private javax.swing.JPanel btnReadForm;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lblButtonLoadForm;
    private javax.swing.JLabel lblButtonReadForm;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/PawIcon-32x32.png")));
    }
}
