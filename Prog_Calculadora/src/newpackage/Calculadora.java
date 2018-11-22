/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**import java.util.Scanner;*/

/**
 *
 * @author alumno
 */
public class Calculadora {
    private double x,y;
    /*Scanner sc = new Scanner(System.in);*/
    
    public Calculadora() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    /*public double pedirNumeroY(){
        System.out.println("Inserte el valor de y");
        y = sc.nextDouble();
        return y;
    }
    
    public double pedirNumeroX(){
        System.out.println("Inserte el valor de x");
        x = sc.nextDouble();
        return x;
    }*/

    public double suma(){
        double result;
        result=x+y;
        return result;
    }
    public double resta(){
        double result;
        result=x-y;
        return result;
    }
    public double multiplicar(){
        double result;
        result=x*y;
        return result;
    }
    public double dividir(){
        double result;
        result=x/y;
        return result;
    }
    public double exponenciar(){
        double result;
        result=Math.pow(x, y);
        return result;
    }
    public double raiz(){
        double result;
        result=Math.pow(x, (1/y));
        return result;
    }
}
