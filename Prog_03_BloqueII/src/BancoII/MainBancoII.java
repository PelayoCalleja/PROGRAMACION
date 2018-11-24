/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoII;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class MainBancoII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona("Eva", "Porada", "11111111F");
        Persona p2 = new Persona("Jacinto", "Cinete", "22222222A");
        int cantidad;
        CuentaBancaria c1 = new CuentaBancaria(p1, "123",1000);
        CuentaBancaria c2 = new CuentaBancaria(p2, "124");

        System.out.println("Introduzca cantidad");
        cantidad= sc.nextInt();
        
        c1.retirarDinero(cantidad);
        c2.ingresarDinero(300);
        c2.retirarDinero(500);
        
        
    }

}
