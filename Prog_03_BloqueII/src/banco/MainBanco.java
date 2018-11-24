/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class MainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CuentaBancaria c1 = new CuentaBancaria("Eva Porada", "1111111111", 1000);
        CuentaBancaria c2 = new CuentaBancaria("Jacinto Cinete", "2222222222");
        int cantidad;
        
        System.out.println("Introduce cantidad a retirar");
        cantidad=sc.nextInt();
        
        c1.retirarDinero(cantidad);
        
        c2.ingresarDinero(300);
        c2.retirarDinero(500);
        
        
    }

}
