/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Pelayo
 */
public class MainJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dado d1=new Dado(6);
        Dado d2=new Dado(6);
        Jugador j1=new Jugador("Jugador1", d1, d2);
        
        
        j1.jugar();
        
        
    }
    
}
