/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadrecuperacion1ºevaluacion;

import java.util.Random;

/**
 *
 * @author Pelayo
 */
public class Slots {

    private int valor;

    public Slots() {
        girar();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void girar(){
        Random r = new Random();
        this.valor = r.nextInt(2);
    }
}
