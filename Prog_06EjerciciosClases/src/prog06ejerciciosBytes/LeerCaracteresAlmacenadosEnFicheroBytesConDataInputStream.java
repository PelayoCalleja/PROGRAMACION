/*
 * Programa que permite introducir por teclado caracteres hasta pulsar el intro '\n'
 * y los va almacenando en un fichero
 */
package prog06ejerciciosBytes;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerCaracteresAlmacenadosEnFicheroBytesConDataInputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        char caracter;

        try {
            fis = new FileInputStream("ficheroCaracteresBytesDataIOStream.dat");
            dis = new DataInputStream(fis);
            System.out.println("Leyendo caracteres del fichero: ");

            while (true) {  //mientras no EOF   
                caracter = dis.readChar();  //leo el primer caracter si existe sino excepcion EOFException
                System.out.print(caracter);
                System.out.flush();  //vaciamos el buffer de pantalla para que muestre el caracter
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (EOFException ex) {
            System.out.println("\n\nFin de archivo");
        } catch (IOException ex) {
            System.out.println("Error grabando el dato en el fichero");
        } finally {
            try {
                dis.close();
                fis.close();
            } catch (IOException ex) {
                System.out.println("error cerrando fichero");
            }
        }

    }

}
