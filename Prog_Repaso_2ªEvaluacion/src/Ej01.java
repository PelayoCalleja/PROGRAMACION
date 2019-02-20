
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Ej01 {

    ArrayList<Integer> enteros = new ArrayList<Integer>();

    public void leer() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("Ejemplos.csv"));
        String line = null;
        int num = 0;
        while ((line = br.readLine()) != null) {
            String str[] = line.split(",");
            for (int i = 0; i <str.length; i++) {
                num = Integer.parseInt(str[i]);
                enteros.add(num);
            }
        }
    }

    @Override
    public String toString() {
        String msj="";
        for (int i = 0; i < enteros.size(); i++) {
           int num=enteros.get(i);
            msj=msj+String.valueOf(num);
        }
        return msj;
    }
}
