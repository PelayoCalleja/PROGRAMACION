/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Pelayo
 */
public class MainEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char num;
        String cadena;
        short num1;
        
        System.out.println("Introducir una cadena:");
        cadena = Leer.leerDato();
        System.out.println("Introduce un numero");
        num = Leer.datoCaracter();
        System.out.println("la cadena es: " + cadena);
        System.out.println("El numero es:" + num);

        //leer un entero corto
        System.out.println("Leer numero entero corto:");
        num1 = Leer.datoShort();
        System.out.println("has introducido un :" + num1);
    }

}
