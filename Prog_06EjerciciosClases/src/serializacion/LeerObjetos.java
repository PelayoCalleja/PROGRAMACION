package serializacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerObjetos {

    /**
     * lee los objetos de un fichero de objetos -objetos.csv- de personas   
     */
    public static void main(String[] args) {

        Persona p;
        String nombre, apellidos;
        int edad;

        try {
            ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("objetos.dat"));
            try {              
                while (true) {
                    //leemos el objeto persona del fichero
                    p = (Persona) ois.readObject();
                    System.out.println(p.toString());
                }
            } catch (EOFException ex) {
                System.out.println("Ya no hay mas objetos en el fichero");
                ois.close();
            } catch (IOException ex) {
                System.out.println("Error en lectura del registro ");
            } catch (ClassNotFoundException ex) {
                System.out.println("Clase no encontrada");
            }

        } catch (IOException ex) {
            System.out.println("Error en R/W del fichero");
        }
    }
}
