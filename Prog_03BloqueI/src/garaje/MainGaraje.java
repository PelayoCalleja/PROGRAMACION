/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje;

/**
 *
 * @author Pelayo
 */
public class MainGaraje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaje g= new Garaje();
        Coche c = new Coche ("Ford","Fiesta");
        Coche c2 = new Coche("Ford", "Focus");
        String averia="motor roto";
       
        
        
        g.aceptarCoche(c, averia);
        g.aceptarCoche(c, averia);
        
    }
    
}
