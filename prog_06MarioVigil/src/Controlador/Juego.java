package Controlador;

import Modelo.Dado;
import Modelo.GestionFichero;
import Modelo.Jugador;


public class Juego {

    private Dado d1, d2;
    private Jugador j1, j2;
    private GestionFichero gf;
    private int resJ1, resJ2, intentoJ1, intentoJ2, select;
    private boolean ganar;

    public Juego() {
        
        gf = new GestionFichero();

        d1 = new Dado();
        d2 = new Dado();

        j1 = new Jugador();
        j2 = new Jugador();

        j1.setD1(d1);
        j1.setD2(d2);

        do {
            System.out.println(j1.getNombre());
            j1.getD1().tirarDado();
            j1.getD2().tirarDado();
            intentoJ1++;
            System.out.println("tirada " + intentoJ1);
        } while (j1.getD1().getvalor() != j1.getD2().getvalor());
        resJ1 = j1.getD1().getvalor() + j1.getD2().getvalor();
        j1.setIntentos(intentoJ1);
        j1.soltarDados();

        j2.setD1(d1);
        j2.setD2(d2);

        do {
            System.out.println(j2.getNombre());
            j2.getD1().tirarDado();
            j2.getD2().tirarDado();
            intentoJ2++;
            System.out.println("tirada " + intentoJ2);
        } while (j2.getD1().getvalor() != j2.getD2().getvalor());
        resJ2 = j2.getD1().getvalor() + j2.getD2().getvalor();
        j2.setIntentos(intentoJ2);
        j2.soltarDados();
        
        gf.abrirFichero();

        if (intentoJ1 < intentoJ2) {
            select = 1;
        } else {
            if (intentoJ1 > intentoJ2) {
                select = 2;
            } else {
                if (intentoJ1 == intentoJ2) {
                    select = 3;
                }
            }
        }

        switch (select) {

            case 1:
                System.out.println(j1.getNombre() + " es el ganador");
                System.out.println(intentoJ1);
                System.out.println("INTENTOS "+j1.getIntentos());
                gf.grabarFichero(j1);
                gf.cerrarFichero();
                break;

            case 2:
                System.out.println(j2.getNombre() + " es el ganador");
                System.out.println(intentoJ2);
                System.out.println("INTENTOS "+j2.getIntentos());
                gf.grabarFichero(j2);
                gf.cerrarFichero();
                break;

            case 3:
                if (resJ1 > resJ2) {
                    System.out.println(j1.getNombre() + " es el ganador");
                    gf.grabarFichero(j1);
                    gf.cerrarFichero();
                } else {
                    if (resJ1 < resJ2) {
                        System.out.println(j2.getNombre() + " es el ganador");
                        gf.grabarFichero(j2);
                        gf.cerrarFichero();
                    } else {
                        System.out.println("Tablas");
                    }
                }
                break;

        }
        
        gf.leerFichero();

    }

}

