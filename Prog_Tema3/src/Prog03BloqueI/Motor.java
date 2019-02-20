/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog03BloqueI;

/**
 *
 * @author Pelayo
 */
public class Motor {
    private double litrosAceite;
    private int cv;

    public Motor(int cv) {
        this.cv = cv;
        this.litrosAceite=0;
    }

    public double getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(double litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
    
    
}
