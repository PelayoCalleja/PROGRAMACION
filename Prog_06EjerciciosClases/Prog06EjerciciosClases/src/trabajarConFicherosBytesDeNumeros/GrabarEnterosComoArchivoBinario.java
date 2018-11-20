package trabajarConFicherosBytesDeNumeros;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrabarEnterosComoArchivoBinario {

    public static void main(String[] args) {

        File nombreFichero = new File("EnterosComoBinario.dat");

        try {
            FileOutputStream objFicheroDondeGrabar = new FileOutputStream(nombreFichero,true);

            for (int cont = 0; cont < 10; cont++) {
                int enteroAux = (int) (Math.random() * 100 + 1);
                objFicheroDondeGrabar.write(enteroAux);
                System.out.println("Grabando el número .... " + enteroAux);
            }
            objFicheroDondeGrabar.close();            
            
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentra fichero");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Problemas en la grabación del dato, comprueba si existe fichero");
            System.out.println(ex.getMessage());
        }

    }

}
