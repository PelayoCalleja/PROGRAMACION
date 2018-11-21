/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestorDeFicheros;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Academia;
import modelo.Luchador;

/**
 *
 * @author Pelayo
 */
public class Menu {

    private GestorDeFicheros gf;
    private Academia academia;

    public Menu() {
        gf = new GestorDeFicheros();
    }

    public void imprimirMenu() {

        System.out.println("MENÚ ------------------------------\n "
                + " 1-Cargar Fichero en una estructura de memoria\n"
                + " 2-Mostrar los luchadores\n"
                + " 3-Buscar un luchador y mostrar su información\n"
                + " 4-Mostrar el numero de luchadores hay en el club\n"
                + " 5-Añadir un jugador a la colección\n"
                + " 6-Eliminar un jugador de la colección introduciendo su nombre\n"
                + " 7-Grabar un fichero de objetos los jugadores que han conseguido un cinturón de un color\n          determinado\n"
                + " 8-Numero de luchadores que tienen un determinado cinturon\n"
                + " 9-Numero de jugadores que tienen mas de x cinturones \n"
                + " 10-Salir"
                + " Introduce opción");

    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {

            case 1:
                ArrayList<Luchador> luchadores = gf.cargarEnModelo();
                academia = new Academia(luchadores);

                break;
            case 2:
                academia.mostrarLuchadores();
                break;
            case 3:

                Scanner miTeclado = new Scanner(System.in);
                System.out.println("Introduce un nombre");
                String nombre = miTeclado.nextLine();
                System.out.println("Introduce un apellido");
                String apellido = miTeclado.nextLine();
                academia.buscarEimprimir(nombre, apellido);
                break;
            case 4:
                academia.mostrarLuchadoresNum();
                break;
            case 5:
                miTeclado = new Scanner(System.in);
                System.out.println("Introduce un nombre");
                nombre = miTeclado.nextLine();
                System.out.println("Introduce un apellido");
                apellido = miTeclado.nextLine();
                System.out.println("Introduce una edad");
                int edad = miTeclado.nextInt();
                ArrayList<String> cinturones = new ArrayList();

                String color = miTeclado.nextLine();

                do {
                    System.out.println("Introduce un cinturon");
                    color = miTeclado.nextLine();
                    cinturones.add(color);
                } while (!color.equals("fin"));
                Luchador l = new Luchador(nombre, apellido, edad);
                l.setColores(cinturones);
                academia.anadirLuchador(l);

                break;
            case 6:
                miTeclado = new Scanner(System.in);
                System.out.println("Introduce un nombre");
                nombre = miTeclado.nextLine();
                academia.eliminarLuchador(nombre);
                break;
            case 7:
                miTeclado = new Scanner(System.in);
                System.out.println("Introduce un color");
                color = miTeclado.nextLine();
                gf.escribirObjetosFichero(academia.devolverLuchadoresColor(color));
                System.out.println(academia.devolverLuchadoresColor(color));
                break;
            case 8:
                miTeclado = new Scanner(System.in);
                System.out.println("Introduce un color");
                color = miTeclado.nextLine();
                academia.numeroLuchadoresTienenCinturon(color);

                break;
            case 9:
                miTeclado = new Scanner(System.in);
                System.out.println("Introduce un numero");
               int num=miTeclado.nextInt();
               academia.numeroDeCinturosDeLuchadores(num);
                break;
            case 10: System.out.println("Fin del programa");
                break;
        }

    }

}
