/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class MainGestionParking {

    public static void mostrarMenu() {

        System.out.println("----------------------");
        System.out.println("MENÚ PLAZA APARCAMIENTO BICICLETA");
        System.out.println("1-Aparcar bicicleta");
        System.out.println("2-Sacar bicicleta");
        System.out.println("3-Ver estado de la plaza de aparcamiento");
        System.out.println("4-Salir aplicacion");
        System.out.println("Selecciona una opcion");

    }

    public static void main(String[] args) {
        Bicicleta b1 =new Bicicleta();
        Bicicleta b2 = new Bicicleta();
        PlazaAparcamiento pa =new PlazaAparcamiento("D23");
        ParkingBicis pb = new ParkingBicis("Parking 1", pa,true);
        
        Scanner miTeclado = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 4) {
            mostrarMenu();
            opcion = miTeclado.nextInt();

            switch (opcion) {

                case 4:
                    System.out.println("Fin del programa"+pa.toString());
                    break;
                case 1:
                  pb.aparcar(pa);
                    break;
                case 2:
                    pb.salir(pa);
                    break;
                case 3:
                   
                    break;

            }

        }
    }

}
