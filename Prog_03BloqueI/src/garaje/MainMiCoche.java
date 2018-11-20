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
public class MainMiCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Motor m = new Motor(170);
        m.setLitrosAceite(2.5);
        
        Coche cochePelayo = new Coche("Opel","Kadett");
        
        cochePelayo.setM(m);
        cochePelayo.getM().getCv();
        cochePelayo.getM().getLitrosAceite();
        cochePelayo.acumuladorAveria(200);
        cochePelayo.acumuladorAveria(400);
        System.out.println(cochePelayo);
        
        
        
    }
    
}
