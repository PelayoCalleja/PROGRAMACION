/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Mosca;

/**
 *
 * @author Mario
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mosca[][];
        mosca = new int[5][3];

        int[][] tablero;
        tablero = new int[3][5];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                System.out.print("-");

            }
            System.out.println("");
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

}
