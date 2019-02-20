/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.ArrayList;

/**
 *
 * @author Miguel Jovellanos
 */
public class Persona {
    
    private String nombre,apellido;
    private ArrayList<Integer> numeros=new ArrayList<Integer>();

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
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

    @Override
    public String toString() {
        String msj="";
        msj=msj+getNombre()+",";
        msj=msj+getApellido()+",";
        msj=msj+" LISTA NUMEROS:";
        for (Integer numero : numeros) {
            msj=msj+numero+",";
        }
        return msj;
    }
    
    
}
