
package lecturaFicheroBinarios;
 import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadBinario2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        char n;
        try {
            fis = new FileInputStream("/ficheros/datos2.txt");
            entrada = new DataInputStream(fis);
            while (true) {   
                n = entrada.readChar();  //se lee  un caracter del fichero
                System.out.print(n+" ");  //se muestra en pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
