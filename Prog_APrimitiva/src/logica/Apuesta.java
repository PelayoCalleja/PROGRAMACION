/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Pelayo
 */
public class Apuesta {

    private String nombre;
    private String apellido;
    private ArrayList<Integer> numeros;

    public Apuesta(String nombre, String apellido, ArrayList<Integer> numeros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeros = numeros;
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

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public boolean tieneNumero(int numero) {
        for (int num : numeros) {
            if (num ==numero) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Registro{" + "nombre=" + nombre + ", apellido=" + apellido + ", numeros=" + numeros + '}' + "\n";
    }

}
