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
public class Garaje {

    private Coche c;
    private String averiaAsociada;
    private int numCoches;
    private Coche cocheActual;

    public Coche getC() {
        return c;
    }

    public void setC(Coche c) {
        this.c = c;
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public void setAveriaAsociada(String averiaAsociada) {
        this.averiaAsociada = averiaAsociada;
    }

    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }

    public boolean aceptarCoche(Coche coche, String averia) {
        int importeAveria;
        
        if (cocheActual == null) {
            cocheActual = coche;
            averiaAsociada = averia;
            importeAveria = importeAveria = (int) (Math.random() * 100 + 100);
            System.out.println("El coche " + coche + " ha entrado en el garaje y tiene " + 
                    averiaAsociada + " "+importeAveria+" euros de averia");
            return true;

        } else {
            System.out.println("El garaje ya esta ocupado por el coche " + cocheActual);
            return false;

        }
    }

    @Override
    public String toString() {
        return "Garaje{" + "c=" + c + ", averiaAsociada=" + averiaAsociada + ", numCoches=" + numCoches + '}';
    }

}
