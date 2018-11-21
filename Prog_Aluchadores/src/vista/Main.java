/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        Scanner miTeclado = new Scanner(System.in);
        int numero = 0;
        while (numero != 10) {
            m.imprimirMenu();
            numero = miTeclado.nextInt();
            m.procesarOpcion(numero);
        }
    }
}
