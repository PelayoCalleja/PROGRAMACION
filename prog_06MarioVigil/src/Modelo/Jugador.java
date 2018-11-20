/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;




public class Jugador {

    private String nombre;
    private Dado d1, d2;
    private int intentos;

    public Jugador() {
        System.out.println("¿Cómo te llamas?");
        //nombre = Leer.leerDato();
    }

    public Jugador(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dado getD1() {
        return d1;
    }

    public void setD1(Dado d1) {
        this.d1 = d1;
    }

    public Dado getD2() {
        return d2;
    }

    public void setD2(Dado d2) {
        this.d2 = d2;
    }

    public void soltarDados() {
        d1 = null;
        d2 = null;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getIntentos() {
        return intentos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", intentos=" + intentos + '}';
    }

}
