package vista;

import java.awt.Dimension;
import modelo.Usuario;
import controlador.Ctrl_usuario;
import javax.swing.JOptionPane;
public class NuevoUsuarioInter extends javax.swing.JInternalFrame {

    public NuevoUsuarioInter() {
        initComponents();
        this.setSize(new Dimension(400, 400));
        //this.setTitle("Nuevo Usuario");
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        tf_password = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tf_usuario = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Apellido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asistente", "Administrador" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 130, 30));
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));
        getContentPane().add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 110, 40));
        getContentPane().add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, -1));
        getContentPane().add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, -1));
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Nuevo Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.NuevoUsuario();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables

    public void NuevoUsuario() {
        Usuario user = new Usuario();
        Ctrl_usuario ctrlUser = new Ctrl_usuario();
      
  
        user.setNombre(tf_nombre.getText().trim());
        user.setApellido(tf_apellido.getText().trim());
        user.setUsuario(tf_usuario.getText().trim());
        user.setTelefono(tf_telefono.getText().trim());
        user.setPassword(tf_password.getText().trim());
        user.setRol(jComboBox2.getSelectedItem().toString());
       
        if (ctrlUser.NuevoUsuario(user)) {
            tf_nombre.setText(null);
            tf_apellido.setText(null);
            tf_usuario.setText(null);
            tf_telefono.setText(null);
            tf_password.setText(null);
            JOptionPane.showMessageDialog(null, "Usuario Añadido");
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al añadir Cliente");

        }
        
        
    }

}
