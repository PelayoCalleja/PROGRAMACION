/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadrecuperacion1ºevaluacion;

import java.util.ArrayList;

/**
 *
 * @author Pelayo
 */
public class Tragaperras {

    private ArrayList<Tirada> tiradas;
    private int[] premios;
    private int contador;

    public Tragaperras() {
        tiradas = new ArrayList<>();
        premios = new int[4];
        contador = 0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void tirarDeLaPalanca() {
        Tirada t = new Tirada();
        tiradas.add(t);
        int premio = comprobarPremioParaUnaTirada(t);
        String msg = t.toString();
        if (premio > 0) {
            msg += " Hay un premio de " + premio + " categoría ";
        } else {
            msg += " No hay premio ";
        }
        contador += getDinero(premio);
        msg += " valor acumulado " + contador;
        premios[premio] = premios[premio] + 1;
        System.out.println(msg);

    }

    public void visualizarTiradas() {
        for (Tirada t : tiradas) {
            System.out.println(t + " " + comprobarPremio(t));
        }
    }

    public String comprobarPremio(Tirada t) {
        Slots s1 = t.getS1();
        Slots s2 = t.getS2();
        Slots s3 = t.getS3();

        if (s1.getValor() == s2.getValor() && s2.getValor() == s3.getValor()) {
            if (s1.getValor() == 0) {
                return "Premio de 1º categoria";
            } else {
                return "Premio de 2º categoria";
            }

        } else if (s1.getValor() == s2.getValor() || s2.getValor() == s3.getValor()) {
            return "Premio de 3ª categoria";
        } else {
            return "No hay premio";
        }
    }

    public int comprobarPremioParaUnaTirada(Tirada t) {

        // Premios de primera y segunda categoria- todos los numeros iguales
        if (t.getS1().getValor() == t.getS2().getValor() && t.getS2().getValor() == t.getS3().getValor()) {
            if (t.getS1().getValor() == 0) {// Primera categoría
                return 1;
            } else {// Segunda categoría
                return 2;
            }
        } else if (t.getS1().getValor() == t.getS2().getValor() || t.getS2().getValor() == t.getS3().getValor()) {
            return 3;
        } else {
            return 0;
        }

    }

    public int comprobarPremioPorTipo(int tipoPremio) {

        return premios[tipoPremio];

    }

    public int getDinero(int tipoPremio) {
        if (tipoPremio == 1) {
            return 100;
        } else if (tipoPremio == 2) {
            return 50;
        } else if (tipoPremio == 3) {
            return 25;
        } else {
            return 0;
        }
    }

    public String serializar() {
        String cadena = "";
        int premioActual;
        int premioAcumulado = 0;
        for (Tirada t : tiradas) {
            cadena += t.getS1().getValor() + ",";
            cadena += t.getS2().getValor() + ",";
            cadena += t.getS3().getValor() + ",";
            premioActual = comprobarPremioParaUnaTirada(t);
            cadena += premioActual + ",";
            premioAcumulado += getDinero(premioActual);
            cadena += premioAcumulado;
            cadena += "\n";
        }

        return cadena;
    }

    public ArrayList<Tirada> getTiradas() {
        return tiradas;
    }
    
    public void setTiradas(ArrayList<Tirada> tiradas) {
        this.tiradas = tiradas;
        int premioActual;
        int premioAcumulado = 0;
        for (Tirada t : tiradas) {
            premioActual = comprobarPremioParaUnaTirada(t);
            premioAcumulado += getDinero(premioActual);
        }
        contador = premioAcumulado;
    }

}
