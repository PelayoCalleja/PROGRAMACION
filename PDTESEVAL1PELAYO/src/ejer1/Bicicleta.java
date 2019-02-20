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
public class Bicicleta {

    private String id;
    private String marca;
    private String color;
    private String nombrePropietario;

    public Bicicleta() {
    }

    
    
    public Bicicleta(String id, String marca, String color, String nombrePropietario) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.nombrePropietario = nombrePropietario;
    }

    public Bicicleta(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + ", marca=" + marca + ", color=" + color + ", nombrePropietario=" + nombrePropietario + '}';
    }



}
