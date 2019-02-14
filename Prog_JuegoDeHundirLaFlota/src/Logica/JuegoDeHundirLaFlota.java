package Logica;

import java.util.Scanner;
import Modelo.GestionDeFichero;
import Modelo.Jugador;
import Modelo.Tablero;

public class JuegoDeHundirLaFlota {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int c, f, jfil, jcol, contadordejugadas;
        boolean acierto = true;
        String nombrejugador;
        int opcion = 1;
        GestionDeFichero gf = new GestionDeFichero();
        while (opcion != 3) {
            System.out.println(" MENÚ GESTIÓN JUEGO");
            System.out.println("1-Jugar juego");
            System.out.println("2-Ver fichero jugadores");
            System.out.println("3-Salir");
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("El nombre del jugador es:" + teclado.nextLine());

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
                    gf.abrirFichero();
                    gf.grabarFichero(jugon);
                    gf.cerrarFichero();
                    break;
                case 2:
                    gf.abrirFichero();
                    gf.leerFichero();
                    gf.cerrarFichero();
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    break;

            }

        }
    }
}
