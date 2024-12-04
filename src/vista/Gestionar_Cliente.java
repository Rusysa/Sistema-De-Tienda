package vista;

import com.mysql.fabric.xmlrpc.Client;
import conexion.Conexion;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import controlador.ctrl_cliennte;
import javax.swing.JOptionPane;
public class Gestionar_Cliente extends javax.swing.JInternalFrame {

    public Gestionar_Cliente() {
        initComponents();
        this.setSize(new Dimension(800, 400));
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        
        this.CargarDatosEnTabla();
    }
    private int idcliente;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFielddireccion = new javax.swing.JTextField();
        jTextFieldnombre = new javax.swing.JTextField();
        jTextFieldapellido = new javax.swing.JTextField();
        jTextFieldcedula = new javax.swing.JTextField();
        jTextFieldtelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 260));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cedula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Direccion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 80, -1));
        jPanel1.add(jTextFielddireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 200, 30));
        jPanel1.add(jTextFieldnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 200, 30));
        jPanel1.add(jTextFieldapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 30));
        jPanel1.add(jTextFieldcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 200, 30));
        jPanel1.add(jTextFieldtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Gestionar Cliente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.ModificarCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.EliminarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void EliminarProducto(){
         if (jTextFieldnombre.getText().trim().isEmpty()
                || jTextFieldapellido.getText().trim().isEmpty()
                || jTextFieldcedula.getText().trim().isEmpty()
                || jTextFieldtelefono.getText().trim().isEmpty()
                || jTextFielddireccion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Seleccione un Dato de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
            Cliente cliente = new Cliente();
            ctrl_cliennte ctrl =new ctrl_cliennte();
            
            //categoria.setDescripcion(jTextField1.getText().trim());
            if (!ctrl.EliminarCliente(idcliente)) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado");
              
                this.LimpiarCampos();
                this.CargarDatosEnTabla();
            }
        
    }
    private void ModificarCliente(){
        Cliente cliente = new Cliente();
        ctrl_cliennte ctrlCliente = new ctrl_cliennte();
        
        if(jTextFieldnombre.getText().trim().isEmpty()
                || jTextFieldapellido.getText().trim().isEmpty()
                || jTextFieldcedula.getText().trim().isEmpty()
                || jTextFieldtelefono.getText().trim().isEmpty()
                || jTextFielddireccion.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
             return;
        }
        
            if (!ctrlCliente.ComprobarRegistro(jTextFieldnombre.getText().trim())) {
                cliente.setNombre(jTextFieldnombre.getText().trim());
                cliente.setApellido(jTextFieldapellido.getText().trim());
                cliente.setCedula(jTextFieldcedula.getText().trim());
                cliente.setTelefono(jTextFieldtelefono.getText().trim());
                cliente.setDireccion(jTextFielddireccion.getText().trim());
                
                if (ctrlCliente.ModificarCliente(cliente, idcliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente Modificado");
                    this.LimpiarCampos();
                    this.CargarDatosEnTabla();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente REPETIDO", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    private void LimpiarCampos(){
        jTextFieldnombre.setText(null);
        jTextFieldapellido.setText(null);
        jTextFieldcedula.setText(null);
        jTextFieldtelefono.setText(null);
        jTextFielddireccion.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcedula;
    private javax.swing.JTextField jTextFielddireccion;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JTextField jTextFieldtelefono;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosEnTabla() {
        Connection cn = Conexion.conectar();
        DefaultTableModel modelTabla = new DefaultTableModel();
        String sql = "SELECT * FROM cliente";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            this.jTable_Cliente = new JTable(modelTabla);
            this.jScrollPane1.setViewportView(jTable_Cliente);
            modelTabla.addColumn("ID Cliente");
            modelTabla.addColumn("Nombre");
            modelTabla.addColumn("Apellido");
            modelTabla.addColumn("Cedula");
            modelTabla.addColumn("Telefono");
            modelTabla.addColumn("Direccion");

            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelTabla.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Cargar los datos en la tabla de clientes" + e);
        }

        jTable_Cliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Cliente.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point >= -1) {
                    idcliente = (int) modelTabla.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoACampos(idcliente);
                }
            }
        });

    }

    private void EnviarDatosProductoACampos(int idcliente) {
        Connection cn = Conexion.conectar();
        Statement st;
        String sql = "SELECT * FROM cliente WHERE idcliente='" + idcliente + "'";
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jTextFieldnombre.setText(rs.getString("nombre"));
                jTextFieldapellido.setText(rs.getString("apellido"));
                jTextFieldcedula.setText(rs.getString("cedula"));
                jTextFieldtelefono.setText(rs.getString("telefono"));
                jTextFielddireccion.setText(rs.getString("direccion"));
              
            }

        } catch (SQLException e) {
            System.out.println("Error al llenar los campos con los datos de la tabla" + e);
        }
    }

}
