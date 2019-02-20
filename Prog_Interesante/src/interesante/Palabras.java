/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interesante;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String z,y,x,aux;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduce Z");
        z = t.next();
        System.out.println("Z es "+z);
        System.out.println("Introduce Y");
        y = t.next();
        System.out.println("Y es "+y);
        System.out.println("Introduce X");
        x = t.next();
        System.out.println("X es "+x);
        
        aux=z;
        z=y;
        y=x;
        x=aux;
        
        
        
        System.out.println("Z es "+z+", Y es "+y+ " y X es "+x);
    }
    
}
