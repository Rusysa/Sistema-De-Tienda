package vista;

import modelo.Categoria;
import controlador.control_categoria;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class InterCategoria extends javax.swing.JInternalFrame {

    public InterCategoria() {
        initComponents();
        this.setSize(new Dimension(400, 200));
        this.setTitle("Nueva Categoria");

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (screenSize.width - this.getWidth()) / 2;
        int alto = (screenSize.height - this.getHeight()) / 2;

        this.setLocation(ancho, alto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        descripcion_categoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Descripcion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 40));

        descripcion_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descripcion_categoriaKeyPressed(evt);
            }
        });
        getContentPane().add(descripcion_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nueva Categoría");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.LlenarCategoria();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void descripcion_categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcion_categoriaKeyPressed
      if (evt.getKeyCode() == evt.VK_ENTER) {
            this.LlenarCategoria();
        }
    }//GEN-LAST:event_descripcion_categoriaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descripcion_categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

public void LlenarCategoria(){
    Categoria categoria = new Categoria();
        control_categoria ctrlCategoria = new control_categoria();

        if (descripcion_categoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La descripcion esta vacia");

        } else {
            if (!ctrlCategoria.ecategoria(descripcion_categoria.getText().trim())) {
                categoria.setDescripcion(descripcion_categoria.getText().trim());
                categoria.setEstado(1);
                if(ctrlCategoria.guardar(categoria)){
                    JOptionPane.showMessageDialog(null, "Categoria Añadida");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Categoria repetida");
            }
        }
        descripcion_categoria.setText("");
}
}
