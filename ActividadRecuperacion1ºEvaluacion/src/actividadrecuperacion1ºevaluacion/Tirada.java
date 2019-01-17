/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadrecuperacion1ºevaluacion;

/**
 *
 * @author Pelayo
 */
public class Tirada {

    private Slots s1;
    private Slots s2;
    private Slots s3;

    public Tirada() {
        s1 = new Slots();
        s2 = new Slots();
        s3 = new Slots();
        s1.girar();
        s2.girar();
        s3.girar();
    }

    public Slots getS1() {
        return s1;
    }

    public void setS1(Slots s1) {
        this.s1 = s1;
    }

    public Slots getS2() {
        return s2;
    }

    public void setS2(Slots s2) {
        this.s2 = s2;
    }

    public Slots getS3() {
        return s3;
    }

    public void setS3(Slots s3) {
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "[" + s1.getValor() + "][" + s2.getValor() + "][" + s3.getValor()+"] ";
    }

}
