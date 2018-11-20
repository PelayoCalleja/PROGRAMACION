package logica;

import modelo.Motor;
import java.util.Scanner;

public class MainMotor {

    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        Motor motor1 = new Motor(0);

        double litrosdeaceite;
        int cv;
        
        System.out.println(" Introduce litros de aceite");
        litrosdeaceite = miTeclado.nextDouble();
        motor1.setLitrosdeaceite(litrosdeaceite);
        System.out.println(" Introduce los cv ");
        cv = miTeclado.nextInt();
        motor1.setCv(cv);
        System.out.println(motor1.toString());
      
   
    
    }
    

}
