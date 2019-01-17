/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadrecuperacion1ºevaluacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pelayo
 */
public class GestorDeFicheros {

    public GestorDeFicheros() {

    }

    public Tragaperras leer(String nombreFichero) {
        Tragaperras t = new Tragaperras();
        ArrayList<Tirada> tiradas = new ArrayList<>();

        BufferedReader br = null;
        String linea;
        FileReader fr = null;

        TokenizarTiradas objToken;

        try {

            File nomFile = new File(nombreFichero);

            fr = new FileReader(nomFile);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {

                objToken = new TokenizarTiradas(linea);
                Tirada tirada = objToken.tokenizar();

                tiradas.add(tirada);
            }
            t.setTiradas(tiradas);
            return t;
        } catch (FileNotFoundException ex) {
            System.out.println("No encuentro ese fichero");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            try {
                fr.close();
                br.close();
                System.out.println("Cerrando fichero");
            } catch (IOException ex) {
                System.out.println("Problemas al cerrar el fichero");
            }
        }
        return null;
    }

    public void guardar(Tragaperras t, String nombreFichero) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(nombreFichero));
            bw.write(t.serializar());

            System.out.println("Se ha guardado correctamente");
        } catch (IOException ex) {
            Logger.getLogger(GestorDeFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(GestorDeFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
