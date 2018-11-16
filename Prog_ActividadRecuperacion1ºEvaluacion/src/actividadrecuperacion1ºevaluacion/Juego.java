package actividadrecuperacion1ºevaluacion;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tragaperras t = new Tragaperras();
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Tirando de la palanca");
            t.tirarDeLaPalanca();
            System.out.println(t);
            System.out.println(t.comprobarPremio());
            System.out.println("Quieres volver a jugar (si/no): ");
            respuesta = sc.nextLine();
            System.out.println("----------------");
        } while (respuesta.equals("si"));
        System.out.println("El total de dinero acumulado es "+t.getContador());
    }

}
