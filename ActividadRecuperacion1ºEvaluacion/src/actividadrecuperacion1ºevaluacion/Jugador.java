/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadrecuperacion1ºevaluacion;

/**
 *
 * @author Pelayo
 */
public class Jugador {

    private String nombre;
    private double dineroDisponible;
    private Tragaperras t;

    public Jugador(String nombre, double dineroDisponible, Tragaperras t) {
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
        this.t = t;
    }

    public void jugar() {
        if (dineroDisponible > 0) {
            dineroDisponible -= 1;
            t.tirarDeLaPalanca();
            System.out.println(toString());
        } else {
            System.out.println("El jugador no tiene dinero");
        }
    }

    @Override
    public String toString() {
        return "A " + nombre + " le quedan " + dineroDisponible + " €";
    }

}
