
/*
Grabar 10 numeros aleatorios entre 1 y 100 usando 
FileOutputStream
*/
package prog06ejerciciosBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnhadirEnterosComoBytes {

      public static void main(String[] args) {
        
          File nomFile = new File ("EnterosGrabadosComoBytes.dat");
          FileOutputStream fos=null;
          int num;
          
          try {
              fos = new FileOutputStream(nomFile,true);
              
              for (int i=0; i <20;i++){
                  num= (int) (Math.random()*100+1);
                  fos.write(num);
                  System.out.println("grabando el num "+num);
                  
              }                 
              
          } catch (FileNotFoundException ex) {
              System.out.println("Error al localizar el fichero");    
          } catch (IOException ex) {
              System.out.println("Error al grabar en el fichero");
          }
          finally{
              try {
                  fos.close();
              } catch (IOException ex) {
                  System.out.println("ERror al cerrar el fichero");}
          }         
          
    }
    
}
