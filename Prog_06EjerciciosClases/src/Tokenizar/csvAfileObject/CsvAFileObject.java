package Tokenizar.csvAfileObject;

import Tokenizar.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa que permita leer un fichero csv -creado con el bloc de notas -y lo
 * convierta en objetos de tipo persona mostrando sus atributos usando el método
 * toString()
 *
 */
public class CsvAFileObject {

    //metodo static que permite tokenizar una linea que recibe como parámetro
    public static Persona tokenizar(String linea) {
        Persona persona = null;

        StringTokenizer tokens = new StringTokenizer(linea, ",");

            //como sabemos la estructura de una linea no hace falta el bucle con el hasMoreToken()
            String nom = tokens.nextToken();
            String apel = tokens.nextToken();
            int edad = Integer.parseInt(tokens.nextToken());

            persona = new Persona(nom, apel, edad);
        
        return persona;
    }

    public static void grabarObjetoEnFicheroObjeto(ObjectOutputStream fileObject, Persona persona) {
        try {
            fileObject.writeObject(persona);  //grabo en el archivo de salida de objetos
        } catch (IOException ex) {
            System.out.println("Problema al grabar el objeto en el fichero");
        }
    }

    public static void main(String[] args) {

        File ficheroCSV = new File("personas.csv");
        File ficheroCSVaOBJETOS = new File("CSVaOBJETOS.dat");
        FileReader fw;
        BufferedReader br;
        String linea;
        Persona persona;

        try {
            ObjectOutputStream fileObject; //objeto fichero donde vamos a grabar el objeto
            fileObject = new ObjectOutputStream(new FileOutputStream(ficheroCSVaOBJETOS));

            fw = new FileReader(ficheroCSV);
            br = new BufferedReader(fw); ///ya podemos leer lineas del fichero

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                //tokenizar linea
                persona = tokenizar(linea);

                //grabo y muestra el objeto persona leido y tokenizado
                grabarObjetoEnFicheroObjeto(fileObject, persona);
                System.out.println("Se ha grabado en el fichero de objetos " + persona.toString());
            }
            br.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Problemas en la Lectura del fichero");
        }

    }

}
