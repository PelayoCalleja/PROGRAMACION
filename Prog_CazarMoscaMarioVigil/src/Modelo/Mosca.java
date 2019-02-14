/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Mosca {

    private String nombre;
    private int y, x;

    public Mosca(String nombre) {
        this.nombre = nombre;
    }

    public void calcularPosicion(int y, int x) {
        this.y = (int) (Math.random()* y);
        this.x = (int) (Math.random()* x);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    
    
}
