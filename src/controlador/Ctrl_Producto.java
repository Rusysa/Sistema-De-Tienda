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

}
