/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import controlador.Controlador;
import modelo.Jugador;
import modelo.Leer;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Me daba pereza comentar, ya verás lo que sigue...
        Controlador control = new Controlador();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        
        
        System.out.println("Introduce el nombre del primer jugador");
        j1.setNombre(Leer.leerDato());
        System.out.println("Introduce el nombre del segundo jugador");
        j2.setNombre(Leer.leerDato());
        control.inicio(j1, j2);
    }

}
