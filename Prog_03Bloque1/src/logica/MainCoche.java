package logica;

import java.util.Scanner;
import modelo.Coche;
import modelo.Motor;

public class MainCoche {

    public static void main(String[] args) {

        Coche coche1, coche2;
        String marca, modelo;
        Scanner miTeclado = new Scanner(System.in);

        System.out.println(" Introduce la marca del coche ");
        marca = miTeclado.next();

        System.out.println(" Introduce el modelo del coche ");
        modelo = miTeclado.next();

        coche1 = new Coche(marca, modelo);
        System.out.println(coche1.toString());

        coche2= new Coche (" Seat ", " Panda");
        
        //crear varios motores
        Motor motor90, motor140, motor200;
        motor90 = new Motor(90);
        motor140 = new Motor(140);
        motor200 = new Motor(200);

        coche1.setMotor(motor200);

        System.out.println(" Coche1 ");
        System.out.println(" litros de aceite " + coche1.getMotor().getLitrosdeaceite());
        System.out.println(" Caballos " + coche1.getMotor().getCv());

        //haciendolo con el toString
        coche1.setMotor(motor200);
        System.out.println(coche1.toString());

        coche2.setMotor(motor90);
        System.out.println(coche2.toString());

        Coche cocheMayorPotencia;
        cocheMayorPotencia = coche1.getMotor().getCv() > coche2.getMotor().getCv() ? coche1 : coche2;

        System.out.println(" Coche mayor potencia " + cocheMayorPotencia.toString());
      String mayorPotencia= coche1.getMotor().getCv()>coche2.getMotor().getCv()? " coche1 ":"coche2";
      System.out.println(" coche de mayor potencia"+mayorPotencia);
        
    }

}
