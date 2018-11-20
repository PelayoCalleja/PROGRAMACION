/*
 * Programa que permite introducir por teclado caracteres hasta pulsar el intro '\n'
 * y los va almacenando en un fichero
 */
package prog06ejerciciosBytes;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerCaracteresAlmacenadosEnFicheroBytes {

    public static void main(String[] args) {
        FileInputStream fis = null;
        int valor;

        try {
            fis = new FileInputStream("ficheroCaracteresBytes.dat");
            System.out.println("Leyendo caracteres del fichero: ");

            valor = fis.read();  //leo el primer caracter si existe sino me devuelve -1
            while (valor != -1) {  //mientras no EOF   
                //convertimos el entero leido del fichero con read a su equivalente caracter ASCII
                System.out.print((char) valor);
                System.out.flush();  //vaciamos el buffer de pantalla para que muestre el caracter
                valor = fis.read(); //leo el siguiente caracter si existe sino me devuelve -1
            }
            System.out.println("\n\nFin de archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error leyendo el dato en el fichero");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("error cerrando fichero");
            }
        }

    }

}
