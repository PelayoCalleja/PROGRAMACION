/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Jugador implements Serializable, Comparable <Jugador> {

    private int intentos;

    private String nombre;

    public Jugador() {
        System.out.println("¿Cómo te llamas?");
        nombre = Leer.leerDato();
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador(int intentos, String nombre) {
        this.intentos = intentos;
        this.nombre = nombre;
    }   
      
    @Override
    public String toString() {
        return "Jugador{" + "nombre= " + nombre + " intentos= " + intentos + '}';
    }
    
     @Override
        public int compareTo(Jugador o) {
            if (intentos < o.getIntentos()) {
                return -1;
            }
            if (intentos > o.getIntentos()) {
                return 1;
            }
            return 0;
        }

}
