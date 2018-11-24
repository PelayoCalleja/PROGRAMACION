/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Pelayo
 */
public class CuentaBancaria {

    private String nombreTitular;
    private String numeroCuenta;
    private int saldo;

    public CuentaBancaria(String nombreTitular, String numeroCuenta) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
    }

    public CuentaBancaria(String nombreTitular, String numeroCuenta, int saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(int cantidad) {
        saldo+=cantidad;
        System.out.println("El saldo que tienes en la cuenta es "+cantidad);
    }

    public void retirarDinero(int cantidad) {
       if(cantidad>saldo){
           System.out.println("No hay dinero en el banco para realizar la retirada");
       }else{
           saldo-=cantidad;
            System.out.println("El saldo reitirado ha sido "+ cantidad);
       }
       
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombreTitular=" + nombreTitular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }

}
