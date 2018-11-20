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
public class MainMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motor m1 = new Motor(0);
        Motor m2 = new Motor(0);
        
        int cv;
        double litrosAceite;
        System.out.println("Introduce caballos");
        cv=sc.nextInt();
        System.out.println("Introduce litros de aceite");
        litrosAceite=sc.nextDouble();
        
        m1.setCv(cv);
        m2.setCv(cv);
        m1.setLitrosAceite(litrosAceite);
        m2.setLitrosAceite(litrosAceite);
                
        System.out.println(m1.getCv());
        
        
        
        
        
        
        

    }

}
