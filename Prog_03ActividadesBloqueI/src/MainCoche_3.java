
import java.util.Scanner;
/**
 *
 * @author J
 */
public class MainCoche_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //podemos crear varios coches, nosotros solo 
        //crearemos uno
        Coche cocheTuNombre;
        Motor objMotor;

        String marca;
        String modelo;
        double v_litros_aceite;
        int v_cv;
        //crear un objeto Scanner para leer por teclado
        Scanner sc = new Scanner(System.in);
        
        //Introducimos los valores por teclado para poder crear el 
        //el coche según los constructores que tenemos diseñado
        //en la clase coche
        System.out.println("Datos para cocheTuNombre");
        System.out.println("Introduzca la marca : ");
        marca = sc.nextLine();
        System.out.println("Introduzca el modelo: ");
        modelo = sc.nextLine();
        
        //creamos el objeto cocheRoberto
        cocheTuNombre = new Coche(marca, modelo);
        
         //Introducimos los valores por teclado para los atributos de  motor
        System.out.println("Datos para el motor");
        System.out.println("Introduzca los litros de aceite : ");
        v_litros_aceite = sc.nextDouble();
        System.out.println("Introduzca los cv del motor: ");
        v_cv = sc.nextInt();
        
        //creamos el objeto motor
        objMotor = new Motor(v_cv);
        objMotor.setLitros_aceite(v_litros_aceite);
        
        //asignamos este nuevo motor a cocheTuNombre
        cocheTuNombre.setMotor(objMotor);
                
        //si queremos visualizar los atributos con sus valores del cocheRoberto
        //tenemos que utilizar los métodos que nos ofrece el propio objeto
        //que serán los getter o el método toString()
        
        System.out.println(cocheTuNombre.toString());
        
        //otra forma de visualizar seria
        //System.out.println(cocheTuNombre.getMarca());
        //System.out.println(cocheTuNombre.getModelo());
        //System.out.println(cocheTuNombre.getImporteAveria());
        //System.out.println(cocheTuNombre.getMotor().getCv());
        //System.out.println(cocheTuNombre.getMotor().getLitros_aceite());
        
    }
 }
