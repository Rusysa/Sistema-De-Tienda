package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

public class Gestionar_Producto extends javax.swing.JInternalFrame {

    private int idProducto;
    private int ObtenerIdCategoria = 0;

    public Gestionar_Producto() {
        initComponents();
        this.setSize(new Dimension(800, 400));

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        this.CargarDatosProducto();
        this.CargarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_cantidad = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 210));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Categoria:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 70, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 70, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Descripción:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 90, 40));
        jPanel1.add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 140, 30));
        jPanel1.add(jTextField_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 140, 30));
        jPanel1.add(jTextField_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 140, 30));
        jPanel1.add(jTextField_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Gestionar Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 40));

        jPanel1.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ModificarProducto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.EliminarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void EliminarProducto(){
         if (jTextField_nombre.getText().trim().isEmpty()
                || jTextField_cantidad.getText().trim().isEmpty()
                || jTextField_precio.getText().trim().isEmpty()
                || jTextField_descripcion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Seleccione un Dato de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
            Producto producto = new Producto();
            Ctrl_Producto ctrl=new Ctrl_Producto();
            
            //categoria.setDescripcion(jTextField1.getText().trim());
            if (!ctrl.EliminarCategoria(idProducto)) {
                JOptionPane.showMessageDialog(null, "Producto Eliminada");
              
                this.LimpiarCampos();
                this.CargarDatosProducto();
            }
        
    }
    private void ModificarProducto() {
        Producto producto = new Producto();
        Ctrl_Producto ctrProducto = new Ctrl_Producto();

        if (jTextField_nombre.getText().trim().isEmpty()
                || jTextField_cantidad.getText().trim().isEmpty()
                || jTextField_precio.getText().trim().isEmpty()
                || jTextField_descripcion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            if (!ctrProducto.ComprobarRegistro(jTextField_nombre.getText().trim())) {
                producto.setNombre(jTextField_nombre.getText().trim());
                producto.setCantidad(Integer.parseInt(jTextField_cantidad.getText().trim()));
                producto.setPrecio(Double.parseDouble(jTextField_precio.getText().trim()));
                producto.setDescripcion(jTextField_nombre.getText().trim());
                this.ObtenerIDcategoria();
                producto.setIdcategoria(ObtenerIdCategoria);
                if (ctrProducto.ModificarProducto(producto, idProducto)) {
                    JOptionPane.showMessageDialog(null, "Producto Modificado");
                    this.LimpiarCampos();
                    this.CargarDatosProducto();
                }
            } else {
                JOptionPane.showMessageDialog(null, "PRODUCTO REPETIDO", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "La CANTIDAD y/o PRECIO no pueden ser texto", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    private void LimpiarCampos(){
        jTextField_nombre.setText(null);
        jTextField_precio.setText(null);
        jTextField_cantidad.setText(null);
        jTextField_descripcion.setText(null);
    }
    
    private int ObtenerIDcategoria() {
        String sql = "SELECT * FROM categoria WHERE descripcion='" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ObtenerIdCategoria = rs.getInt("idcategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obetener categori");
        }

        return ObtenerIdCategoria;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_descripcion;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_precio;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosProducto() {
        Connection cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT p.idproducto, p.nombre, p.cantidad, p.precio, p.descripcion, c.descripcion, p.estado FROM producto AS p, categoria AS c WHERE p.fk_idcategoria = c.idcategoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            this.jTableProducto = new JTable(model);
            this.jScrollPane1.setViewportView(this.jTableProducto);
            model.addColumn("IDProducto");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripción");
            model.addColumn("Categoria");

            while (rs.next()) {

                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al llenar la tabla Productos" + e);

        }
        jTableProducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTableProducto.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point >= -1) {
                    idProducto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProducto(idProducto);
                }
            }
        });
    }

    private void EnviarDatosProducto(int idProducto) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT p.idproducto, p.nombre, p.cantidad, p.precio, p.descripcion, c.descripcion, p.estado FROM producto AS p, categoria AS c WHERE p.fk_idcategoria = c.idcategoria AND p.idproducto='" + idProducto + "'");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                jTextField_nombre.setText(rs.getString("nombre"));
                jTextField_cantidad.setText(rs.getString("cantidad"));
                jTextField_precio.setText(rs.getString("precio"));
                jTextField_descripcion.setText(rs.getString("descripcion"));
                //String categoria = rs.getString("c.descripcion")
                jComboBox_categoria.setSelectedItem(rs.getString("c.descripcion"));

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("no se pudo seleccionar datos");
        }
    }

    private void CargarCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            //jComboBox_Categoria.addItem("Seleccionar Categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }
    }
}
