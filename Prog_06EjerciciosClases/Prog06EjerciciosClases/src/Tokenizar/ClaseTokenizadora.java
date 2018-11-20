package Tokenizar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Programa que permita leer un fichero csv -creado con el bloc de notas -y lo 
 * convierta en objetos de tipo persona
 * mostrando sus atributos usando el método toString()
 * 
 */
public class ClaseTokenizadora {

    public static Persona tokenizar(String linea) {
        Persona persona=null;

        StringTokenizer tokens = new StringTokenizer(linea, ",");
        
            /*no haria falta el bucle ya que conocemos la estructura del fichero string, string, int
            y cada línea tiene el mismo formato   string, string, int  
            el problema estaría si no hubiera el mismo número de tokens en una línea con lo cual
            no quedaría mas remedio que meter en un bucle con hasmoreToken() para comprobar si hay mas tokens en la linea
            */
            
            String nom = tokens.nextToken();
            String apel = tokens.nextToken();
            int edad = Integer.parseInt(tokens.nextToken().trim());

            persona = new Persona(nom, apel, edad);

        return persona;
    }

    public static void main(String[] args) {

        File fichero = new File("personas.csv");
        FileReader fw;
        BufferedReader br;
        String linea;
        Persona persona;

        try {
            fw = new FileReader(fichero);
            br = new BufferedReader(fw); ///ya podemos leer lineas del fichero

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                //tokenizar linea
                persona = tokenizar(linea);
                
                //muestra el objeto persona leido y tokenizado
                System.out.println(persona.toString());
            }
            br.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Problemas en la Lectura del fichero");
        }

    }

}
