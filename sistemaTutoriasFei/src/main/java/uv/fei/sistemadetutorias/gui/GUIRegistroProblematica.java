/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.gui;

import javax.swing.JOptionPane;
import uv.fei.sistemadetutorias.bussinesslogic.ProblematicaDAO;
import uv.fei.sistemadetutorias.domain.Problematica;

/**
 *
 * @author Zinedinne
 */
public class GUIRegistroProblematica extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIRegistroProblematica
     */
    public GUIRegistroProblematica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSesion = new javax.swing.ButtonGroup();
        labelRegistroProblematica = new javax.swing.JLabel();
        labelSesion = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        btnGuardarProblematica = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(labelRegistroProblematica, "Registro de problemática"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelSesion, "Sesión"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelTitulo, "Título"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelDescripcion, "Descripción"); // NOI18N

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        jScrollPane1.setViewportView(taDescripcion);

        rbgSesion.add(rb1);
        org.openide.awt.Mnemonics.setLocalizedText(rb1, "1"); // NOI18N

        rbgSesion.add(rb2);
        org.openide.awt.Mnemonics.setLocalizedText(rb2, "2"); // NOI18N
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rbgSesion.add(rb3);
        org.openide.awt.Mnemonics.setLocalizedText(rb3, "3"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnGuardarProblematica, "Guardar Problemática"); // NOI18N
        btnGuardarProblematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProblematicaActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnSalir, "Salir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRegistroProblematica)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(labelDescripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarProblematica)
                                .addGap(37, 37, 37)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSesion)
                                    .addComponent(labelTitulo))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb1)
                                        .addGap(30, 30, 30)
                                        .addComponent(rb2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rb3))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistroProblematica)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSesion)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProblematica)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarProblematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProblematicaActionPerformed
        ProblematicaDAO dao = new ProblematicaDAO();
        Problematica problematica = new Problematica();
        if (rb1.isSelected()){
            problematica.setIdSesion(1);
            }
        if (rb2.isSelected()){
            problematica.setIdSesion(2);
            }
        if (rb3.isSelected()){
            problematica.setIdSesion(3);
            }
        
        problematica.setTitulo(tfTitulo.getText());
        problematica.setDescripcion(taDescripcion.getText());
        
        dao.insertarProblematica(problematica);
        JOptionPane.showMessageDialog(this, "Se guarda la problemática");
    }//GEN-LAST:event_btnGuardarProblematicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarProblematica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelRegistroProblematica;
    private javax.swing.JLabel labelSesion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.ButtonGroup rbgSesion;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}