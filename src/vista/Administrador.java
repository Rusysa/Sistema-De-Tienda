package vista;


import com.itextpdf.text.BaseColor;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controlador.ctrl_cliennte;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Cliente;
import javax.swing.JDesktopPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.io.FileOutputStream;
import java.io.IOException;



public class Administrador extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_admin;

    public Administrador() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema");

        this.setLayout(null);
        jDesktopPane_admin = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_admin.setBounds(0, 0, ancho, alto);
        this.add(jDesktopPane_admin);

       /* Bienvenida Bienvenidapanel = new Bienvenida();
        jDesktopPane_admin.add(Bienvenidapanel);
        Bienvenidapanel.setVisible(true);
*/
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icontienda.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_producto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_gestionar_cliente1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nuevo_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_resporte_cliente = new javax.swing.JMenuItem();
        jMenuItem_reporte_venta = new javax.swing.JMenuItem();
        jMenuItem_reporte_producto = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setText("Gestionar Usuario");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuItem3.setText("Actualizar ROL");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Base de Datos");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos(1).png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_producto.setText("Actualizar Stock");
        jMenuItem_actualizar_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_actualizar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_producto);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas_1.png"))); // NOI18N
        jMenu4.setText("Ventas");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_gestionar_cliente1.setText("Gestionar Venta");
        jMenuItem_gestionar_cliente1.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_gestionar_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_cliente1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_cliente1);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setText("Gestionar Cliente");
        jMenuItem_gestionar_cliente.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cate(1).png"))); // NOI18N
        jMenu5.setText("Categoria");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_nuevo_categoria.setText("Nueva Categoría");
        jMenuItem_nuevo_categoria.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_nuevo_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_categoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nuevo_categoria);

        jMenuItem_gestionar_categoria.setText("Gestionar Categoría");
        jMenuItem_gestionar_categoria.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte1.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_resporte_cliente.setText("Reportes Clientes");
        jMenuItem_resporte_cliente.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_resporte_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_resporte_clienteActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_resporte_cliente);

        jMenuItem_reporte_venta.setText("Reportes Ventas");
        jMenuItem_reporte_venta.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_reporte_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_ventaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_venta);

        jMenuItem_reporte_producto.setText("Reportes Productos");
        jMenuItem_reporte_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_reporte_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporte_productoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reporte_producto);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu7.setText("Salir");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem22.setText("Cerrar Sesión");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem2.setText("Salir Aplicación");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem_nuevo_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_admin.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriaActionPerformed

        Gestionar_Categoria Gcategoria = new Gestionar_Categoria();
        jDesktopPane_admin.add(Gcategoria);
        Gcategoria.setVisible(true);

    }//GEN-LAST:event_jMenuItem_gestionar_categoriaActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed

        NuevoClienteInternal Gcategoria = new NuevoClienteInternal();
        jDesktopPane_admin.add(Gcategoria);
        Gcategoria.setVisible(true);

      
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        Gestionar_Cliente guser = new Gestionar_Cliente();
        jDesktopPane_admin.add(guser);
        guser.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        NuevoUsuarioInter Nusuario = new NuevoUsuarioInter();
        jDesktopPane_admin.add(Nusuario);
        Nusuario.setVisible(true);

    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
        NuevoProducto NProducto = new NuevoProducto();
        jDesktopPane_admin.add(NProducto);
        NProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_cliente1ActionPerformed
       
        
        Gestionar_Venta Gventa = new Gestionar_Venta();
        jDesktopPane_admin.add(Gventa);
        Gventa.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_gestionar_cliente1ActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        GestionarUsuario Gusuario = new GestionarUsuario();
        jDesktopPane_admin.add(Gusuario);
        Gusuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        Gestionar_Producto Gproducto = new Gestionar_Producto();
        jDesktopPane_admin.add(Gproducto);
        Gproducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_actualizar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_productoActionPerformed
        Actualiza_Stock Astock = new Actualiza_Stock();
        jDesktopPane_admin.add(Astock);
        Astock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_productoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ActualizarRol ARol = new ActualizarRol();
        jDesktopPane_admin.add(ARol);
        ARol.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem_resporte_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_resporte_clienteActionPerformed
      Document DocumentoCliente = new Document();
    try {
        // Cambia la ruta del archivo según sea necesario
        PdfWriter.getInstance(DocumentoCliente, new FileOutputStream("C:\\Users\\veget\\OneDrive\\Escritorio\\reportes\\Reportes_Clientes.pdf"));
        DocumentoCliente.open();

       
        DocumentoCliente.add(new Paragraph("Reporte de Clientes", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, Font.BOLD, BaseColor.BLACK)));
        DocumentoCliente.add(new Paragraph(" "));

        // Crear la tabla
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell("ID_Cliente");
        tabla.addCell("Nombre");
        tabla.addCell("Apellido");
        tabla.addCell("Cedula");
        tabla.addCell("Telefono");
        tabla.addCell("Direccion");

        // Llenar la tabla con los datos de la base de datos
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                    tabla.addCell(rs.getString(6));
                } while (rs.next());
                DocumentoCliente.add(tabla);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL: " + e);
        }

        DocumentoCliente.close();
        JOptionPane.showMessageDialog(null, "Reporte generado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        System.out.println("Error al generar el reporte: " + e);
        JOptionPane.showMessageDialog(null, "No se pudo generar el reporte.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jMenuItem_resporte_clienteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
        String rutaPDF = "C:\\Users\\veget\\OneDrive\\Escritorio\\reportes\\MODELO_RELACIONAL.pdf";

    try {
        // Crear un objeto File con la ruta
        File archivoPDF = new File(rutaPDF);

        // Verificar si el archivo existe
        if (archivoPDF.exists()) {
            // Usar Desktop para abrir el archivo
            Desktop.getDesktop().open(archivoPDF);
        } else {
            // Mostrar mensaje si el archivo no existe
            JOptionPane.showMessageDialog(null, "El archivo no existe en la ruta especificada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        // Manejar errores
        JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar abrir el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem_reporte_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_ventaActionPerformed
     
        
          Document DocumentoCliente = new Document();
    try {

        PdfWriter.getInstance(DocumentoCliente, new FileOutputStream("C:\\Users\\veget\\OneDrive\\Escritorio\\reportes\\Reportes_Ventas.pdf"));
        DocumentoCliente.open();


        DocumentoCliente.add(new Paragraph("Reporte de Ventas", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, Font.BOLD, BaseColor.BLACK)));
       DocumentoCliente.add(new Paragraph(" "));

        // Crear la tabla
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell("ID_Venta");
        tabla.addCell("Cliente");
        tabla.addCell("Producto");
        tabla.addCell("Cantidad");
        tabla.addCell("Stock");
        tabla.addCell("Total a pagar");
 

        // Llenar la tabla con los datos de la base de datos
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT venta.idventa, usuario.nombre, producto.nombre, venta.cantidad, producto.cantidad, venta.totalpagar " +
                 "FROM venta " +
                 "JOIN usuario ON venta.fk_idusuario = usuario.idusuario " +
                 "JOIN producto ON venta.fk_idproducto = producto.idproducto;");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                    tabla.addCell(rs.getString(6));
                } while (rs.next());
                DocumentoCliente.add(tabla);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL: " + e);
        }

        DocumentoCliente.close();
        JOptionPane.showMessageDialog(null, "Reporte generado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        System.out.println("Error al generar el reporte: " + e);
        JOptionPane.showMessageDialog(null, "No se pudo generar el reporte.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
        
    }//GEN-LAST:event_jMenuItem_reporte_ventaActionPerformed

    private void jMenuItem_reporte_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporte_productoActionPerformed
                
        
            Document DocumentoCliente = new Document();
    try {

        PdfWriter.getInstance(DocumentoCliente, new FileOutputStream("C:\\Users\\veget\\OneDrive\\Escritorio\\reportes\\Reportes_Producto.pdf"));
        DocumentoCliente.open();


        DocumentoCliente.add(new Paragraph("Reporte de Productos", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, Font.BOLD, BaseColor.BLACK)));
       DocumentoCliente.add(new Paragraph(" "));

        // Crear la tabla
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell("ID_Producto");
        tabla.addCell("Nombre");
        tabla.addCell("Stock");
        tabla.addCell("Precio");
        tabla.addCell("Descripcion");
        tabla.addCell("Categoria");
 

        // Llenar la tabla con los datos de la base de datos
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT p.idproducto, p.nombre, p.cantidad, p.precio, p.descripcion, c.descripcion, p.estado FROM producto AS p, categoria AS c WHERE p.fk_idcategoria = c.idcategoria");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                    tabla.addCell(rs.getString(6));
                } while (rs.next());
                DocumentoCliente.add(tabla);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL: " + e);
        }

        DocumentoCliente.close();
        JOptionPane.showMessageDialog(null, "Reporte generado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        System.out.println("Error al generar el reporte: " + e);
        JOptionPane.showMessageDialog(null, "No se pudo generar el reporte.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jMenuItem_reporte_productoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_actualizar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente1;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_nuevo_categoria;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reporte_producto;
    private javax.swing.JMenuItem jMenuItem_reporte_venta;
    private javax.swing.JMenuItem jMenuItem_resporte_cliente;
    // End of variables declaration//GEN-END:variables

   
}
