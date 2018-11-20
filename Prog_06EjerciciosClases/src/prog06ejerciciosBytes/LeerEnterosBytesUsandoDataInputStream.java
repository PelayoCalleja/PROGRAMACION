/*
 * Leer fichero de enteros grabados como bytes
 */
package prog06ejerciciosBytes;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerEnterosBytesUsandoDataInputStream {

    public static void main(String[] args) {

        //declaracion variables y objetos
        FileInputStream fis = null;
        DataInputStream dis = null;
        int num;

        try {
            fis = new FileInputStream("EnterosGrabadosComoBytesConDataOutputStream.dat");
            dis = new DataInputStream(fis);

            while (true) {
                num = dis.readInt();  //leo  num           
                System.out.print(num + " ");
                System.out.flush();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error no encuentro el fichero");
        }  catch (EOFException ex){
            System.out.println("Final de fichero");
        } catch (IOException ex) {
            System.out.println("Error en lectura");            
        }
        finally {
            try {
                System.out.println("\nYa no hay mas numeros en el fichero");
                
                dis.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerEnterosBytesUsandoDataInputStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        

    }

}
