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
public class Jugador {

    private String nombre;
    private Dado d1;
    private Dado d2;
    private int[] tiradas;

    public Jugador(String nombre, Dado d1, Dado d2) {
        this.nombre = nombre;
        this.d1 = d1;
        this.d2 = d2;
        tiradas = new int[d1.getCaras() + d2.getCaras()+1];
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

    public int[] getTiradas() {
        return tiradas;
    }

    public void setTiradas(int[] tiradas) {
        this.tiradas = tiradas;
    }

    public boolean tirar() {
        int num1 = 0;
        int num2 = 0;
        int suma = 0;

        d1.generarNumero();
        num1 = d1.getNumero();

        d2.generarNumero();
        num2 = d2.getNumero();

        suma = num1 + num2;
        
        int valor = tiradas[suma];
        tiradas[suma]=valor+1;
         System.out.println("La suma es " + suma);
        mostrarTiradas();
       
        if (suma == 2) {
            System.out.println("Los dados han sacado doble 1");
            return true;

        }
        System.out.println("Intentalo de nuevo");
        return false;
    }

    public void mostrarTiradas(){
        for (int i = 0; i < tiradas.length; i++) {
            System.out.print(i+"["+tiradas[i]+"]");
            if(i!=tiradas.length-1)
                System.out.print("-");
        }
        System.out.println("");
    }
    
    public void jugar(){
        boolean resultado;
        do{
            System.out.println("Tirando los dados....");
            resultado=tirar();
                    
                    
        }while(resultado==false);
        System.out.println("El resultado es 2.Fin del juego");
        
    }
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", d1=" + d1 + ", d2=" + d2 + ", tiradas=" + tiradas + '}';
    }

}
