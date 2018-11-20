package prog06ejerciciosCaracteres;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFicheroDeLineasDeTextoForma2 {

    public static void main(String[] args) {

        /**
         * FORMA 2 DE lectura *
         */
        BufferedReader in = null;
        String linea;

        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream("fichero_escritura2.txt"), "UTF-8"));

            // Leemos linea a linea en el fichero
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {                
                in.close();
            } catch (IOException ex) {
                System.out.println("Error en cierre de fichero");
            }

        }
    }
}
