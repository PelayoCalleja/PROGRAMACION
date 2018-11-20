/*
 * Programa que lee un fichero de texto creado con el bloc de notas
* usando clases de lectura de fichero en bytes FileInputStream
 */
package prog06ejerciciosBytes;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFicheroTextoCreadoBlocNotasFileInputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;

        String mensaje = "";
        int valor;

        try {
            fis = new FileInputStream("textoQuijote.txt");

            valor = fis.read();
            while (valor != -1) {
                mensaje += (char) valor;  //el int ASCII lo convertimos a su caracter
                valor = fis.read(); //leemos el siguiente caracter del fichero
            }
            System.out.println("El texto del fichero es: " + mensaje);

        } catch (FileNotFoundException ex) {
            System.out.println("error el fichero no existe");
        } catch (IOException ex) {
            System.out.println("Error en la lectura");
        }

    }

}
