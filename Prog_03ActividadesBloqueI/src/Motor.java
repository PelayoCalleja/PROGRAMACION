/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Motor
 * @author J
 */
public class Motor {
    //Atributos.

    double litros_aceite;
    int cv;

//Constructor.
    /**
     * Constructor para crear el motor con un número de caballos
     * @param cv caballos del motor
     */
    public Motor( int cv) {
        this.litros_aceite = 0;
        this.cv = cv;
    }
    /**
     * Constructor para crear el motor con 0 caballos y 0 litros
     */
    public Motor() {
        litros_aceite=0;
        cv=0;
    }
    /**
     * 
     * @return un entero con el número de litros de aceite
     */
    public double getLitros_aceite() {
        return litros_aceite;
    }

    /**
     * permite asignar el número de litros de aceite al motor
     * @param litros_aceite 
     */
    public void setLitros_aceite(double litros_aceite) {
        this.litros_aceite = litros_aceite;
    }

    /**
     * devuelve el número de caballos del motor
     * @return en numero de caballos del motor
     */
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

 
    /**
     * @Override sobrescribe el método toString de Object 
     * para mostrar el 
     * valor de todos los atributos del objeto 
     */    
    public String toString() {
        return "Motor{" + "litros_aceite=" + litros_aceite + ", cv=" + cv + '}';
    }
    
}
