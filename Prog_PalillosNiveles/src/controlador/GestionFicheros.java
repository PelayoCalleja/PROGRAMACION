/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jugador;

/**
 *
 * @author Adán
 */
public class GestionFicheros {

    private File fichero;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private BufferedWriter bw;

    private int contarRegistros() {
        int contador = 0;
        fichero = new File("Ranking.txt");
        String linea = null;
        if (!fichero.exists()) {
            return 0;
        }
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            for (int i = 0; i < 10; i++) {
                if ((linea = br.readLine()) != null) {
                    contador++;
                } else {
                    break;
                }
            }
            br = null;
            fr = null;
            return contador;
        } catch (EOFException ex) {
            br = null;
            fr = null;
            return contador;
        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        br = null;
        fr = null;
        return contador;
    }

    public void grabarGanador(Jugador j) {
        int nArray = this.contarRegistros() + 1;
        String[] registros = new String[nArray];
        if (nArray >= 1) {
            this.abrirFicheroLectura();
            for (int i = 0; i < nArray; i++) {
                registros[i] = this.leerRegistros();
            }
            this.cerrarFicheroLectura();
        }
        registros[registros.length - 1] = " "+j.getPalillosCogidos() + "," + j.getNombre();
        Arrays.sort(registros);
        List li = Arrays.asList(registros);
        Collections.reverse(li);
        li.toArray(registros);
        this.abrirFicheroEscritura();
        int contador = 0;
        for (int i = 0; i < registros.length; i++) {
            if(contador==10){
                break;
            }
            this.grabarRegistro(registros[i]);
            contador++;
        }
        this.cerrarFicheroEscritura();
    }

    public void abrirFicheroEscritura() {
        try {
            fw = new FileWriter("Ranking.txt");
            bw = new BufferedWriter(fw);
        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void grabarRegistro(String linea) {
        try {
            bw.write(linea);
            bw.flush();
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarFicheroEscritura() {
        bw = null;
        fw = null;
    }

    public void abrirFicheroLectura() {
        fichero = new File("Ranking.txt");
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            try {
                fichero.createNewFile();
                this.abrirFicheroLectura();
            } catch (IOException ex1) {
                Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    public void cerrarFicheroLectura() {
        fichero = null;
        fr = null;
        br = null;
    }

    public String leerRegistros() {
        String linea = null;
        if (!fichero.exists()) {
            return null;
        }
        try {
            linea = br.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea;
    }

    public void mostrarRanking() {
        File fich = new File("Ranking.txt");
        StringTokenizer tk;
        Jugador j;
        if (!fich.exists()) {
            System.out.println("El ranking aun no se ha establecido");
        } else {
            this.abrirFicheroLectura();
            int nArray = this.contarRegistros();
            this.cerrarFicheroLectura();
            this.abrirFicheroLectura();
            for (int i = 0; i < nArray; i++) {
                tk = new StringTokenizer(this.leerRegistros(), ",");
                j = new Jugador();
                j.setPalillosCogidos(Integer.parseInt(tk.nextToken().trim()));
                j.setNombre(tk.nextToken());
                System.out.println(j.toString());
            }
            this.cerrarFicheroLectura();
        }

    }
}
