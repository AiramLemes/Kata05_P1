
package Kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class InsertarDatosTabla {
    
    private Connection connect() {
        // Cadena de conexión SQLite
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
    
    // Método para insertar datos en la tabla direcc_email
    public void insert(List<String> emails) {
        String sql = "INSERT INTO EMAIL(mail) VALUES(?)";
        
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for( String email: emails){
                pstmt.setString(1, email);
                pstmt.executeUpdate();
            }
            
            System.out.println("Datos introducidos correctamente");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
