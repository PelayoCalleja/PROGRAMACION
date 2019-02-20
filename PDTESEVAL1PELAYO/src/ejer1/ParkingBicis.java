/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import java.util.Scanner;

/**
 *
 * @author Pelayo
 */
public class ParkingBicis {

    private String nombre;
    private PlazaAparcamiento pa;
    private boolean disponibilidad;
    private Bicicleta bicicletaActual;
  

    public ParkingBicis(String nombre, PlazaAparcamiento pa, boolean disponibilidad) {
        this.nombre = nombre;
        this.pa = pa;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PlazaAparcamiento getPa() {
        return pa;
    }

    public void setPa(PlazaAparcamiento pa) {
        this.pa = pa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Bicicleta getBicicletaActual() {
        return bicicletaActual;
    }

    public void setBicicletaActual(Bicicleta bicicletaActual) {
        this.bicicletaActual = bicicletaActual;
    }

    public boolean aparcar(PlazaAparcamiento p) {
        Scanner sc = new Scanner(System.in);
        Bicicleta b = new Bicicleta();
        String id;
        String marca;
        String color;
        String nombre;
        if (disponibilidad) {//si esta disponible....
            System.out.println("Introduce id de la bici");
            id = sc.nextLine();
            System.out.println("Introduce marca de la bici");
            marca = sc.nextLine();
            System.out.println("Introduce color de la bici");
            color = sc.nextLine();
            System.out.println("Introduce nombre del propietario de la bici");
            nombre = sc.nextLine();
            b.setId(id);
            b.setMarca(marca);
            b.setColor(color);
            b.setNombrePropietario(nombre);
            
            bicicletaActual = b;
            disponibilidad = false;
            System.out.println("La bicicleta se ha aparcado en la plaza " + p.getPlaza());
            return true;
        }
        System.out.println("La plaza " + p.getPlaza() + " esta ocupada");
        return false;
    }

    public boolean salir(PlazaAparcamiento pa) {
        Bicicleta b = new Bicicleta();
            b.getId();
            b.getMarca();
            b.getColor();
            b.getNombrePropietario();
        if (!disponibilidad) {//si no esta disponible....
           
            bicicletaActual = b;
            disponibilidad = true;
            System.out.println("Plaza " + pa.getPlaza() + "libre " + b.toString()+ "ha salido de la plaza");
            return true;
        }
        System.out.println("Error, no hay bicicleta en la plaza numero " + pa.getPlaza() + "de aparcamiento.La plaza esta libre");
        return false;
    }

    public void infoBicicleta() {

    }

    @Override
    public String toString() {
        return "ParkingBicis{" + "nombre=" + nombre + ", pa=" + pa + '}';
    }

}
