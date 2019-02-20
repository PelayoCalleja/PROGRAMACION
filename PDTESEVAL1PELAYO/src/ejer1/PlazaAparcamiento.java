/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author Pelayo
 */
public class PlazaAparcamiento {

    private String plaza;
    private Bicicleta b;
    private int numbicis;

    public PlazaAparcamiento() {
    }
    

    public PlazaAparcamiento(String plaza, Bicicleta b) {
        this.plaza = plaza;
        this.b = b;
    }

    public PlazaAparcamiento(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public Bicicleta getB() {
        return b;
    }

    public void setB(Bicicleta b) {
        this.b = b;
    }

    public int getNumbicis() {
        return numbicis++;
    }

    public void setNumbicis(int numbicis) {
        this.numbicis = numbicis;
    }

  

    public void entrar(Bicicleta b) {
        System.out.println("La bici entra en la plaza");
        System.out.println("Veces que han aparcado en la plaza " + numbicis++);

    }

    @Override
    public String toString() {
        return "Aparcamiento{" + "plazas=" + plaza + ", b=" + b + ", numbicis=" + numbicis++ + '}';
    }

}
