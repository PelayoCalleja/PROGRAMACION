/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Habitacion {

    private int y, x;
    private Mosca mosca[][];
    private Mosca m;
    private boolean fin;

    public Habitacion() {
        System.out.println("Introduce el ANCHO de la habitación");
        x = Leer.datoInt();
        System.out.println("Introduce el ALTO de la habitación");
        y = Leer.datoInt();

        mosca = new Mosca[y][x];
    }

    public void mostrarHabitacion() {
        
        for (int i = 0; i < mosca.length; i++) {            
            for (int j = 0; j < mosca[i].length; j++) {
                if (mosca[i][j] != null) {
                    System.out.print("M");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");            
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setM(Mosca m) {
        mosca[m.getY()][m.getX()] = m;
    }

    public void borrarMosca() {
        for (int i = 0; i < mosca.length; i++) {
            for (int j = 0; j < mosca[i].length; j++) {
                mosca[i][j] = null;
            }
        }
    }

    public void cazarMosca(int y, int x) {

        if (mosca[y][x] != null) {
            fin = true;
        }
    }

    public boolean isFin() {
        return fin;
    }

}
