/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Pelayo
 */
public class Dado {
    private int caras;
    private int numero;

    public Dado(int caras) {
        this.caras = caras;
        
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dado{" + "caras=" + caras + ", numero=" + numero + '}';
    }

   public void generarNumero(){
        numero=(int)(Math.random()*caras)+1;
        System.out.println(numero);
    }
    
    
}
