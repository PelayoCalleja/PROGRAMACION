/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pelayo
 */
public class Luchador implements Serializable {

    private static final Serializable SERIALIZABLE = 1L;

    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<String> colores;

    public Luchador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.colores = colores;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    public void setColores(ArrayList<String> colores) {
        this.colores = colores;
    }

    public boolean tieneCinturon(String color) {
        for (String c : colores) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneNumCinturones(int num) {
        if (colores.size() > num) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Luchador{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", colores=" + colores + '}' + "\n";
    }

}
