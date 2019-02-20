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
public class Interesante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z,y;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduce Z");
        z = t.nextInt();
        System.out.println("Z es "+z);
        System.out.println("Introduce Y");
        y = t.nextInt();
        System.out.println("Y es "+y);
        
        z= z+y;
        y= z-y;
        z= z-y;
        
        System.out.println("Z es "+z+" e Y es "+y);
    }
    
}
