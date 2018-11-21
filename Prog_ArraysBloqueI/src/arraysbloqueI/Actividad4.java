package arraysbloqueI;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        String cadena;
        char letra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cadena");
        cadena = teclado.nextLine();
        System.out.println("Introduce la letra");
        letra = teclado.nextLine().charAt(0);
        StringBuilder sb = new StringBuilder(cadena);

        for (int i = 0; i < sb.length(); i++) {
            if (cadena.charAt(i) == letra) {
                sb.setCharAt(i, letra);
            } else {
                sb.setCharAt(i, '-');
            }

        }
        System.out.println("El resultado es " + sb);
    }

}
