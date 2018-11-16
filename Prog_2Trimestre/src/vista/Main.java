/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestorDeFicheros;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Persona;

/**
 *
 * @author Pelayo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorDeFicheros gf = new GestorDeFicheros();
        ArrayList<Persona> personas = null;
        Scanner miTeclado = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 5) {
            mostrarMenu();
            opcion = miTeclado.nextInt();

            switch (opcion) {

                case 1:
                    personas = gf.cargarEnModelo();
                    //System.out.println(personas);

                    System.out.println("Fichero cargado correctamente");
                    break;
                case 2:
                    for (Persona p : personas) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("El numero total de personas es : " + personas.size());
                    break;
                case 4:
                    int max = -1;
                    int numcorreos = -1;
                    ArrayList<Persona> pmax = new ArrayList<>();

                    for (Persona p : personas) {
                        numcorreos = p.getCorreos().size();
                        if (numcorreos > max) {
                            max = numcorreos;
                            pmax = new ArrayList();
                            pmax.add(p);

                        } else if (numcorreos == max) {
                            pmax.add(p);
                        }
                    }
                    for (Persona p : pmax) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Salir");
                    break;

            }

        }
    }

    public static void mostrarMenu() {

        System.out.println("----------------------");
        System.out.println("MENÚ GESTIÓN DE CONSULTA DE URGENCIAS");
        System.out.println("1-Cargar el Fichero en memoria en alguna estructura de datos, teniendo en cuenta que se pueden añadir o borrar informacion de dicha estructura y no se conoce el tamaño del fichero");
        System.out.println("2-A partir de la estructura,mostrar todas las personas y sus correos");
        System.out.println("3-Mostrar cuantas personas hay");
        System.out.println("4-Mostrar quien o quienes son las personas que tienen mas correos");
        System.out.println("5-Salir");
        System.out.println("Selecciona una opcion");

    }

}
