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
             JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return null;
    }

}
