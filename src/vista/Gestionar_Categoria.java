package vista;

import conexion.Conexion;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import controlador.control_categoria;
import javax.swing.JOptionPane;

public class Gestionar_Categoria extends javax.swing.JInternalFrame {

    private int id_categoria;

    public Gestionar_Categoria() {
        initComponents();
        this.setSize(new Dimension(500, 450));
        this.setTitle("Gestionar Categoría");

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(ancho, alto);
        this.DatosCategoria();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Categorias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestionar Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Categorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 340, 230));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Actualizar.setText("Modificar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jButton_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 210, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        if (!jTextField1.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            control_categoria ctrCategoria = new control_categoria();
            
            categoria.setDescripcion(jTextField1.getText().trim());
                if(ctrCategoria.ModificarCategoria(categoria, id_categoria)){
                    JOptionPane.showMessageDialog(null,"Categoria Modificada");
                    jTextField1.setText(null);
                    this.DatosCategoria();
                }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Dato", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
         if (!jTextField1.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            control_categoria ctrCategoria = new control_categoria();
            
            categoria.setDescripcion(jTextField1.getText().trim());
                if(!ctrCategoria.EliminarCategoria(id_categoria)){
                    JOptionPane.showMessageDialog(null,"Categoria Eliminada");
                    jTextField1.setText(null);
                    this.DatosCategoria();
                }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un dato", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Categorias;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void DatosCategoria() {
        Connection cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM categoria WHERE estado=1;";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Gestionar_Categoria.jTable_Categorias = new JTable(model);

            Gestionar_Categoria.jScrollPane1.setViewportView(Gestionar_Categoria.jTable_Categorias);
            model.addColumn("idCategoria");
            model.addColumn("Descripcion");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {

            System.out.println("Error al llenar la tabla" + e);

        }
        jTable_Categorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Categorias.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point >= -1) {
                    id_categoria = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatoCategoria(id_categoria);
                }
            }
        });

    }

    private void EnviarDatoCategoria(int id_categoria) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM categoria WHERE idcategoria ='" + id_categoria + "'");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                jTextField1.setText(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {

        }

    }

}
