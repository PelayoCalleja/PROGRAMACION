/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.GestorDeFicheros;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import logica.Apuesta;

/**
 *
 * @author Pelayo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*GestorDeFicheros gf = new GestorDeFicheros();
        ArrayList<Apuesta> apuestas = gf.cargarEnModelo();
        System.out.println(apuestas);
        Apuesta a = apuestas.get(2);
        System.out.println(a.tieneNumero(5));

        Random r = new Random();
        int valor = r.nextInt(10);
        System.out.println("Estoy mirado si tienen el valor " + valor);
        for (Apuesta a2 : apuestas) {
            if (a2.tieneNumero(valor)) {
                System.out.println(a2);
            }
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce un apellido");
        String apellido = sc.nextLine();

        ArrayList<Integer> nums = new ArrayList<>();
        int contador = 0;
        while (contador < 6) {
            System.out.println("Introduce un numero");
            int numero = sc.nextInt();
            nums.add(numero);
            contador++;
        }
        Apuesta a = new Apuesta(nombre, apellido, nums);
        System.out.println(a);
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random r = new Random();

        contador = 0;
        while (contador < 6) {
            int valor = r.nextInt(10);
            numerosAleatorios.add(valor);
            contador++;
        }
        System.out.println(numerosAleatorios);
        int contadorAciertos = 0;
        int indice = 0;
        for (int num : numerosAleatorios) {
            if (a.getNumeros().get(indice) == num) {
                contadorAciertos++;
            }
            indice++;
        }
        System.out.println(contadorAciertos);

    }

}
