package vista;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import conexion.Conexion;
import controlador.Ctrl_usuario;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class GestionarUsuario extends javax.swing.JInternalFrame {

    int idusuario;

    public GestionarUsuario() {
        initComponents();
        this.setSize(new Dimension(800, 400));
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        this.CargarDatosEnTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_contraseña = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_usuario = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jComboBox_rol = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Usuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 190));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rol:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestionar Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 320, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 90, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 90, 40));
        jPanel1.add(jTextField_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 190, 30));
        jPanel1.add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 190, 30));
        jPanel1.add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 190, 30));
        jPanel1.add(jTextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 190, 30));
        jPanel1.add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 190, 30));

        jComboBox_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Asistente" }));
        jPanel1.add(jComboBox_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 190, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 120, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.ModificarUsuario();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.EliminarUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void EliminarUsuario() {
        if (jTextField_nombre.getText().trim().isEmpty()
                || jTextField_apellido.getText().trim().isEmpty()
                || jTextField_usuario.getText().trim().isEmpty()
                || jTextField_telefono.getText().trim().isEmpty()
                || jTextField_telefono.getText().trim().isEmpty()
                || jTextField_contraseña.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Seleccione un Dato de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Usuario user = new Usuario();
        Ctrl_usuario ctrlUser = new Ctrl_usuario();

        //categoria.setDescripcion(jTextField1.getText().trim());
        if (!ctrlUser.EliminarUsuario(idusuario)) {
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");

            this.LimpiarCampos();
            this.CargarDatosEnTabla();
        }

    }

    private void ModificarUsuario() {
        Usuario user = new Usuario();
        Ctrl_usuario ctrlUser = new Ctrl_usuario();

        if (jTextField_nombre.getText().trim().isEmpty()
                || jTextField_apellido.getText().trim().isEmpty()
                || jTextField_usuario.getText().trim().isEmpty()
                || jTextField_telefono.getText().trim().isEmpty()
                || jTextField_telefono.getText().trim().isEmpty()
                || jTextField_contraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!ctrlUser.ComprobarRegistro(jTextField_usuario.getText().trim())) {
            user.setNombre(jTextField_nombre.getText().trim());
            user.setApellido(jTextField_apellido.getText().trim());
            user.setUsuario(jTextField_usuario.getText().trim());
            user.setTelefono(jTextField_telefono.getText().trim());
            user.setPassword(jTextField_contraseña.getText().trim());
            String rol = jComboBox_rol.getSelectedItem().toString();
            user.setRol(rol);
            if (ctrlUser.ModificarUsuario(user, idusuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
                this.LimpiarCampos();
                this.CargarDatosEnTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario REPETIDO", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LimpiarCampos() {
        jTextField_nombre.setText(null);
        jTextField_apellido.setText(null);
        jTextField_usuario.setText(null);
        jTextField_telefono.setText(null);
        jTextField_contraseña.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Usuario;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_contraseña;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosEnTabla() {
        Connection cn = Conexion.conectar();
        DefaultTableModel modelTabla = new DefaultTableModel();
        String sql = "SELECT * FROM usuario";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            this.jTable_Usuario = new JTable(modelTabla);
            this.jScrollPane1.setViewportView(jTable_Usuario);
            modelTabla.addColumn("ID Usuario");
            modelTabla.addColumn("Nombre");
            modelTabla.addColumn("Apellido");
            modelTabla.addColumn("Usuario");
            modelTabla.addColumn("Telefono");
            modelTabla.addColumn("Contraseña");
            modelTabla.addColumn("Rol");

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelTabla.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Cargar los datos en la tabla de usuarios" + e);
        }

        jTable_Usuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Usuario.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point >= -1) {
                    idusuario = (int) modelTabla.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoACampos(idusuario);
                }
            }
        });

    }

    private void EnviarDatosProductoACampos(int idusuario) {
        Connection cn = Conexion.conectar();
        Statement st;
        String sql = "SELECT * FROM usuario WHERE idusuario='" + idusuario + "'";
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jTextField_nombre.setText(rs.getString("nombre"));
                jTextField_apellido.setText(rs.getString("apellido"));
                jTextField_usuario.setText(rs.getString("usuario"));
                jTextField_telefono.setText(rs.getString("telefono"));
                jTextField_contraseña.setText(rs.getString("password"));
                String rol = rs.getString("rol");
                jComboBox_rol.setSelectedItem(rol);
            }

        } catch (SQLException e) {
            System.out.println("Error al llenar los campos con los datos de la tabla" + e);
        }
    }
}
