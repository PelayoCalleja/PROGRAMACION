package prog06ejerciciosCaracteres;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class GrabarFicheroDeLineasDeTextoForma2 {

    public static void main(String[] args) {

        /**
         * FORMA 2 DE ESCRITURA *
         */
        Writer out = null;
       
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fichero_escritura2.txt"), "UTF-8"));

                        // Escribimos linea a linea en el fichero
            for (int i = 0; i < 10; i++) {
                out.write("escribiendo linea " + i + "\r\n");
            }
            out.flush(); //ojo por seguridad hacer un flush para que graba si queda algo en el buffer
            out.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
