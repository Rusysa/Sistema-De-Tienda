
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexion.Conexion;
import modelo.Venta;

public class Ctrl_venta {
    
    
    public boolean NuevaVenta(Venta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO venta VALUES(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getIdUsuario());
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5,0);
            consulta.setInt(6, 1);
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Error formato", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (SQLException e) {
            System.out.println("error sql"+e);
            JOptionPane.showMessageDialog(null, "Error al Guardar Venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
    public boolean ModificarVenta(Venta venta, int idVenta) {
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
            "UPDATE venta SET fk_idusuario = ?, fk_idproducto = ?, cantidad = ?, totalpagar = ? WHERE idventa = '"+ idVenta +"'"
        );
        pst.setInt(1, venta.getIdUsuario());
        pst.setInt(2, venta.getIdProducto());
        pst.setInt(3, venta.getCantidad());
        pst.setDouble(4, venta.getTotalPagar());
 

        pst.executeUpdate();
        cn.close();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al modificar la venta: " + e.getMessage());
        return false;
    }
}

    public double ObtenerPrecioProducto(int idProducto) {
    double precio = 0;
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("SELECT precio FROM producto WHERE idproducto = ?");
        pst.setInt(1, idProducto);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            precio = rs.getDouble("precio");
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener el precio del producto: " + e.getMessage());
    }
    return precio;
}
public int ObtenerCantidadVenta(int idVenta) {
    int cantidad = 0;
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("SELECT cantidad FROM venta WHERE idventa = ?");
        pst.setInt(1, idVenta);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            cantidad = rs.getInt("cantidad");
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener la cantidad de la venta: " + e.getMessage());
    }
    return cantidad;
}

     
    
    /*  public boolean ModificarProducto(Venta objeto, int idProducto){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE venta SET nombre=?, cantidad=?, precio=?, descripcion=?, fk_idcategoria=?  WHERE idproducto ='"+ idProducto+"'");
           consulta.setString(1,objeto.getNombre());
           
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }*/
    
    
     public boolean EliminarVenta(int idVenta){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("DELETE FROM venta WHERE idventa ='"+ idVenta+"'");
           consulta.executeUpdate();
   
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           //System.out.println("Error al Eliminarr Cateogoria");
            JOptionPane.showMessageDialog(null, "Error al eliminar Venta.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
   
    public int ObtenerStockProducto(int idProducto) {
    int stock = 0;
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("SELECT cantidad FROM producto WHERE idproducto = ?");
        pst.setInt(1, idProducto);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            stock = rs.getInt("cantidad");
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener el stock: " + e.getMessage());
    }
    return stock;
}

public void ActualizarStockProducto(int idProducto, int nuevoStock) {
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("UPDATE producto SET cantidad = ? WHERE idproducto = ?");
        pst.setInt(1, nuevoStock);
        pst.setInt(2, idProducto);
        pst.executeUpdate();
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar el stock: " + e.getMessage());
    }
}

    
}
