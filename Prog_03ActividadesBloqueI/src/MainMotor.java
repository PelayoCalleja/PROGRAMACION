
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Programa principal que permite crear varios motores
 *
 * @author J
 */
public class MainMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creamos varias variables de tipo motores
        Motor motor1, motor2;

        double v_litros_aceite;
        int v_cv;
        //crear un objeto Scanner para leer por teclado
        Scanner sc = new Scanner(System.in);

        //Introducimos los valores por teclado para motor1
        System.out.println("Datos para el motor1");
        System.out.println("Introduzca los litros de aceite : ");
        v_litros_aceite = sc.nextInt();
        System.out.println("Introduzca los cv del motor: ");
        v_cv = sc.nextInt();
        
        //creamos/instanciamos el objeto motor1
        motor1 = new Motor();
        motor1.setLitros_aceite(v_litros_aceite);
        motor1.setCv(v_cv);

   
        /*
        * tambien podríamos hacer motor1.cv = v_cv;
        * y motor1.litros_aceite= v_litros_aceite;
        * por ser amistosas los atributos de la clase Motor
        */
        
       //Introducimos los valores por teclado para motor2
        System.out.println("Datos para el motor2");
        System.out.println("Introduzca los litros de aceite : ");
        v_litros_aceite = sc.nextInt();
        System.out.println("Introduzca los cv del motor: ");
        v_cv = sc.nextInt();    
       
        
        //creamos/instanciamos el objeto motor2
        // podia hacerlo como antes o utilizar 
        //el otro constructor que me permite meter los cv 
        //y que asigna 0 a los litros de aceite
        motor2 = new Motor(v_cv);
        //para asignar los litros de aceite al motor2
        motor2.setLitros_aceite(v_litros_aceite);
         
        //ahora mismo tenemos dos objetos motor cada uno
        //con sus atributos y sus métodos
        //para visualizar solo tendría que utilizar alguno de los
        //métodos que dispone el objeto bien los getter1 o bien el método toString()             
        System.out.println("datos del motor1");
        System.out.println(motor1.toString());
        
        //para el motor2 voy a visualizarlo utilizando los getter
        System.out.println("\n datos del motor2");
        System.out.println(" Litros de aceite: "+motor2.getLitros_aceite());
        System.out.println(" Cv: "+motor2.getCv());
   
    }

}
