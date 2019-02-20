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
public class MainBici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nombre;
       Bicicleta b1=new Bicicleta("1236","Marca1", "Azul","Juan");
       Bicicleta b2=new Bicicleta("1258", "Marca2");
       PlazaAparcamiento pa=new PlazaAparcamiento("C43",b1);
       
     
        pa.entrar(b1);
        pa.entrar(b1);
        System.out.println(pa.toString());
       
       
       
        System.out.println(b1.getId());
        System.out.println(b1.getMarca());
        System.out.println(b1.getColor());
        System.out.println(b1.getNombrePropietario());
        System.out.println(b2.getId());
        System.out.println(b2.getMarca());
       
        System.out.println("Introduce el nombre del propietario");
        nombre=sc.nextLine();
        
        
        System.out.println("El nombre del propietario de la bicicleta 2 es "+nombre);
        System.out.println(b1.toString());
        b2.setNombrePropietario(nombre);
        System.out.println(b2.toString());
        System.out.println("El nombre del propietario de la bicicleta 1 es "+b1.getNombrePropietario());
        System.out.println("El nombre del propietario de la bicicleta 2 es "+b2.getNombrePropietario());
    }
    
}
