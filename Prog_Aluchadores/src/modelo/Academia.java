
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pelayo
 */
public class Academia {

    private ArrayList<Luchador> luchadores;

    public Academia(ArrayList<Luchador> l) {

        luchadores = l;

    }

    public void anadirLuchador(Luchador l) {
        luchadores.add(l);
    }

    public void mostrarLuchadores() {
        for (Luchador l : luchadores) {
            System.out.println(l);
        }
    }

    public void buscarEimprimir(String nombre, String apellido) {
        for (Luchador l : luchadores) {
            if (l.getNombre().equals(nombre)) {
                if (l.getApellido().equals(apellido)) {
                    System.out.println(l);
                }
            }
        }
    }

    public void mostrarLuchadoresNum() {
        System.out.println("El numero total es " + luchadores.size());

    }

    public void eliminarLuchador(String nombre) {
        for (Luchador l : luchadores) {
            if (l.getNombre().equals(nombre)) {
                luchadores.remove(l);
            }
        }
    }

    public ArrayList<Object> devolverLuchadoresColor(String color) {
        ArrayList<Object> luchadoresConCinturon = new ArrayList<>();
        for (Luchador l : luchadores) {
            if (l.tieneCinturon(color)) {
                luchadoresConCinturon.add(l);
            }
        }
        return luchadoresConCinturon;
    }

    public void numeroLuchadoresTienenCinturon(String color) {
        int contador = 0;
        for (Luchador l : luchadores) {
            if (l.tieneCinturon(color)) {
                contador++;
            }
        }
        System.out.println("El numero de jugadores con cinturon " + color + " es " + contador);
    }
    public void numeroDeCinturosDeLuchadores(int num){
        
        for(Luchador l : luchadores){
            if(l.tieneNumCinturones(num)){
                System.out.println(l);
            }
            
        }
    }
}
