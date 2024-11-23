
package controlador;


import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexion.Conexion;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Usuario;

public class control_categoria {
    
    public boolean guardar(Categoria objeto){
        boolean respuesta=false;
        Connection cn = conexion.Conexion.conectar();
        
       try{
           PreparedStatement consulta = cn.prepareStatement("INSERT INTO categoria VALUES(?,?,?)");
           consulta.setInt(1,0);
           consulta.setString(2, objeto.getDescripcion());
           consulta.setInt(3,objeto.getEstado());
           
           if(consulta.executeUpdate()>0){
               respuesta=true;
           }
           cn.close();
       }catch(SQLException e){
           
       }
       return respuesta;
    }
    
     public boolean ecategoria(String categoria){
        boolean respuesta=false;
         String Sql= "SELECT descripcion FROM categoria WHERE descripcion ='" + categoria +"';";
         Statement st;
       
       
        
       try{
         Connection cn = Conexion.conectar();
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(Sql);
           while(rs.next()){
           respuesta=true;
       }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error");
       }
       return respuesta;
    }
}
