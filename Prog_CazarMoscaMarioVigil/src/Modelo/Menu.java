/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Controlador.Juego;
import Modelo.Jugador;
import clasegenericamanipulacionficheroobjetos.MetodosGestionFicherosObjetos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Menu {

    private int select;
    private Juego partida;
    private MetodosGestionFicherosObjetos mGf;
    private Jugador[] ranking;

    public Menu() {

        do {
            System.out.println("/////////////");
            System.out.println("Caza la mosca");
            System.out.println("/////////////");
            System.out.println("Introduce 1 para JUGAR");
            System.out.println("Introduce 2 para ver el RANKING");
            System.out.println("Introduce 3 para SALIR");

            select = Leer.datoInt();

            switch (select) {
                case 1:
                    partida = new Juego();
                    break;

                case 2:
                    mGf = new MetodosGestionFicherosObjetos();
                    mGf.abrirFicheroLecturaObjetos("ranking.dat");
                     {
                        try {
                            ranking = (Jugador[]) mGf.leerUnRegistroFicheroObjetos();
                            int pos = 0;
                            for (int i = 0; i < ranking.length; i++) {
                                
                                if (ranking[i].getIntentos() != 99) {
                                    System.out.println("///////////////////////////////");
                                    pos = 1 + i;
                                    System.out.print(pos + "- ");
                                    System.out.println(ranking[i].toString());
                                }
                                
                            }

                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;

                case 3:
                    break;

            }
        } while (select != 3);

    }

}
