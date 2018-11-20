package prog06ejerciciosBytes;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopiarArchivos {

    public static void main(String[] args) {

        File fichOriginal = new File("circulos.jpg");
        File fichCopia = new File("copiaCirculos.jpg");

        if (!fichOriginal.exists()) {
            System.out.println("No existe el fichero " +fichOriginal.getName()+" en el directorio ");
        } else {
            try {
                // creamos las instancias del  FileInputStream  y un  FileOutputStream  que se encargaran de leer y escribir archivos respectivamente
                FileInputStream ficheroALeer = new FileInputStream(fichOriginal);
                FileOutputStream ficheroAEscribir = new FileOutputStream(fichCopia);

                //vamos leyendo bytes del fichero a leer  y copiandolos en el fichero a Escribir
                // Instancia una variable que contendrá el byte a leer, se lee byte a byte
                int byteAuxiliar;

                // Informa que se está copiando el archivo
                System.out.println("\n\tEl archivo está siendo copiado....");
                // Lee el archivoEntrada y guarda la informacion en el archivoSalida hasta que hemos llegado a EOF (-1)
                while ((byteAuxiliar = ficheroALeer.read()) != -1) {
                    //lo leido lo tengo que grabar
                    ficheroAEscribir.write(byteAuxiliar);
                }
                System.out.println("\n\tEl archivo se ha copiado con éxito....");
                
                //cerrando ficheros
                ficheroALeer.close();
                ficheroAEscribir.close();
                
            } catch (IOException ex) {
               System.out.println("se ha producido un error en la lectura o escritura");
            }

        }
    }
}
