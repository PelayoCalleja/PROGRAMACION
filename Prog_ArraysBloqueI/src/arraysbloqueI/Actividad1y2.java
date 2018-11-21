package arraysbloqueI;

import java.util.Scanner;

public class Actividad1y2 {

    public static void main(String[] args) {
        String cadena;
        char c;
        String aux;
        int caracteres = 0, consonantes = 0, vocales = 0, especiales = 0, numericos = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cadena");
        cadena = teclado.nextLine();
        caracteres = cadena.length();
        System.out.println("Número de caracteres " + caracteres);
        String minus = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {

            if (minus.charAt(i) == 'a' || minus.charAt(i) == 'e' || minus.charAt(i) == 'i' || minus.charAt(i) == 'o'
                    || minus.charAt(i) == 'u') {
                vocales++;
            } else if (minus.charAt(i) > 'b' && minus.charAt(i) <= 'z') {
                consonantes++;
            } else if (minus.charAt(i) >= '0' && minus.charAt(i) <= '9') {
                numericos++;
            } else {
                especiales++;
            }
        }
        System.out.println("Numero de vocales " + vocales);
        System.out.println("Numero de consonates " + consonantes);
        System.out.println("Numero de numericos " + numericos);
        System.out.println("Numero de vespeciales " + especiales);
    }

}
