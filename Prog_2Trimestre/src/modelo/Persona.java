/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pelayo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Mail> correos;

    public Persona(String nombre, String apellido, ArrayList<Mail> correos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correos = correos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Mail> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<Mail> correos) {
        this.correos = correos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", correos=" + correos + '}';
    }
    
    
}
