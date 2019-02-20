/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Jugador implements Serializable {
    String nombre;
    int palillosCogidos;

    public Jugador() {
        this.palillosCogidos=0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalillosCogidos() {
        return palillosCogidos;
    }

    public void setPalillosCogidos(int palillosCogidos) {
        this.palillosCogidos = palillosCogidos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", palillosCogidos=" + palillosCogidos + '}';
    }

    public void sumaPalillo(int palillos){
        this.palillosCogidos=this.palillosCogidos+palillos;
    }
    
}
