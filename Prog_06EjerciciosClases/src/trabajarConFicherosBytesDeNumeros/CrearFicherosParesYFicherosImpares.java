package trabajarConFicherosBytesDeNumeros;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearFicherosParesYFicherosImpares {

    public static void main(String[] args) {
        int enteroAux;
        FileInputStream objFicheroALeer = null;
        FileOutputStream objFicheroPares = null, objFicheroImpares = null;

        File nombreFicheroALeer = new File("EnterosComoBinario.dat");
        File nombreFicheroPares = new File("FicheroParesBinario.dat");
        File nombreFicheroImpares = new File("FicheroImparesBinario.dat");

        try {
            objFicheroALeer = new FileInputStream(nombreFicheroALeer);  //obj fichero del que leer
            objFicheroPares = new FileOutputStream(nombreFicheroPares); //obj fichero a grabar pares
            objFicheroImpares = new FileOutputStream(nombreFicheroImpares); //obj fichero a grabar impares

            enteroAux = objFicheroALeer.read();
            while (enteroAux != -1) {
                if (enteroAux % 2 == 0) {
                    objFicheroPares.write(enteroAux); //grabo en fichero pares
                    System.out.println("grabando en fichero pares el" + enteroAux);
                } else {
                    objFicheroImpares.write(enteroAux); //grabo en fichero impares
                    System.out.println("grabando en fichero impares el" + enteroAux);
                }
                enteroAux = objFicheroALeer.read();  //leo el siguiente registro
            }
            objFicheroALeer.close();
            objFicheroPares.close();
            objFicheroImpares.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error no se encuentra el fichero");
        } catch (IOException ex) {
            System.out.println("Problemas al leer o grabar informacion en el fichero");
        }
    }
}
