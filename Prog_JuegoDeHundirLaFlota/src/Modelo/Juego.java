package Modelo;

import java.util.Scanner;

public class Juego {

    private Jugador j;
    private Tablero tb;
    private GestionDeFichero gf;
    private int c, f, jfil, jcol, contadordejugadas;
    private boolean acierto = true;

    public Juego() {
        Scanner teclado = new Scanner(System.in);
        String nombrejugador;
        System.out.println("El nombre del jugador es");
        nombrejugador = teclado.nextLine();
        System.out.println("El número de columnas es: ");
        c = teclado.nextInt();
        System.out.println("El número de filas es:");
        f = teclado.nextInt();

        Tablero tb = new Tablero(f, c);

        tb.cargar(f, c);
        tb.mostrar(f, c);
        contadordejugadas = 0;
        while (acierto) {
            System.out.println("Filas");
            jfil = teclado.nextInt();
            System.out.println("Columnas");
            jcol = teclado.nextInt();
            acierto = tb.jugada(jfil, jcol);
            tb.mostrar(f, c);
            contadordejugadas++;
        }
        System.out.println("Has acertado en: " + contadordejugadas);
        Jugador jugon = new Jugador(nombrejugador, contadordejugadas);
    }
}
