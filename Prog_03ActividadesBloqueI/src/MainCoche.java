
import java.util.Scanner;

/**
 *
 * @author J
 */
public class MainCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //podemos crear varios coches, nosotros solo 
        //crearemos uno
        Coche cocheRoberto;

        String marca;
        String modelo;
        //crear un objeto Scanner para leer por teclado
        Scanner sc = new Scanner(System.in);
        
        //Introducimos los valores por teclado para poder crear el 
        //el coche según los constructores que tenemos diseñado
        //en la clase coche
        System.out.println("Datos para cocheRoberto");
        System.out.println("Introduzca la marca : ");
        marca = sc.nextLine();
        System.out.println("Introduzca el modelo: ");
        modelo = sc.nextLine();
        
        //creamos el objeto cocheRoberto
        cocheRoberto = new Coche(marca, modelo);
        
        //si queremos visualizar los atributos con sus valores del cocheRoberto
        //tenemos que utilizar los métodos que nos ofrece el propio objeto
        //que serán los getter o el método toString()
        
        System.out.println(cocheRoberto.toString());
        
    }
    
}
