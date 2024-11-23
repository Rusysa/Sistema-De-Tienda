/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.awt.Dimension;
import controlador.ctrl_cliennte;
import javax.swing.JOptionPane;
import modelo.Cliente;
public class NuevoClienteInternal extends javax.swing.JInternalFrame {

    public NuevoClienteInternal() {
        initComponents();
        this.setTitle("Nuevo Cliente");
        this.setSize(new Dimension(600,400));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Apellido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 112, -1, -1));

        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 161, -1, -1));

        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 216, -1, -1));

        jLabel4.setText("Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 276, -1, -1));

        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 60, -1, -1));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 113, 50));

        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 60, 103, -1));

        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 109, 103, -1));

        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 158, 103, -1));

        jTextField4.setToolTipText("");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 213, 103, -1));

        jTextField5.setToolTipText("");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 273, 103, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nuevo Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 13, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.NuevoCliente();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void NuevoCliente() {

        ctrl_cliennte ControlCliente = new ctrl_cliennte();
        Cliente cliente = new Cliente();

        cliente.setNombre(jTextField1.getText().trim());
        cliente.setApellido(jTextField2.getText().trim());
        cliente.setCedula(jTextField3.getText().trim());
        cliente.setTelefono(jTextField4.getText().trim());
        cliente.setDireccion(jTextField5.getText().trim());
        if (ControlCliente.LlenarCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente Añadido");
        } else {
            JOptionPane.showMessageDialog(null, "Error al añadir Cliente");

        }
    }
}
