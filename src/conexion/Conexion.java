package conexion;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
//import com.sun.jdi.connect.spi.Connection;

public class Conexion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sistema", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexcion" + e);
            JOptionPane.showMessageDialog(null,"Error en la Conexion ");

        }
        return null;
    }

}
