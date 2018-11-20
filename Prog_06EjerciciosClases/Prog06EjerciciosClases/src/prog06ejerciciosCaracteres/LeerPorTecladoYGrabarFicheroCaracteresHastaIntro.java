
package prog06ejerciciosCaracteres;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerPorTecladoYGrabarFicheroCaracteresHastaIntro {

    public static void main(String[] args) {
       
        try {
            FileWriter fw = null;
            char caracter;
            String linea="";
            
            fw = new FileWriter("leerUnaLinea.txt");
            System.out.println("Introduce caracteres por teclado  INTRO para finalizar");
            while ((caracter = (char) System.in.read()) != '\n') {
                linea+=caracter;
                System.out.print(caracter);
            }
            System.out.println("");
            //al salir hemos pulsado el INTRO
            fw.write(linea);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LeerPorTecladoYGrabarFicheroCaracteresHastaIntro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
