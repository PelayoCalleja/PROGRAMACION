/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class MainCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelo;
        String marca;

        System.out.println("Introduce marca del coche");
        marca = sc.nextLine();
        System.out.println("Introduce modelo del coche");
        modelo = sc.nextLine();

        Coche c = new Coche(marca, modelo);
        Motor m1;
        m1 = new Motor(0);

        c.setM(m1);
        c.getM();
        c.getM().setCv(120);
        c.getM().setLitrosAceite(1.9);
        System.out.println(c);

    }

}
