package arraysbloqueI;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        
        String cadena;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cadena");
        cadena = teclado.nextLine();
        
        StringBuilder sb=new StringBuilder(cadena);
        for(int i=0;i<sb.length();i++){
            sb.setCharAt(i, '-');
        }
        System.out.println("El resultado es :"+sb);
    }

}
