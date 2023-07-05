package com.dmt.perruqueria.gui;

import com.dmt.perruqueria.logic.Controller;
import com.dmt.perruqueria.logic.Pet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ReadPet extends javax.swing.JFrame {

    Controller controller = null;

    public ReadPet() {
        controller = new Controller();
        initComponents();
        setIcon();
        setTableStyle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelTableDataPets = new javax.swing.JScrollPane();
        tableDataPets = new javax.swing.JTable();
        btnDeletePet = new javax.swing.JPanel();
        lblButtonDeletePet = new javax.swing.JLabel();
        btnUpdatePet = new javax.swing.JPanel();
        lblButtonUpdatePet = new javax.swing.JLabel();
        StickerImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Mascotas");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(251, 237, 236));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Nuestras Mascotas");
        bg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 64));

        panelTableDataPets.setBorder(null);

        tableDataPets.setBackground(new java.awt.Color(251, 237, 236));
        tableDataPets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));
        tableDataPets.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        tableDataPets.setForeground(new java.awt.Color(0, 0, 0));
        tableDataPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableDataPets.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableDataPets.setFillsViewportHeight(true);
        tableDataPets.setFocusable(false);
        tableDataPets.setGridColor(new java.awt.Color(232, 185, 169));
        tableDataPets.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableDataPets.setRowHeight(24);
        tableDataPets.setSelectionBackground(new java.awt.Color(232, 185, 169));
        tableDataPets.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableDataPets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDataPets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tableDataPets.setShowGrid(false);
        tableDataPets.setShowHorizontalLines(true);
        tableDataPets.setShowVerticalLines(false);
        tableDataPets.getTableHeader().setReorderingAllowed(false);
        panelTableDataPets.setViewportView(tableDataPets);

        bg.add(panelTableDataPets, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 96, 1140, 520));

        btnDeletePet.setBackground(new java.awt.Color(251, 237, 236));
        btnDeletePet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        lblButtonDeletePet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonDeletePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trash-Icon.png"))); // NOI18N
        lblButtonDeletePet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonDeletePet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonDeletePetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonDeletePetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonDeletePetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDeletePetLayout = new javax.swing.GroupLayout(btnDeletePet);
        btnDeletePet.setLayout(btnDeletePetLayout);
        btnDeletePetLayout.setHorizontalGroup(
            btnDeletePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonDeletePet, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        btnDeletePetLayout.setVerticalGroup(
            btnDeletePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonDeletePet, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bg.add(btnDeletePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 64, 36));

        btnUpdatePet.setBackground(new java.awt.Color(251, 237, 236));
        btnUpdatePet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 185, 169), 1, true));

        lblButtonUpdatePet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonUpdatePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit-Icon.png"))); // NOI18N
        lblButtonUpdatePet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblButtonUpdatePet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonUpdatePetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonUpdatePetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonUpdatePetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUpdatePetLayout = new javax.swing.GroupLayout(btnUpdatePet);
        btnUpdatePet.setLayout(btnUpdatePetLayout);
        btnUpdatePetLayout.setHorizontalGroup(
            btnUpdatePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonUpdatePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnUpdatePetLayout.setVerticalGroup(
            btnUpdatePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblButtonUpdatePet, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bg.add(btnUpdatePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, 64, 36));

        StickerImage.setBackground(new java.awt.Color(251, 237, 236));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sticker-1.png"))); // NOI18N

        javax.swing.GroupLayout StickerImageLayout = new javax.swing.GroupLayout(StickerImage);
        StickerImage.setLayout(StickerImageLayout);
        StickerImageLayout.setHorizontalGroup(
            StickerImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        StickerImageLayout.setVerticalGroup(
            StickerImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        bg.add(StickerImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 510, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonDeletePetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonDeletePetMouseClicked
        if (tableDataPets.getRowCount() > 0) {
            if (tableDataPets.getSelectedRow() != -1) {
                int petClientNum = Integer.parseInt(String.valueOf(tableDataPets.getValueAt(tableDataPets.getSelectedRow(), 0)));

                controller.deletePet(petClientNum);

                showMessage("La mascota ha sido eliminada exitosamente", "Info", "Eliminar - Éxito");

                loadTableModel();
            } else {
                showMessage("Debe seleccionar una mascota para realizar una eliminación", "Error", "Eliminar - Error");
            }
        } else {
            showMessage("La tabla se encuentra vacia", "Error", "Eliminar - Error");
        }
    }//GEN-LAST:event_lblButtonDeletePetMouseClicked

    private void lblButtonDeletePetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonDeletePetMouseEntered
        btnDeletePet.setBackground(new Color(232, 185, 169));
        lblButtonDeletePet.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonDeletePetMouseEntered

    private void lblButtonDeletePetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonDeletePetMouseExited
        btnDeletePet.setBackground(new Color(251, 237, 236));
        lblButtonDeletePet.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonDeletePetMouseExited

    private void lblButtonUpdatePetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonUpdatePetMouseClicked
        if (tableDataPets.getRowCount() > 0) {
            if (tableDataPets.getSelectedRow() != -1) {
                int petClientNum = Integer.parseInt(String.valueOf(tableDataPets.getValueAt(tableDataPets.getSelectedRow(), 0)));

                UpdatePet updatePetView = new UpdatePet(petClientNum);
                updatePetView.setVisible(true);
                updatePetView.setLocationRelativeTo(null);

                this.dispose();
            } else {
                showMessage("Debe seleccionar una mascota para realizar una modificación", "Error", "Modificar - Error");
            }
        } else {
            showMessage("La tabla se encuentra vacia", "Error", "Modificar - Error");
        }
    }//GEN-LAST:event_lblButtonUpdatePetMouseClicked

    private void lblButtonUpdatePetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonUpdatePetMouseEntered
        btnUpdatePet.setBackground(new Color(232, 185, 169));
        lblButtonUpdatePet.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblButtonUpdatePetMouseEntered

    private void lblButtonUpdatePetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonUpdatePetMouseExited
        btnUpdatePet.setBackground(new Color(251, 237, 236));
        lblButtonUpdatePet.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblButtonUpdatePetMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadTableModel();
    }//GEN-LAST:event_formWindowOpened

    private void loadTableModel() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String headers[] = {"Cliente N°", "Nombre", "Color", "Raza", "Alérgico", "Atc. Esp.", "Dueño", "Contacto"};
        tableModel.setColumnIdentifiers(headers);

        List<Pet> pets = controller.findAllPets();

        if (pets != null) {
            for (Pet pet : pets) {
                Object[] obj = {pet.getPetClientNum(), pet.getPetName(), pet.getPetColor(), pet.getPetRace(),
                    pet.getPetAllergi(),
                    pet.getPetParticularAttn(),
                    pet.getPetOwner().getOwnerName(),
                    pet.getPetOwner().getOwnerContact()};

                tableModel.addRow(obj);
            }
        }

        tableDataPets.setModel(tableModel);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StickerImage;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnDeletePet;
    private javax.swing.JPanel btnUpdatePet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblButtonDeletePet;
    private javax.swing.JLabel lblButtonUpdatePet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane panelTableDataPets;
    private javax.swing.JTable tableDataPets;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/PawIcon-32x32.png")));
    }

    private void setTableStyle() {
        tableDataPets.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 11));
        tableDataPets.getTableHeader().setOpaque(false);
        tableDataPets.getTableHeader().setBackground(new Color(251, 237, 236));
        tableDataPets.getTableHeader().setForeground(Color.BLACK);
        tableDataPets.setRowHeight(24);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tableDataPets.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
