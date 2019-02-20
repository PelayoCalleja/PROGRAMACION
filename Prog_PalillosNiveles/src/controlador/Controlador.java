/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Leer;
import modelo.Jugador;

/**
 *
 * @author alumno
 */
public class Controlador {

    private String[][] palo;
    private int niveles = 0;
    private GestionFicheros gf = new GestionFicheros();

    public void inicio(Jugador j1, Jugador j2){
        int opcion = -1;
        do{
            this.menu();
            opcion = Leer.datoInt();
            switch(opcion){
                case 1:
                    this.juego(j1, j2);
                    break;
                case 2:
                    this.gf.mostrarRanking();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Introduce una opcion válida");
                    break;
            }
        }while(opcion!=0);
    }
    
    public void juego(Jugador j1, Jugador j2) {
        this.crearNivel();
        do {
            this.mostrarNivel();
            System.out.println("Turno de " + j1.getNombre());
            this.turnoJugador(j1);
            if (finalPartida()) {
                System.out.println("El ganador es :" + j1.getNombre());
                System.out.println("Ha cogido un total de " + j1.getPalillosCogidos() + " palillos");
                gf.grabarGanador(j1);
                break;
            }
            this.mostrarNivel();
            System.out.println("Turno de " + j2.getNombre());
            this.turnoJugador(j2);
            if (finalPartida()) {
                System.out.println("El ganador es: " + j2.getNombre());
                System.out.println("Ha cogido un total de " + j2.getPalillosCogidos() + " palillos");
                gf.grabarGanador(j2);
                break;
            }
        } while (true);
    }

    private void menu(){
        System.out.println("Introduce opcion: ");
        System.out.println("1- jugar una partida");
        System.out.println("2- mostrar el ranking");
        System.out.println("0- salir");
    }
    
    private boolean finalPartida() {
        int contador = 0;
        boolean resultado = false;
        for (int i = 0; i < this.niveles; i++) {
            for (int j = 0; j < this.niveles; j++) {
                if (palo[i][j].equals("| ")) {
                    contador++;
                }
                if (contador > 1) {
                    break;
                }
            }
            if (contador > 1) {
                break;
            }
        }
        if (contador == 1) {
            resultado = true;
        }
        return resultado;
    }

    public void crearNivel() {
        int temporal;
        do {
            System.out.println("Introduce el n de niveles del juego");
            this.niveles = Leer.datoInt();
            if (niveles < 2) {
                System.out.println("Introduce un número mayor de 2");
            }
        } while (niveles < 2);
        this.palo = new String[this.niveles][this.niveles];
        for (int i = 0; i < niveles; i++) {
            temporal = i + 1;
            for (int j = 0; j < niveles; j++) {
                if (temporal > 0) {
                    palo[i][j] = "| ";
                    temporal--;
                } else {
                    palo[i][j] = "  ";
                }
            }
        }

    }

    public void mostrarNivel() {
        for (int i = 0; i < this.niveles; i++) {
            System.out.print(i + "- ");
            for (int j = 0; j < this.niveles; j++) {
                System.out.print(palo[i][j]);
            }
            System.out.println("");
        }
    }

    public void turnoJugador(Jugador j) {
        int lv = 0, quitar = 0;
        boolean comprobar = false;
        do {
            System.out.println("Introduce nivel");
            lv = Leer.datoInt();
            if (lv > this.niveles || this.comprobarLinea(lv) == 0) {
                System.out.println("En el nivel introducido no hay palos o no existe el nivel");
                System.out.println("introduce un numero entre 0 y " + niveles);
            } else {
                comprobar = true;
            }
        } while (!comprobar);
        comprobar = false;
        do {
            System.out.println("Introduce n de palillos a coger");
            System.out.println("solo puedes introducir un máximo de " + this.comprobarQuitar(lv) + " palos");
            quitar = Leer.datoInt();
            if (quitar > 0) {
                if (this.comprobarQuitar(lv) >= quitar) {
                    this.quitarPalos(lv, quitar);
                    comprobar = true;
                } else {
                    System.out.println("Has introducido un valor no permitido");
                }
            } else {
                System.out.println("Introduce un valor correcto");
            }
        } while (!comprobar);
        j.sumaPalillo(quitar);
    }

    private int comprobarLinea(int linea) {
        int contador = 0;
        for (int i = 0; i < this.niveles; i++) {
            if (palo[linea][i].equals("| ")) {
                contador++;
            }
        }
        return contador;
    }

    private int comprobarQuitar(int linea) {
        int contador = 0, contador2 = 0;
        for (int i = 0; i < this.niveles; i++) {
            if (palo[linea][i].equals("| ")) {
                contador++;
            }
        }
        if (contador > 3) {
            return 3;
        } else {
            for (int i = 0; i < this.niveles; i++) {
                for (int j = 0; j < this.niveles; j++) {
                    if (palo[i][j].equals("| ")) {
                        contador2++;
                    }
                }
            }
            //aqui se nota el prueba y error
            if (contador2 <= 3 && contador == contador2) {
                contador--;
            }

            return contador;
        }
    }

    private void quitarPalos(int linea, int palos) {
        int segunda = this.comprobarLinea(linea);
        segunda--;
        for (int i = segunda; i > -1; i--) {
            if (palo[linea][i].equals("| ") && palos != 0) {
                palo[linea][i] = "  ";
                palos--;
            }
        }
    }
}
