/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Habitacion;
import Modelo.Jugador;
import Modelo.Mosca;
import clasegenericamanipulacionficheroobjetos.MetodosGestionFicherosObjetos;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Juego {

    private Habitacion habitacion;
    private Mosca mosca;
    private Jugador j, j2;
    private int y, x, intentos;
    private Jugador ranking[];
    private MetodosGestionFicherosObjetos mGf;

    public Juego() {
        System.out.println("Hola");
        j = new Jugador();

        habitacion = new Habitacion();

        System.out.println("Una mosca acaba de entrar en la habitación");
        System.out.println("Intenta cazarla");

        habitacion.mostrarHabitacion();

        do {
            mosca = new Mosca("M1");
            mosca.calcularPosicion(habitacion.getY(), habitacion.getX());
            /*System.out.println("Pos Y " + mosca.getY());
            System.out.println("Pos X " + mosca.getX());*/
            habitacion.setM(mosca);
            
            do {
                int mensaje = habitacion.getX() - 1;
                System.out.println("Recuerda que el número tiene que se de 0 a " + mensaje);
                System.out.println("Inserta coordenada ANCHO");
                x = Leer.datoInt();
            } while (x > habitacion.getX() - 1);

            do {
                int mensaje = habitacion.getY() - 1;
                System.out.println("Recuerda que el número tiene que se de 0 a " + mensaje);
                System.out.println("Inserta coordenada ALTO");
                y = Leer.datoInt();
            } while (y > habitacion.getY() - 1);
            
            habitacion.cazarMosca(y, x);

            habitacion.mostrarHabitacion();

            habitacion.borrarMosca();

            intentos++;

        } while (habitacion.isFin() != true);
        j.setIntentos(intentos);
        System.out.println("//////////////////////////");
        System.out.println("ENHORABUENA");
        System.out.println("Cazaste la mosca");
        System.out.println("//////////////////////////");
        System.out.println(j.toString());

        mGf = new MetodosGestionFicherosObjetos();

        mGf.abrirFicheroLecturaObjetos("ranking.dat");
        try {
            ranking = (Jugador[]) mGf.leerUnRegistroFicheroObjetos();
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }

        ranking[10] = j;

        Arrays.sort(ranking);

        mGf.abrirFicheroEscrituraObjetos("ranking.dat");
        mGf.grabarObjetoFicheroObjetos(ranking);
        mGf.cerrarFicherosEscrituraObjetos();

        /*ranking = new Jugador[11];

        ranking[10] = j;

        for (int i = 0; i < ranking.length; i++) {
            if (ranking[i] == null) {
                j2 = new Jugador(99, "Juan Nadie");
                ranking[i] = j2;
            }
        }

        Arrays.sort(ranking);

        mGf = new MetodosGestionFicherosObjetos();

        mGf.abrirFicheroEscrituraObjetos("ranking.dat");
        mGf.grabarObjetoFicheroObjetos(ranking);
        mGf.cerrarFicherosEscrituraObjetos();

        mGf.abrirFicheroLecturaObjetos("ranking.dat");
        {
            try {
                ranking = (Jugador[]) mGf.leerUnRegistroFicheroObjetos();
                int pos = 0;
                for (int i = 0; i < ranking.length; i++) {
                    if (ranking[i].getIntentos() != 99) {
                        pos = 1 + i;
                        System.out.print(pos + "- ");
                        System.out.println(ranking[i].toString());
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }*/
    }
}
