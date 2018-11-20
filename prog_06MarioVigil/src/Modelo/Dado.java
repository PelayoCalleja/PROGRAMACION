/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Dado {

    private int valor;

    public void tirarDado() {
        valor = (int) (Math.random() * 6 + 1);
        System.out.println("Sacaste un "+ valor);
    }

    public int getvalor() {
        return valor;
    }
}
