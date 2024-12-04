
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
   
    public boolean ComprobarRegistro(String cliente) {
        boolean respuesta = false;
        String Sql = "SELECT nombre FROM cliente WHERE nombre = '" + cliente + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este nombre de cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
    
     public boolean ModificarCliente(Cliente objeto, int idcliente){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE cliente SET nombre=?, apellido=?, cedula=?, telefono=?, direccion=? WHERE idcliente ='"+ idcliente+"'");
           consulta.setString(1,objeto.getNombre());
           consulta.setString(2,objeto.getApellido());
           consulta.setString(3,objeto.getCedula());
           consulta.setString(4,objeto.getTelefono());
           consulta.setString(5,objeto.getDireccion());
           
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
     
     public boolean EliminarCliente(int idcliente){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("DELETE FROM cliente WHERE idcliente ='"+ idcliente+"'");
           consulta.executeUpdate();
   
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           //System.out.println("Error al Eliminarr Cateogoria");
            JOptionPane.showMessageDialog(null, "Error al eliminar Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
}
