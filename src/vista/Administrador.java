
package vista;

import controlador.ctrl_cliennte;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Cliente;
import javax.swing.JDesktopPane;

public class Administrador extends javax.swing.JFrame {

   public static JDesktopPane jDesktopPane_admin;
   
   
    public Administrador() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema");
        
        this.setLayout(null);
        jDesktopPane_admin = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_admin.setBounds(0,0,ancho,alto);
        this.add(jDesktopPane_admin);
        }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_producto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nuevo_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_resporte_cliente = new javax.swing.JMenuItem();
        jMenuItem_reporte_categoria = new javax.swing.JMenuItem();
        jMenuItem_reporte_venta = new javax.swing.JMenuItem();
        jMenuItem_reporte_producto = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(225, 50));

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
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(225, 50));

        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_producto.setText("Actualizar Stock");
        jMenuItem_actualizar_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(jMenuItem_actualizar_producto);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(225, 50));

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

        jMenu5.setText("Categoria");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(225, 50));

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
        jMenu6.setPreferredSize(new java.awt.Dimension(225, 50));

        jMenuItem_resporte_cliente.setText("Reportes Clientes");
        jMenuItem_resporte_cliente.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(jMenuItem_resporte_cliente);

        jMenuItem_reporte_categoria.setText("Reportes Categorias");
        jMenuItem_reporte_categoria.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(jMenuItem_reporte_categoria);

        jMenuItem_reporte_venta.setText("Reportes Ventas");
        jMenuItem_reporte_venta.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(jMenuItem_reporte_venta);

        jMenuItem_reporte_producto.setText("Reportes Productos");
        jMenuItem_reporte_producto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(jMenuItem_reporte_producto);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu7.setText("Cerrar Sesión");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(225, 50));

        jMenuItem22.setText("Cerrar Sesión");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        NuevoUsuarioInter Nusuario = new NuevoUsuarioInter();
        jDesktopPane_admin.add(Nusuario);
        Nusuario.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem_actualizar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_nuevo_categoria;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reporte_categoria;
    private javax.swing.JMenuItem jMenuItem_reporte_producto;
    private javax.swing.JMenuItem jMenuItem_reporte_venta;
    private javax.swing.JMenuItem jMenuItem_resporte_cliente;
    // End of variables declaration//GEN-END:variables

/*private void Cliente(){

            ctrl_cliennte ControlCliente = new  ctrl_cliennte ();
            Cliente cliente = new Cliente();
            
            cliente.setNombre(txt_nombre.getText().trim());
            cliente.setApellido(jTextField2.getText().trim());
            cliente.setCedula(jTextField3.getText().trim());
            cliente.setTelefono(jTextField4.getText().trim());
            cliente.setDireccion(jTextField5.getText().trim());
            //cliente.setEstado(Integer.parseInt(jTextField6.getText().trim()));

            if (ControlCliente.LlenarCliente(cliente)) {
                
                JOptionPane.showMessageDialog(null, "Cliente Añadido");
            } else {
                JOptionPane.showMessageDialog(null, "Error al añadir Cliente");

            }
        }*/
    }


