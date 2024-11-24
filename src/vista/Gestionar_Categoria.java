package vista;

import conexion.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JTable;
public class Gestionar_Categoria extends javax.swing.JInternalFrame {

  private int id_categoria;
    public Gestionar_Categoria() {
        initComponents();
        this.setSize(new Dimension(500,450));
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
        jButton_Actualizar.setText("Actualizar");
        jPanel2.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jButton_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Eliminar.setText("Eliminar");
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

private void DatosCategoria(){
    Connection cn = Conexion.conectar();
    DefaultTableModel model = new DefaultTableModel();
    String sql = "SELECT * FROM categoria;";
    Statement st;
    try {
        st=cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Gestionar_Categoria.jTable_Categorias = new JTable(model);
        Gestionar_Categoria.jScrollPane1.setViewportView(Gestionar_Categoria.jTable_Categorias);
        model.addColumn("idCategoria");
        model.addColumn("Descripcion");
        model.addColumn("Estado");
        
        while(rs.next())
        {
            Object fila[] = new Object[3];
            for (int i = 0; i < 3; i++) {
                fila[i]= rs.getObject(i+1);
            }
            model.addRow(fila);
        }
        cn.close();
    } catch (SQLException e) {
        
        System.out.println("Error al llenar la tabla"+e);
    }
    
}
}
