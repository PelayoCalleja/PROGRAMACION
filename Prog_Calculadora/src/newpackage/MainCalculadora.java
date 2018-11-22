/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,y;
        int p;
        Scanner sc= new Scanner(System.in);
        Calculadora c = new Calculadora();
        
        System.out.println("Introduce la x");
        x=sc.nextDouble();
        c.setX(x);
        
        System.out.println("Introduce la Y");
        y=sc.nextDouble();
        c.setY(y);
        
        System.out.println("Esocoja 1 para sumar");
        System.out.println("Esocoja 2 para restar");
        System.out.println("Esocoja 3 para multiplicar");
        System.out.println("Esocoja 4 para dividir");
        System.out.println("Esocoja 5 para exponenciar");
        System.out.println("Esocoja 6 para hacer la raiz");
        
        p=sc.nextInt();
        while(p<=0&p>6){
            System.out.println("Por favor escoja un numero valido");
            p=sc.nextInt();
        }
        
        switch(p){
            case 1: c.suma();
            case 2: c.resta();
            case 3: c.multiplicar();
            case 4: c.dividir();
            case 5: c.exponenciar();
            case 6: c.raiz();
                
        }
        System.out.println(c);
    }
    
}
