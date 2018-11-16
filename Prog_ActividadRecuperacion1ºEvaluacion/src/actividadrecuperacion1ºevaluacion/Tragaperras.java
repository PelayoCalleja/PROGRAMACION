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
public class Tragaperras {
    private Slots s1;
    private Slots s2;
    private Slots s3;
    private int contador;
    
    public Tragaperras() {
        s1 = new Slots();
        s2 = new Slots();
        s3 = new Slots();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void tirarDeLaPalanca() {
        s1.girar();
        s2.girar();
        s3.girar();
    }

    public String comprobarPremio() {
        
        if (s1.getValor() == s2.getValor() && s2.getValor() == s3.getValor()) {
            if(s1.getValor()==0){
                contador+=100;
              return "Premio de 1º categoria";   
            }else{
                contador+=50;
                return "Premio de 2º categoria";
            }
           
        } else if (s1.getValor() == s2.getValor() || s2.getValor() == s3.getValor()) {
            contador+=25;
            return "Premio de 3ª categoria";
        } else {
            return "No hay premio";
        }
    }

    @Override
    public String toString() {
        return "Combinación " + s1.getValor() + " " + s2.getValor() + " " + s3.getValor();
    }

}
