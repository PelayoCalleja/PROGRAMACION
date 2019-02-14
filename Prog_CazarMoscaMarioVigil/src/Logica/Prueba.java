/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Mosca;
import Modelo.Habitacion;
import Modelo.Jugador;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Habitacion habitacion;
        Mosca mosca;
        Jugador j;

        j = new Jugador();

        habitacion = new Habitacion();

        habitacion.mostrarHabitacion();
        do {
            mosca = new Mosca("M1");
            mosca.calcularPosicion(habitacion.getY(), habitacion.getY());
            /*System.out.println("Pos Y " + mosca.getY());
            System.out.println("Pos X " + mosca.getX());*/
            habitacion.setM(mosca);

            System.out.println("Y");
            int y = Leer.datoInt();
            System.out.println("X");
            int x = Leer.datoInt();

            habitacion.cazarMosca(y, x);

            habitacion.mostrarHabitacion();

            habitacion.borrarMosca();

        } while (habitacion.isFin() != true);
        System.out.println("GANASTE");

    }

}
