/*
 * Programa que permite introducir por teclado caracteres hasta pulsar el intro '\n'
 * y los va almacenando en un fichero
 */
package prog06ejerciciosBytes;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrabarCaracteresIntroducidosPorTecladoConDataOutputStream {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        char caracter;

        try {
            fos = new FileOutputStream("ficheroCaracteresBytesDataIOStream.dat");
            dos = new DataOutputStream(fos);
            System.out.println("Introduce caracteres por teclado  INTRO para finalizar");
            while ((caracter = (char) System.in.read()) != '\n') {
                dos.writeChar(caracter); //grabamos el caracter

                // tambien podriamos crear una cadena 
               // String cadena = cadena+caracter;
                // y cuando se termina fuera del bucle 
               
            }
            // dos.writeUTF(cadena);
            System.out.println("Fichero de caracteres grabado");
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error grabando el dato en el fichero");
        }

    }

}
