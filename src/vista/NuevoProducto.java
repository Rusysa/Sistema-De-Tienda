package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;
import java.awt.Dimension;

public class NuevoProducto extends javax.swing.JInternalFrame {

    int ObtenerIdCategoria = 0;

    public NuevoProducto() {
        initComponents();
        this.setSize(new Dimension(400, 350));
        this.setTitle("Nuevo Producto");

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.CargarCategorias();
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
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Precio = new javax.swing.JTextField();
        jTextFieldCantida = new javax.swing.JTextField();
        jTextField_Descripcion = new javax.swing.JTextField();
        jComboBox_Categoria = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nuevo Producto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Categoria:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField_Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DescripcionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCantida)
                                    .addComponent(jTextField_Nombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCantida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.LlenarNuevoProducto();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_DescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DescripcionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.LlenarNuevoProducto();
        }
    }//GEN-LAST:event_jTextField_DescripcionKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldCantida;
    private javax.swing.JTextField jTextField_Descripcion;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Precio;
    // End of variables declaration//GEN-END:variables

    private void CargarCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_Categoria.removeAllItems();
            //jComboBox_Categoria.addItem("Seleccionar Categoria:");
            while (rs.next()) {
                jComboBox_Categoria.addItem(rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }
    }

    private void LlenarNuevoProducto() {
        Producto Producto = new Producto();
        Ctrl_Producto ctrproducto = new Ctrl_Producto();

        if (jTextField_Nombre.getText().trim().isEmpty()
                || jTextFieldCantida.getText().trim().isEmpty()
                || jTextField_Precio.getText().trim().isEmpty()
                || jTextField_Descripcion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            if (!ctrproducto.ComprobarRegistro(jTextField_Nombre.getText().trim())) {
                Producto.setNombre(jTextField_Nombre.getText().trim());
                Producto.setCantidad(Integer.parseInt(jTextFieldCantida.getText().trim()));
                Producto.setPrecio(Double.parseDouble(jTextField_Precio.getText().trim()));
                Producto.setDescripcion(jTextField_Descripcion.getText().trim());
                Producto.setEstado(1);
                this.ObtenerIDcategoria();
                Producto.setIdcategoria(ObtenerIdCategoria);

                if (ctrproducto.NuevoProducto(Producto)) {
                    JOptionPane.showMessageDialog(null, "Producto Añadido");
                    this.LimpiarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "PRODUCTO REPETIDO", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "El PRECIO y la CANTIDAD no pueden ser texto", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private int ObtenerIDcategoria() {
        String sql = "SELECT * FROM categoria WHERE descripcion='" + this.jComboBox_Categoria.getSelectedItem() + "'";
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
    
    private void LimpiarCampos(){
        jTextField_Nombre.setText(null);
        jTextField_Precio.setText(null);
        jTextFieldCantida.setText(null);
        jTextField_Descripcion.setText(null);
    }
}
