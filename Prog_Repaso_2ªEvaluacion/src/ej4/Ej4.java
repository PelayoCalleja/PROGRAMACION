/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Miguel Jovellanos
 */
public class Ej4 {

    ArrayList<Persona> personas = new ArrayList<Persona>();

    public void leer() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("ej4.csv"));
        String line = null;
        int num = 0;
        Persona p = null;
        String nombre = "";
        String apellido = "";
        while ((line = br.readLine()) != null) {
            String str[] = line.split(",");
            p = new Persona();
            p.setNombre(str[0]);
            p.setApellido(str[1]);
            if (str.length > 2) {
                for (int i = 2; i < str.length; i++) {
                    num = Integer.parseInt(str[i]);
                    p.getNumeros().add(num);
                }
            }
            personas.add(p);
        }
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

}
