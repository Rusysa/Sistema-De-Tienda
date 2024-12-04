package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import controlador.Ctrl_venta;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Venta;

public class Gestionar_Venta extends javax.swing.JInternalFrame {

    private int idVenta;
    private int ObtenerIdCategoria = 0;

    public Gestionar_Venta() {
        initComponents();
        this.setSize(new Dimension(800, 400));

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        this.CargarUsuarios();
        this.CargarProductos();
       this.CargarDatosVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVEnta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_usuario = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jComboBox_producto = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableVEnta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableVEnta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 210));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 110, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 70, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 70, 40));
        jPanel1.add(jTextFieldcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Gestionar Venta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 40));

        jPanel1.add(jComboBox_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 140, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 110, 40));

        jPanel1.add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ModificarVenta();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
  private void ModificarVenta() {
    Venta venta = new Venta();
    Ctrl_venta CtrlVenta = new Ctrl_venta();

    // Validación de campos vacíos
    if (jTextFieldcantidad.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        int idProducto = obtenerIdDesdeComboBox(jComboBox_producto);
        int cantidadNueva = Integer.parseInt(jTextFieldcantidad.getText().trim());
        int stockDisponible = CtrlVenta.ObtenerStockProducto(idProducto);

        // Obtener la cantidad anterior de la venta
        int cantidadAnterior = CtrlVenta.ObtenerCantidadVenta(idVenta);

        // Calcular el stock disponible considerando la cantidad anterior
        int stockAjustado = stockDisponible + cantidadAnterior;

        // Verificar si hay suficiente stock para la nueva cantidad
        if (cantidadNueva > stockAjustado) {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para esta modificación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Configurar los datos de la venta
        venta.setIdVenta(idVenta);
        venta.setIdUsuario(obtenerIdDesdeComboBox(jComboBox_usuario));
        venta.setIdProducto(idProducto);
        venta.setCantidad(cantidadNueva);
        venta.setTotalPagar(cantidadNueva * CtrlVenta.ObtenerPrecioProducto(idProducto)); // Asume que hay un método para obtener el precio

        // Modificar la venta
        if (CtrlVenta.ModificarVenta(venta,idVenta)) {
            // Actualizar el stock del producto
            CtrlVenta.ActualizarStockProducto(idProducto, stockAjustado - cantidadNueva);

            JOptionPane.showMessageDialog(null, "Venta Modificada");
            this.LimpiarCampos();
            this.CargarDatosVentas();
        }
    } catch (NumberFormatException ne) {
        JOptionPane.showMessageDialog(null, "Error en el formato de los datos. Por favor revise los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.LlenarNuevaVEnta();
    }//GEN-LAST:event_jButton2ActionPerformed

private int obtenerIdDesdeComboBox(JComboBox<String> comboBox) {
    String seleccionado = comboBox.getSelectedItem().toString();
    
    String id = seleccionado.split(" - ")[0]; 
    return Integer.parseInt(id.trim()); 
}
   private void LlenarNuevaVEnta() {
    Venta venta = new Venta();
    Ctrl_venta CtrlVenta = new Ctrl_venta();

    if (jTextFieldcantidad.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Extraer solo los IDs de los JComboBox
        int idUsuario = obtenerIdDesdeComboBox(jComboBox_usuario);
        int idProducto = obtenerIdDesdeComboBox(jComboBox_producto);
        int cantidad = Integer.parseInt(jTextFieldcantidad.getText().trim());

        // Verificar el stock disponible
        int stockDisponible = CtrlVenta.ObtenerStockProducto(idProducto);
        if (cantidad > stockDisponible) {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para esta venta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Configurar la venta
        venta.setIdUsuario(idUsuario);
        venta.setIdProducto(idProducto);
        venta.setCantidad(cantidad);

        // Registrar la venta
        if (CtrlVenta.NuevaVenta(venta)) {
            // Restar stock después de confirmar la venta
            CtrlVenta.ActualizarStockProducto(idProducto, stockDisponible - cantidad);

            JOptionPane.showMessageDialog(null, "Venta Añadida");
            this.LimpiarCampos();
            this.CargarDatosVentas();
        }
    } catch (NumberFormatException ne) {
        JOptionPane.showMessageDialog(null, "Error en el formato de los datos. Por favor revise los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.EliminarVenta();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void EliminarVenta(){
         if (jTextFieldcantidad.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Seleccione un Dato de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
         
            Ctrl_venta ctrlVenta = new Ctrl_venta();
            
            //categoria.setDescripcion(jTextField1.getText().trim());
            if (!ctrlVenta.EliminarVenta(idVenta)) {
                JOptionPane.showMessageDialog(null, "Venta Eliminada");
              
                this.LimpiarCampos();
                this.CargarDatosVentas();
            }
        
    }
   
    private void LimpiarCampos(){
      
        jTextFieldcantidad.setText(null);
       
    }
    
    private int ObtenerIDcategoria() {
        String sql = "SELECT * FROM categoria WHERE descripcion='" + this.jComboBox_usuario.getSelectedItem() + "'";
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
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JComboBox<String> jComboBox_usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVEnta;
    private javax.swing.JTextField jTextFieldcantidad;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosVentas() {
    Connection cn = Conexion.conectar();
    DefaultTableModel model = new DefaultTableModel();
    String sql = "SELECT venta.idventa, usuario.nombre, producto.nombre, venta.cantidad, producto.cantidad, venta.totalpagar " +
                 "FROM venta " +
                 "JOIN usuario ON venta.fk_idusuario = usuario.idusuario " +
                 "JOIN producto ON venta.fk_idproducto = producto.idproducto;";
    Statement st;
    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        this.jTableVEnta = new JTable(model);
        this.jScrollPane1.setViewportView(this.jTableVEnta);

        // Definir las columnas
        model.addColumn("ID_Venta");
        model.addColumn("Cliente");
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("Stock");
        model.addColumn("Total a Pagar");

        // Llenar la tabla
        while (rs.next()) {
            Object fila[] = new Object[6];
            fila[0] = rs.getInt("idventa");       // ID de la venta
            fila[1] = rs.getString("usuario.nombre");     // Nombre del usuario
            fila[2] = rs.getString("producto.nombre");     // Nombre del producto
            fila[3] = rs.getInt("cantidad");      // Cantidad vendida
            fila[4] = rs.getInt("producto.cantidad");      // Cantidad en producto
            fila[5] = rs.getDouble("totalpagar");// Total a pagar
            model.addRow(fila);
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al llenar la tabla Ventas: " + e);
    }

    jTableVEnta.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int fila_point = jTableVEnta.rowAtPoint(e.getPoint());
            int columna_point = 0;
            if (fila_point >= -1) {
                idVenta = (int) model.getValueAt(fila_point, columna_point);
                EnviarDatosventa(idVenta);
            }
        }
    });
}


    private void EnviarDatosventa(int idVenta) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM venta WHERE idventa='" + idVenta+ "'");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                jComboBox_usuario.setSelectedItem(rs.getInt("fk_idusuario"));
                jComboBox_producto.setSelectedItem("fk_idproducto");
                jTextFieldcantidad.setText(rs.getString("cantidad"));
               

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("no se pudo seleccionar datos");
        }
    }

 
    
     private void CargarUsuarios() {
    Connection cn = Conexion.conectar();
    String sql = "SELECT idusuario, usuario FROM usuario"; 
    Statement st;

    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        jComboBox_usuario.removeAllItems();

        while (rs.next()) {
            // Concatenar ID y nombre de usuario
            String usuario = rs.getInt("idusuario") + " - " + rs.getString("usuario");
            jComboBox_usuario.addItem(usuario);
        }

    } catch (SQLException e) {
        System.out.println("Error al cargar los usuarios: " + e.getMessage());
    }
}

      
      
       private void CargarProductos() {
    Connection cn = Conexion.conectar();
    String sql = "SELECT idproducto, nombre FROM producto"; 
    Statement st;

    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        jComboBox_producto.removeAllItems();

        while (rs.next()) {
            // Concatenar ID y nombre del producto
            String producto = rs.getInt("idproducto") + " - " + rs.getString("nombre");
            jComboBox_producto.addItem(producto);
        }

    } catch (SQLException e) {
        System.out.println("Error al cargar los productos: " + e.getMessage());
    }
}
       
    


}
