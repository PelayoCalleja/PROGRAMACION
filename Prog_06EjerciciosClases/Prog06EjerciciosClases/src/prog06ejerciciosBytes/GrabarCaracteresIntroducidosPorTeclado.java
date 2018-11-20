/*
 * Programa que permite introducir por teclado caracteres hasta pulsar el intro '\n'
 * y los va almacenando en un fichero
 */
package prog06ejerciciosBytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrabarCaracteresIntroducidosPorTeclado {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        char caracter;

        try {
            fos = new FileOutputStream("ficheroCaracteresBytes.dat");
            System.out.println("Introduce caracteres por teclado  INTRO para finalizar");
            while ((caracter = (char) System.in.read()) != '\n') {
                fos.write(caracter); //grabamos el caracter 
                System.out.print(caracter);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error grabando el dato en el fichero");
        }

    }

}
