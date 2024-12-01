
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


public class Actualiza_Stock extends javax.swing.JInternalFrame {
    private int idProducto;
   
    public Actualiza_Stock() {
        initComponents();
        this.setSize(new Dimension(700,300));
        this.CargarDatosProducto();
        
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_descripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 510, 152));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, 30));
        jPanel1.add(jTextField_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Actualizar Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ModificarStock();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField jTextField_descripcion;
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
    
     private void ModificarStock() {
        Producto producto = new Producto();
        Ctrl_Producto ctrProducto = new Ctrl_Producto();

        if (jTextField_descripcion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, elija un dato.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            producto.setCantidad(Integer.parseInt(jTextField_descripcion.getText().trim()));
                if (ctrProducto.ModificarStock(producto, idProducto)) {
                    JOptionPane.showMessageDialog(null, "Stock Modificado");
                    jTextField_descripcion.setText(null);
                    this.CargarDatosProducto();
                }
            

        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "La CANTIDAD y/o PRECIO no pueden ser texto", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void EnviarDatosProducto(int idProducto) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM producto WHERE idproducto='" + idProducto + "'");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                jTextField_descripcion.setText(rs.getString("cantidad"));
                

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("no se pudo seleccionar datos");
        }
    }
    
    
}
