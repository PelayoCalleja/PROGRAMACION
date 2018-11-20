package logica;

import java.util.Scanner;
import modelo.Coche;
import modelo.Motor;

public class MainCocheLedo {

    public static void main(String[] args) {
        Motor motor;
        Coche cocheLedo;
        Coche cochePelayo;
        Scanner miTeclado = new Scanner(System.in);
        motor = new Motor(170);
        motor.setLitrosdeaceite(2.5);

        System.out.println(motor.toString());

        System.out.println(" Introduce la marca ");
        String marca = miTeclado.nextLine();
      
        System.out.println(" Introduce el modelo ");
        String modelo = miTeclado.nextLine();
        cocheLedo = new Coche(marca, modelo);
        cocheLedo.setMotor(motor);

        cochePelayo=new Coche(" Ford","S-max");
        
        System.out.println(cocheLedo.toString());
        System.out.println(" Los caballos del coche de Ledo son: " + cocheLedo.getMotor().getCv());
        System.out.println(" Averia 300€ ");
        cocheLedo.incrementarImporteAverias(300);
        
        System.out.println(cocheLedo.toString());
        System.out.println(" Nueva averia 500€");
        cocheLedo.incrementarImporteAverias(500);
     
        System.out.println(" Las averias del coche de Ledo son : " + cocheLedo.getAveriaAcumulada());
        
        
        
        

    }

}
