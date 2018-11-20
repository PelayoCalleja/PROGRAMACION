package trabajarConFicherosBytesDeNumeros;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LecturaFileNumBinariosPidiendoNomFilePorTeclado {

    public static void main(String[] args) {
       int enteroAux;
        FileInputStream objFicheroALeer = null;
        String nomFile;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del fichero de números a leer con la extension:");
        nomFile = teclado.nextLine();
        
        try {
            File fichero = new File(nomFile);
            //abierto para leer
            objFicheroALeer = new FileInputStream(fichero);
            
            enteroAux=objFicheroALeer.read();
            //recorrer el fichero para leer
            while (  enteroAux != -1) {
                System.out.println("numero leido "+ enteroAux);
                enteroAux=objFicheroALeer.read();
            }
            System.out.println("Se ha acabado de leer el fichero");
        
        
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentra el fichero a leer");
        } catch (IOException ex) {
            System.out.println("Problemas al leer el fichero");
        } finally {
            try {
                objFicheroALeer.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaFileNumBinariosPidiendoNomFilePorTeclado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

          
    }
    
}
