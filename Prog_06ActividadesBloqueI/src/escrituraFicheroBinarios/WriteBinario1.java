package escrituraFicheroBinarios;
import java.io.*;
import java.util.*;

public class WriteBinario1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;

        try {
            //leemos datos de entrada por teclado y los escribimos en un fichero del objeto fos
            fos = new FileOutputStream("/ficheros/datos.txt");
            salida = new DataOutputStream(fos);

            System.out.print("Introduce número entero. -1 para acabar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //se escribe el número entero en el fichero
                System.out.print("Introduce número entero. -1 para acabar: ");
                n = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
