package serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Va creando objetos mientras el usuario quiera y los va grabando en un fichero
 * objetos.dat
 */
public class GrabarObjetos {

    public static void main(String[] args) {

        Persona p;
        Scanner teclado = new Scanner(System.in);
        String nombre, apellidos;
        int edad;
        char continuar;
        try {
            ObjectOutputStream oos
                    = new ObjectOutputStream(new FileOutputStream("objetos.dat"));

            System.out.println("Grabar una persona (s/n): ");
            continuar = (char) System.in.read();

            while (continuar != 'n') {
                // limpiar el buffer del flujo de entrada el  INTRO de haber metido el caracter
                teclado.nextLine();
                //pedir datos para crear el objeto persona
                System.out.println("Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Apellidos:");
                apellidos = teclado.nextLine();
                System.out.println("Edad:");
                edad = teclado.nextInt();
                //crear objeto persona
                p = new Persona(nombre, apellidos, edad);

                //grabar en fichero
                oos.writeObject(p);

                System.out.println("Grabar otra persona (s/n): ");
                continuar = (char) System.in.read();
                teclado.nextLine(); 
            }
            oos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GrabarObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
