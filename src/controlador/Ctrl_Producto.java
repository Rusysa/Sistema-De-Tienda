package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class Ctrl_Producto {

//INGRESAR NUEVO PRODUCTO
    public boolean NuevoProducto(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO producto VALUES(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getIdcategoria());
            consulta.setInt(7,1);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Error formato", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }

    //FUNCION PARA COMPROBAR SI EL DATO A INGRESAR YA EXISTE
    public boolean ComprobarRegistro(String Producto) {
        boolean respuesta = false;
        String Sql = "SELECT nombre FROM producto WHERE nombre = '" + Producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este nombre de Producto ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
    
    public boolean ModificarProducto(Producto objeto, int idProducto){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE producto SET nombre=?, cantidad=?, precio=?, descripcion=?, fk_idcategoria=?  WHERE idproducto ='"+ idProducto+"'");
           consulta.setString(1,objeto.getNombre());
           consulta.setInt(2,objeto.getCantidad());
           consulta.setDouble(3,objeto.getPrecio());
           consulta.setString(4,objeto.getDescripcion());
           consulta.setInt(5,objeto.getIdcategoria());
    
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
     
    
    public boolean ModificarStock(Producto objeto, int idProducto){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE producto SET cantidad=? WHERE idproducto ='"+ idProducto+"'");
           consulta.setInt(1,objeto.getCantidad());
     
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
     
     
      public boolean EliminarCategoria(int idProducto){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("DELETE FROM producto WHERE idproducto ='"+ idProducto+"'");
           consulta.executeUpdate();
   
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           //System.out.println("Error al Eliminarr Cateogoria");
            JOptionPane.showMessageDialog(null, "Error al eliminar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
    

}
