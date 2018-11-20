package banco;

import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {
        CuentaBancaria cta1, cta2;
        Scanner sc = new Scanner(System.in);
        float cantidad;

        cta1 = new CuentaBancaria("0000000001", "Eva Porada", 1000);
        cta2 = new CuentaBancaria("0000000002", "Jacinto Cinete");

        //visualizamos las cuentas por pantalla
        System.out.println(cta1.toString());
        System.out.println(cta2.toString());

        //ingreso de una cantidad en la cuenta de Eva
        System.out.print(cta1.getTitular() + " introduce cantidad a ingresar:");
        cantidad = sc.nextFloat();
        cta1.ingresar(cantidad);
        //mostrando saldo de la cuenta de Eva
        System.out.println("Saldo de " + cta1.getTitular() + ": " + cta1.getSaldo());

        //ingreso de 300€ en la cuenta de Jacinto
        cta2.ingresar(300);
        //mostrando saldo de la cuenta de Jacinto
        System.out.println("Saldo de " + cta2.getTitular() + ": " + cta2.getSaldo());

        //retirada de 500€ de la cuenta de Jacinto
        cta2.retirar(500);
        System.out.println(cta2.toString());
    }

}
