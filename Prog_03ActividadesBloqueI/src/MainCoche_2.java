
import java.util.Scanner;




/**
 *
 * @author J
 */
public class MainCoche_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //podemos crear varios coches, nosotros solo 
        //crearemos uno
        Coche cocheRoberto;

        String marca;
        String modelo;
        double v_litros_aceite;
        int v_cv;
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
        
         //Introducimos los valores por teclado para los atributos de  motorRoberto
        System.out.println("Datos para el motorRoberto");
        System.out.println("Introduzca los litros de aceite : ");
        v_litros_aceite = sc.nextDouble();
        System.out.println("Introduzca los cv del motor: ");
        v_cv = sc.nextInt();
        
        //estos valores introducidos en estas variables tendré que asignarselos
        //como valores a los atributos del motor del objeto coche motorRoberto
        cocheRoberto.getMotor().setCv(v_cv);
        cocheRoberto.getMotor().setLitros_aceite(v_litros_aceite);
                
        //si queremos visualizar los atributos con sus valores del cocheRoberto
        //tenemos que utilizar los métodos que nos ofrece el propio objeto
        //que serán los getter o el método toString()
        
        System.out.println(cocheRoberto.toString());
        
        //otra forma de visualizar seria
        //System.out.println(cocheRoberto.getMarca());
        //System.out.println(cocheRoberto.getModelo());
        //System.out.println(cocheRoberto.getImporteAveria());
        //System.out.println(cocheRoberto.getMotor().getCv());
        //System.out.println(cocheRoberto.getMotor().getLitros_aceite());
        
    }
 }
