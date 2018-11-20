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
public class MainPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor(150);
        Motor m2 = new Motor(200);
        Coche c = new Coche("Ford ", "Focus");
        Coche c2 = new Coche("Fiat", "Punto");

        c.setM(m);
        c.getM().getCv();
        c2.setM(m2);
        c2.getM().getCv();
        c.acumuladorAveria(200);
        c2.acumuladorAveria(210);
        c.acumuladorAveria(80);
        c2.acumuladorAveria(50);
        if (c.getM().getCv() > c2.getM().getCv()) {
            System.out.println("El coche " + c + " tiene mas caballos");
        } else {
            System.out.println("El coche " + c2 + " tiene mas caballos");
        }

    }

}
