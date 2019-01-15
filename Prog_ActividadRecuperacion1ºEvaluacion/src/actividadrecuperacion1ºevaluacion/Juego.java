package actividadrecuperacion1ºevaluacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class Juego {

    public static void mostrarMenu() {
        System.out.println("----------------------");
        System.out.println("MENÚ APLICACIÓN");
        System.out.println("1-Realizar tirada en máquina tragaperras");
        System.out.println("2-Visualizar las combinaciones que han salido");
        System.out.println("3-Leer fichero csv");
        System.out.println("4-Leer fichero de objeto");
        System.out.println("5-Grabar fichero csv (grabar solo las combinaciones como csv)");
        System.out.println("6-Grabar fichero de objeto (grabar combinaciones como un objeto)");
        System.out.println("7-Comprobar cuantas combinaciones hay de 1er premio");
        System.out.println("8-Comprobar cuantas combinaciones hay de 2º premio");
        System.out.println("9-Comprobar cuantas combinaciones hay de 3º premio");
        System.out.println("0-Salir");
        System.out.println("Introduce opción");
    }

    public static void main(String[] args) {
        Tragaperras t = new Tragaperras();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int opcion = 10;
        while (opcion != 0) {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    t.tirarDeLaPalanca();
                    break;
                case 2:
                    t.visualizarTiradas();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Hay " + t.comprobarPremioPorTipo(1) + " premio de 1º categoria");
                    break;
                case 8:
                    System.out.println("Hay " + t.comprobarPremioPorTipo(2) + " premio de 2º categoria");
                    break;
                case 9:
                    System.out.println("Hay " + t.comprobarPremioPorTipo(3) + " premio de 3º categoria");
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
            }

        }
    }

    /* do {
            System.out.println("Tirando de la palanca");
            
            System.out.println(t);
            System.out.println(t.comprobarPremio());
            System.out.println("Quieres volver a jugar (si/no): ");
            respuesta = sc.nextLine();
            System.out.println("----------------");
        } while (respuesta.equals("si"));
        System.out.println("El total de dinero acumulado es " + t.getContador());
    }*/
}
