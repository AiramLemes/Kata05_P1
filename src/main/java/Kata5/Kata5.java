
package Kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Kata5 {

        
    public static void main(String[] args) {
        
        SelectApp app = new SelectApp();
        app.selectAll();
        CrearTabla crearTabla = new CrearTabla();
        crearTabla.createNewTable();
        
        String cadena = new String("email.txt");
        List<String> mail = MailListReader.read(cadena);
            
        InsertarDatosTabla insertarDatosTabla = new InsertarDatosTabla();
        insertarDatosTabla.insert(mail);
        
    }
    
    
    
}


