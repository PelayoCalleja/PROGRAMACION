package Ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrabarCaracteresEnFichero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        PrintWriter fichero = null;

        try {
            fichero = new PrintWriter("filecaracteres.txt");

            System.out.println("Introduce caracteres:");
            fichero.print(teclado.nextLine());
            fichero.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GrabarCaracteresEnFichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
