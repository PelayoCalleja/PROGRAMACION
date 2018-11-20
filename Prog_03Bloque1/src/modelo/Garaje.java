package modelo;

public class Garaje {
//atributos 

    private Coche coche;
    private String averiaAsociada;
    private int numCochesAtendidos;

//metodos getter y setter
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public void setAveriaAsociada(String averiaAsociada) {
        this.averiaAsociada = averiaAsociada;
    }

    public int getNumCochesAtendidos() {
        return numCochesAtendidos;
    }

    public void setNumCochesAtendidos(int numCochesAtendidos) {
        this.numCochesAtendidos = numCochesAtendidos;
    }

    public boolean aceptarCocheTaller(Coche coche, String averia) {
        if (this.coche == null) {
            this.coche = coche;
            this.averiaAsociada = averia;
            return true;
        } else {
            return false;
        }

    }

    public void sacarCocheTaller() {
       //variables locales
        int importeAveriaAux;
        
        if (this.coche == null) {
            System.out.println(" Error, no hay coches en el taller");

        } else {
            numCochesAtendidos++;
            importeAveriaAux = (int) (Math.random() * 100 + 100);
            coche.incrementarImporteAverias(importeAveriaAux);
            System.out.println(" Sacando coche garaje:Averia "+averiaAsociada+" importe: "+importeAveriaAux);
            coche=null;
            averiaAsociada=null;
        
        
        
        
        }
        
        
        
    }

    @Override
    public String toString() {
        return "Garaje{" + "coche=" + coche + ", averiaAsociada=" + averiaAsociada + ", numCochesAtendidos=" + numCochesAtendidos + '}';
    }

}
