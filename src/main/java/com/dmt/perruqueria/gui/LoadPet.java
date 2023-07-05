package com.dmt.perruqueria.gui;

import com.dmt.perruqueria.logic.Controller;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class LoadPet extends javax.swing.JFrame {

    Controller controller = new Controller();

    public LoadPet() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelDataContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPetName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPetRace = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPetColor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbPetAllergi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbPetParticularAttn = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOwnerContact = new javax.swing.JTextField();
        btnLoadPet = new javax.swing.JPanel();
        lblButtonLoadPet = new javax.swing.JLabel();
        btnCleanForm = new javax.swing.JPanel();
        lblButtonCleanForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar Mascota");
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(251, 237, 236));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cargar Mascota");
        bg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 64));

        panelDataContainer.setBackground(new java.awt.Color(251, 237, 236));
        panelDataContainer.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        txtPetName.setBackground(new java.awt.Color(251, 237, 236));
        txtPetName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtPetName.setForeground(new java.awt.Color(0, 0, 0));
        txtPetName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Raza:");

        txtPetRace.setBackground(new java.awt.Color(251, 237, 236));
        txtPetRace.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtPetRace.setForeground(new java.awt.Color(0, 0, 0));
        txtPetRace.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color:");

        txtPetColor.setBackground(new java.awt.Color(251, 237, 236));
        txtPetColor.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtPetColor.setForeground(new java.awt.Color(0, 0, 0));
        txtPetColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Alérgico:");

        cmbPetAllergi.setBackground(new java.awt.Color(251, 237, 236));
        cmbPetAllergi.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbPetAllergi.setForeground(new java.awt.Color(0, 0, 0));
        cmbPetAllergi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        cmbPetAllergi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Atc. Especial:");

        cmbPetParticularAttn.setBackground(new java.awt.Color(251, 237, 236));
        cmbPetParticularAttn.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cmbPetParticularAttn.setForeground(new java.awt.Color(0, 0, 0));
        cmbPetParticularAttn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        cmbPetParticularAttn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dueño:");

        txtOwnerName.setBackground(new java.awt.Color(251, 237, 236));
        txtOwnerName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtOwnerName.setForeground(new java.awt.Color(0, 0, 0));
        txtOwnerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contacto:");

        txtOwnerContact.setBackground(new java.awt.Color(251, 237, 236));
        txtOwnerContact.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtOwnerContact.setForeground(new java.awt.Color(0, 0, 0));
        txtOwnerContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        javax.swing.GroupLayout panelDataContainerLayout = new javax.swing.GroupLayout(panelDataContainer);
        panelDataContainer.setLayout(panelDataContainerLayout);
        panelDataContainerLayout.setHorizontalGroup(
            panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataContainerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPetName))
                    .addGroup(panelDataContainerLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPetColor))
                    .addGroup(panelDataContainerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPetRace))
                    .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataContainerLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(6, 6, 6)
                            .addComponent(cmbPetParticularAttn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(146, 146, 146))
                        .addGroup(panelDataContainerLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbPetAllergi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDataContainerLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOwnerName))
                    .addGroup(panelDataContainerLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOwnerContact, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelDataContainerLayout.setVerticalGroup(
            panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPetRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPetColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPetAllergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPetParticularAttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOwnerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        bg.add(panelDataContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 96, 370, 320));

        btnLoadPet.setBackground(new java.awt.Color(251, 237, 236));
        btnLoadPet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));
        btnLoadPet.setForeground(new java.awt.Color(0, 0, 0));
        btnLoadPet.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblButtonLoadPet.setBackground(new java.awt.Color(251, 237, 236));
        lblButtonLoadPet.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblButtonLoadPet.setForeground(new java.awt.Color(0, 0, 0));
        lblButtonLoadPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonLoadPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Icon.png"))); // NOI18N
        lblButtonLoadPet.setText("  Guardar");
        lblButtonLoadPet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonLoadPet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonLoadPetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonLoadPetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonLoadPetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLoadPetLayout = new javax.swing.GroupLayout(btnLoadPet);
        btnLoadPet.setLayout(btnLoadPetLayout);
        btnLoadPetLayout.setHorizontalGroup(
            btnLoadPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonLoadPet, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        btnLoadPetLayout.setVerticalGroup(
            btnLoadPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonLoadPet, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bg.add(btnLoadPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 428, 146, 36));

        btnCleanForm.setBackground(new java.awt.Color(251, 237, 236));
        btnCleanForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));
        btnCleanForm.setForeground(new java.awt.Color(0, 0, 0));
        btnCleanForm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblButtonCleanForm.setBackground(new java.awt.Color(251, 237, 236));
        lblButtonCleanForm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblButtonCleanForm.setForeground(new java.awt.Color(0, 0, 0));
        lblButtonCleanForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonCleanForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clean-Icon.png"))); // NOI18N
        lblButtonCleanForm.setText("  Limpiar");
        lblButtonCleanForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonCleanForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonCleanFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonCleanFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonCleanFormMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCleanFormLayout = new javax.swing.GroupLayout(btnCleanForm);
        btnCleanForm.setLayout(btnCleanFormLayout);
        btnCleanFormLayout.setHorizontalGroup(
            btnCleanFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonCleanForm, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        btnCleanFormLayout.setVerticalGroup(
            btnCleanFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonCleanForm, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bg.add(btnCleanForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 428, 146, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonLoadPetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadPetMouseClicked
        String petName = txtPetName.getText();
        String petRace = txtPetRace.getText();
        String petColor = txtPetColor.getText();
        String petAllergi = (String) cmbPetAllergi.getSelectedItem();
        String petParticularAttn = (String) cmbPetParticularAttn.getSelectedItem();

        String ownerName = txtOwnerName.getText();
        String ownerContact = txtOwnerContact.getText();

        if (!isEmptyInputs()) {
            controller.save(petName, petRace, petColor, petAllergi, petParticularAttn, ownerName, ownerContact);

            clearInputs();
            showMessage("Los datos han sido cargado con éxito en nuestra base de datos.", "Info", "Guardar - Éxito");
        } else {
            showMessage("Existen campos vacio, todos los campos son obligatorios", "Error", "Guardar - Error");
        }
    }//GEN-LAST:event_lblButtonLoadPetMouseClicked

    private void lblButtonLoadPetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadPetMouseEntered
        btnLoadPet.setBackground(new Color(232, 185, 169));
        lblButtonLoadPet.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonLoadPetMouseEntered

    private void lblButtonLoadPetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonLoadPetMouseExited
        btnLoadPet.setBackground(new Color(251, 237, 236));
        lblButtonLoadPet.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonLoadPetMouseExited

    private void lblButtonCleanFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonCleanFormMouseClicked
        clearInputs();
    }//GEN-LAST:event_lblButtonCleanFormMouseClicked

    private void lblButtonCleanFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonCleanFormMouseEntered
        btnCleanForm.setBackground(new Color(232, 185, 169));
        lblButtonCleanForm.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonCleanFormMouseEntered

    private void lblButtonCleanFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonCleanFormMouseExited
        btnCleanForm.setBackground(new Color(251, 237, 236));
        lblButtonCleanForm.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonCleanFormMouseExited

    private boolean isEmptyInputs() {
        if (txtPetName.getText().equalsIgnoreCase("")
                || txtPetRace.getText().equalsIgnoreCase("")
                || txtPetColor.getText().equalsIgnoreCase("")
                || txtOwnerName.getText().equalsIgnoreCase("")
                || txtOwnerContact.getText().equalsIgnoreCase("")) {
            return true;
        }
        return false;
    }

    private void showMessage(String msg, String type, String title) {
        JOptionPane optionPane = new JOptionPane(msg);
        if (type.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (type.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void clearInputs() {
        txtPetName.setText("");
        txtPetRace.setText("");
        txtPetColor.setText("");
        txtOwnerName.setText("");
        txtOwnerContact.setText("");
        cmbPetAllergi.setSelectedIndex(0);
        cmbPetParticularAttn.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCleanForm;
    private javax.swing.JPanel btnLoadPet;
    private javax.swing.JComboBox<String> cmbPetAllergi;
    private javax.swing.JComboBox<String> cmbPetParticularAttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblButtonCleanForm;
    private javax.swing.JLabel lblButtonLoadPet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelDataContainer;
    private javax.swing.JTextField txtOwnerContact;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtPetColor;
    private javax.swing.JTextField txtPetName;
    private javax.swing.JTextField txtPetRace;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/PawIcon-32x32.png")));
    }
}
