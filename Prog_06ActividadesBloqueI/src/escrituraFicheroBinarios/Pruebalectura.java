package escrituraFicheroBinarios;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteLeerDatos.Leer;

public class Pruebalectura {

    public static void main(String[] args) {
  
            char c, ult='\0';
            //while ((c = (char) System.in.read()) != '\n') {
            while ((c = Leer.datoCaracter())!='\n'){
                System.out.println(c);
                ult = c;
            }
            System.out.println(ult);
       
    }

}
