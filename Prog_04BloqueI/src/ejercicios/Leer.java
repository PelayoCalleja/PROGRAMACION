/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

/**
 *
 * @author Pelayo
 */
public class Leer {

    public static char datoCaracter() {
        char c = '\0';
        try {
            c = (char) System.in.read();
            // limpiar el buffer del flujo de entrada
            System.in.skip(System.in.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static String leerDato() {
        String v_dato = "";
        try {
            //defino el objeto de stream de caracteres de entrada
            InputStreamReader v_str = new InputStreamReader(System.in);
            //defino el buffer por donde se va a leer, el teclado (estandar)
            BufferedReader teclado = new BufferedReader(v_str);
            //aplico el metodo de leer una linea hasta que pulso el intro
            v_dato = teclado.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return v_dato;
    }

    public static short datoShort() {
        try {
            return Short.parseShort(leerDato());
        } catch (NumberFormatException e) {
            return Short.MIN_VALUE; // valor más pequeño
        }
    }
    
    
    
}
