
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pelayo
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        Rectangulo r1 = new Rectangulo(6, 10);
        Triangulo t1 = new Triangulo(5, 4);
        Figura r2 = new Rectangulo(6, 3);
        Figura t2 = new Triangulo(4, 3);
        //Rectangulo r3 = new Figura() NO SE PUEDE HACER
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(t1);
        figuras.add(t2);

        for (Figura f : figuras) {

            //f.dibujarConHueco(); no se puede
            if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujarConHueco();
                
            } else {
                System.out.println(f.dibujar());
            }
        }
        System.out.println(r1.dibujarConHueco());
        System.out.println(r1.comprobarEsCuadrado());
    }

}
