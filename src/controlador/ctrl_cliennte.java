
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Cliente;


public class ctrl_cliennte {
    
   public boolean LlenarCliente(Cliente objeto) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    String sql = "INSERT INTO cliente(nombre, apellido, cedula, telefono, direccion, estado) VALUES (?, ?, ?, ?, ?, '1')";
    
    try (PreparedStatement pst = cn.prepareStatement(sql)) {
        // Llenar los parámetros de la consulta
        pst.setString(1, objeto.getNombre());
        pst.setString(2, objeto.getApellido());
        pst.setString(3, objeto.getCedula());
        pst.setString(4, objeto.getTelefono());
        pst.setString(5, objeto.getDireccion());
        int rowsAffected = pst.executeUpdate();
         
       respuesta = rowsAffected > 0;
        cn.close();
        
    } catch (SQLException e) {
        System.out.println("Error al añadir cliente" + e);
        JOptionPane.showMessageDialog(null, "Error al añadir cliente: " + e.getMessage());
    }
    
    return respuesta;
}

    
}
