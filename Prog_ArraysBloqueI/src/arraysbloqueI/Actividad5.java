package arraysbloqueI;

import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {
        String cadena;
        String aux=null;
        char letra;
        int intentos = 10;int i=0;
        Scanner teclado = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("Introduce una cadena");
        cadena = teclado.nextLine();
        
        while(i<intentos||aux.equals(cadena)){
            letra=teclado.nextLine().charAt(0);
            for(int j=0;j<sb.length();i++){
                if(sb.charAt(j)==letra)
                    sb.setCharAt(j, letra);
            }
                
        }


    }
    
}
