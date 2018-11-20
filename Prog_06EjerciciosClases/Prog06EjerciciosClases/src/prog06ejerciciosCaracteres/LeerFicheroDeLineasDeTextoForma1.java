package prog06ejerciciosCaracteres;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LeerFicheroDeLineasDeTextoForma1 {

    public static void main(String[] args) {

        /**
         * FORMA 1 DE lectura *
         */
        Scanner fichero = null;
        String linea;
        try {
            File nomfile = new File("fichero_escritura.txt");

            fichero = new Scanner(nomfile);

            // leemos linea a linea en el fichero
            while (fichero.hasNextLine()){
                    linea = fichero.nextLine();
                    System.out.println(linea);             
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
