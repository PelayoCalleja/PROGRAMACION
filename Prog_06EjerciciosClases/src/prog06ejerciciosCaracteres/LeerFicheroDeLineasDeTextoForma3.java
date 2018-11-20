package prog06ejerciciosCaracteres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFicheroDeLineasDeTextoForma3 {

    public static void main(String[] args) {

        FileReader fr = null;
        try {
            String linea;
            /**
             * FORMA 3 DE lectura *
             */
            
            /*
            BufferedReader br = null;
            File archivo = new File("fichero_escritura2.txt");
            fr = new FileReader(archivo);   
            br = new BufferedReader(fr);
            */
               
            //o lo que es lo mismo
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("fichero_escritura2.txt"));

            // Leemos linea a linea en el fichero
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro el fichero");
        } catch (IOException ex) {
            System.out.println("problemas en la R/W del fichero");
        }

    }
}
