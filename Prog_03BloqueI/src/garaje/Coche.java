/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje;

/**
 *
 * @author Pelayo
 */
public class Coche {
    private Motor m;
    private String marca;
    private String modelo;
    private double precioAcumulado;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.m =m;
    }

    public Motor getM() {
        return m;
    }

    public void setM(Motor m) {
        this.m = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void setPrecioAcumulado(double precioAcumulado) {
        this.precioAcumulado = precioAcumulado;
    }
    
    
    public void acumuladorAveria(double importe){
        precioAcumulado+=importe;
    }

    @Override
    public String toString() {
        return "Coche{" + "m=" + m + ", marca=" + marca + ", modelo=" + modelo + ", precioAcumulado=" + precioAcumulado + '}';
    }
    
}
