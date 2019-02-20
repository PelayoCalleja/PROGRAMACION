/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pelayo
 */
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String dibujar() {
        String almacenar = "";
        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < base; columna++) {
                almacenar = almacenar + "*";
            }
            almacenar = almacenar + "\n";
        }
        return almacenar;
    }

    public String dibujarConHueco() {
        String almacenar = "";
        for (int fila = 0; fila < altura; fila++) {//fila
            for (int columna = 0; columna < base; columna++) {//columna

                if (fila != 0 && fila != altura - 1) {//entra si es fila distinta a primera o ultima
                    if (columna == 0 || columna == base - 1) {
                        almacenar = almacenar + "*";
                    } else {
                        almacenar = almacenar + " ";
                    }
                } else {// la primera y la ultima fila
                    almacenar = almacenar + "*";
                }
            }
            almacenar = almacenar + "\n";
        }

        return almacenar;
    }

    public boolean comprobarEsCuadrado() {
       /* if (base == altura) {
            return true;

        }

        return false;*/
//es lo mismo que escribir 
        return base==altura;
    }
}
