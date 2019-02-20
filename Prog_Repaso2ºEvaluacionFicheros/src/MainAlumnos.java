import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainAlumnos {

    public static void main(String[] args) {

        //Declaracion de variables
        BufferedReader br = null;
        String linea;
        FileReader fr = null;
        TokenizarAlumno objToken;
        try {

            File nomFile = new File("Alumnos.csv");
            fr = new FileReader(nomFile);
            br = new BufferedReader(fr);

            linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                objToken = new TokenizarAlumno(linea);
                Alumno alumno = objToken.tokenizar();
                System.out.println("Alumno" + alumno.toString() + " media: " + alumno.calcularNotaMedia());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            Logger.getLogger(MainAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }

    }

}
