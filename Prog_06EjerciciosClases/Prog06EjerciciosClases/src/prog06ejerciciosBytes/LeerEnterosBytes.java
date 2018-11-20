/*
 * Leer fichero de enteros grabados como bytes
 */
package prog06ejerciciosBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerEnterosBytes {

    public static void main(String[] args) {
        
        //declaracion variables y objetos
        FileInputStream fis =null;
        int num;    
        int contador=0;
        
        try {
            fis = new FileInputStream("EnterosGrabadosComoBytes.dat");
            
           num= fis.read();
           while (num !=-1){
               contador++;
               System.out.print(num+" ");
               System.out.flush();
               num= fis.read();  //leo el sgte num              
           }
            System.out.println("\nYa no hay mas numeros en el fichero");
            System.out.println("El total de números es "+contador);
       
        } catch (FileNotFoundException ex) {
            System.out.println("Error no encuentro el fichero"); 
        } catch (IOException ex) {
            System.out.println("Error en lectura");}
        
    }
    
}
