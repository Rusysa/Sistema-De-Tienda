package controlador;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.Conexion;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Ctrl_usuario {

    public Ctrl_usuario() {

    }

    public boolean LoginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT concat(nombre, ' ' , apellido) as Nombres, usuario, password FROM usuario WHERE usuario = '" + objeto.getUsuario() + "' AND password='" + objeto.getPassword() + "'AND rol='" + objeto.getRol() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return respuesta;
    }

    public boolean NuevoUsuario(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?)";

        try (PreparedStatement st = cn.prepareStatement(sql)) {
            st.setInt(1, 0);
            st.setString(2, objeto.getNombre());
            st.setString(3, objeto.getApellido());
            st.setString(4, objeto.getUsuario());
            st.setString(5, objeto.getTelefono());
            st.setString(6, objeto.getPassword());
            st.setString(7, objeto.getRol());
            st.setInt(8, 1);
            if (st.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir" + e);
        }

        return respuesta;
    }
    
    public boolean ModificarUsuario(Usuario objeto, int idusuario){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE usuario SET nombre=?, apellido=?, usuario=?, telefono=?, password=?, rol=?  WHERE idusuario ='"+ idusuario+"'");
           consulta.setString(1,objeto.getNombre());
           consulta.setString(2,objeto.getApellido());
           consulta.setString(3,objeto.getUsuario());
           consulta.setString(4,objeto.getTelefono());
           consulta.setString(5,objeto.getPassword());
           consulta.setString(6,objeto.getRol());
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Usuario.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
    
    public boolean ModificarRol(Usuario objeto, int idusuario){
        boolean respuesta=false;
        Connection cn = Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("UPDATE usuario SET rol=? WHERE idusuario ='"+ idusuario+"'");
           consulta.setString(1,objeto.getRol());
     
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Modificar Rol.", "Error", JOptionPane.ERROR_MESSAGE);
    
       }
       return respuesta;
    }
    
    
    public boolean ComprobarRegistro(String Usuario) {
        boolean respuesta = false;
        String Sql = "SELECT usuario FROM usuario WHERE usuario = '" + Usuario + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
}
