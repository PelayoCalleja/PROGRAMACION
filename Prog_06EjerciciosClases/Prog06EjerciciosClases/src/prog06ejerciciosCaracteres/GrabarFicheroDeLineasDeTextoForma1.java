package prog06ejerciciosCaracteres;

import java.io.FileWriter;

public class GrabarFicheroDeLineasDeTextoForma1 {

    public static void main(String[] args) {

        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("fichero_escritura.txt");

            // Escribimos linea a linea en el fichero
            for (int i=0; i< 10; i++) {
                fichero.write("escribiendo linea "+i + "\r\n");
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
