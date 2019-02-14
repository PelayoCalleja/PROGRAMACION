
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionDeFichero {

    Jugador j;
    private FileWriter fw = null;
    private FileReader fr = null;
    
       public void abrirFichero() {

        try {
            fw = new FileWriter("rankingdejugadores.csv", true);
        } catch (IOException ex) {
            Logger.getLogger(GestionDeFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         public void grabarFichero(Jugador jugon) {

        try {
            BufferedWriter fsalida = new BufferedWriter(fw);
            System.out.println("Escribiendo " + jugon.getNombre());
            fsalida.write(jugon.getNombre() + "," + jugon.getIntentos());
            fsalida.write("\n");
            fsalida.flush();
            fsalida.newLine();
        } catch (IOException ex) {
            Logger.getLogger(GestionDeFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          public void leerFichero() {
        try {
            fr = new FileReader("rankingdejugadores.csv");
            BufferedReader registro = new BufferedReader(fr);

            String cadena;
            while ((cadena = registro.readLine()) != null) {
                System.out.println(cadena);                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionDeFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionDeFichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrarFichero() {
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionDeFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


