package serializacion;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFileObjetosCrearFileCSV {

    /**
     * lee personas de un fichero de objetos y lo convierto a csv
     */
    public static void main(String[] args) throws IOException {

        Persona p;
        String nombre, apellidos;
        int edad;
        String linea;
        ObjectInputStream ois = null;
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            //variable  de donde vamos a leer los objetos
            ois = new ObjectInputStream(new FileInputStream("objetos.dat"));
            
            //varialbe donde vamos a escribir la linea en formato nombre, apellido, edad
            bw = new BufferedWriter(new FileWriter("misPersonas.csv"));
            while (true) {
                //leemos el objeto persona del fichero
                p = (Persona) ois.readObject();
                System.out.println(p.toString());

                //preparar linea para grabar
                linea = p.getNombre() + "," + p.getApellidos() + "," + p.getEdad() + "\r\n";
                // System.out.println(linea);
                //proceso grabar fichero csv
                bw.write(linea);
                System.out.println("Grabada la linea en el csv: " + linea);

            }

        } catch (EOFException ex) {
            System.out.println("Ya no hay mas objetos en el fichero");
            ois.close();
            bw.close();

        } catch (IOException ex) {
            System.out.println("Error en lectura del registro");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada");
        }
        
    }

}
