
package prog06ejerciciosCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiLecturaCaracteres {

    public static void main(String[] args) {
       FileReader fr = null;
       BufferedReader br = null;
       String linea;
       
        try {
            fr = new FileReader("mificheroCatacteres.txt");
            br = new BufferedReader(fr);
            

            while ((linea=br.readLine()) !=null){
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MiLecturaCaracteres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error leyendo en el fichero");
        }
    }
    
}
