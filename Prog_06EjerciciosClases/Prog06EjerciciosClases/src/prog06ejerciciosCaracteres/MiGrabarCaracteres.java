package prog06ejerciciosCaracteres;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiGrabarCaracteres {

    public static void main(String[] args) {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("mificheroCatacteres.txt");
            
            for (int i=1; i<=10; i++){
                pw.write("Escribiendo linea "+i+"\r\n");                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("no encuentro fichero");
        }
        pw.close();
    }

}
