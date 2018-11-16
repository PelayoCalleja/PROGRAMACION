/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author Pelayo
 */
public class GestorDeFicheros {

    public GestorDeFicheros() {

    }

    public void leer() {

        BufferedReader br = null; // nt
        String linea; // nt
        FileReader fr = null; // nt

        // Cambiar el nombre de la clase por lo que sea la fila del fichero
        TokenizarPersonas objToken;

        try {

            // Cambiar aquí por el nombre y la extensión entre comillas
            // El fichero tiene que estar siempre en la misma altura que src
            // Es decir, lo tengo que ver a la vez desde la carpeta raiz
            File nomFile = new File("Mails.csv");

            fr = new FileReader(nomFile); //nt
            br = new BufferedReader(fr); //nt

            linea = br.readLine(); //nt

            while ((linea = br.readLine()) != null) { //nt
                objToken = new TokenizarPersonas(linea); // cambiar por n objeto del mismo tipo del de la línea 35
                Persona p = objToken.tokenizar(); // cambiar por el objeto de lógica que represente cada fila
                // Esta línea es para comprobar si va bien, si la comento funciona igual
                System.out.println("Persona" + p.toString());
            } // No tocar nada a partir de aquí

        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            //Logger.getLogger(MainAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }
    }

    // Cambiar por el objeto que tenga en el modelo
    public ArrayList<Persona> cargarEnModelo() {

        ArrayList<Persona> lista = new ArrayList<>();

        BufferedReader br = null; // nt
        String linea; // nt
        FileReader fr = null; // nt

        // Cambiar el nombre de la clase por lo que sea la fila del fichero
        TokenizarPersonas objToken;

        try {

            // Cambiar aquí por el nombre y la extensión entre comillas
            // El fichero tiene que estar siempre en la misma altura que src
            // Es decir, lo tengo que ver a la vez desde la carpeta raiz
            File nomFile = new File("Mails.csv");

            fr = new FileReader(nomFile); //nt
            br = new BufferedReader(fr); //nt

            linea = br.readLine(); //nt

            while ((linea = br.readLine()) != null) { //nt
                objToken = new TokenizarPersonas(linea); // cambiar por n objeto del mismo tipo del de la línea 35
                Persona p = objToken.tokenizar(); // cambiar por el objeto de lógica que represente cada fila
                lista.add(p); // cambiar el nombre de la variable por la qe puse en la línea anterior
                // Esta línea es para comprobar si va bien, si la comento funciona igual
                //System.out.println(luchador.toString()); // si quiero qe funciones cambiar el nombre de la variable

            } // No tocar nada a partir de aquí
            return lista;
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            //Logger.getLogger(MainAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }
        return null;
    }

    public void escribirObjetosFichero(ArrayList<Object> objetos) {
        String nombreFichero = "salida.dat";

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        
        try {

            fout = new FileOutputStream(nombreFichero);
            for (Object ob : objetos) {
                oos = new ObjectOutputStream(fout);
                oos.writeObject(ob);
            }

            System.out.println("Done");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
