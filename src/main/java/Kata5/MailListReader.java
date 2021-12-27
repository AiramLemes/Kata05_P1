package Kata5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MailListReader {
    
    public static List<String> read(String fileName) {
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        ArrayList<String> mailList = new ArrayList<>();
        
        try {
            archivo = new File (fileName);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            Pattern pat = Pattern.compile("[@]");
            
            while((linea=br.readLine())!=null) {
                
                Matcher mat = pat.matcher(linea);
                
                if (mat.find()) {
                    mailList.add(linea);
                    
                } else { continue;}
                
            
            }
            
            
            
        }
    
    
        catch(Exception e) {
    
            
        
        }
        return mailList;
        
    }
    
}