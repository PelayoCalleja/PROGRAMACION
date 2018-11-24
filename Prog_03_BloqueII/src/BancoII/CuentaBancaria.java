/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoII;

import banco.*;

/**
 *
 * @author Pelayo
 */
public class CuentaBancaria {

    private Persona titular;
    private String numeroCuenta;
    private int saldo;

    public CuentaBancaria(Persona titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
    }

    public CuentaBancaria(Persona titular, String numeroCuenta, int saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
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
        saldo += cantidad;
        System.out.println("El saldo que tiene"+titular+" en la cuenta es " + cantidad);
    }

    public void retirarDinero(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay dinero en el banco para realizar la retirada");
        } else {
            saldo -= cantidad;
            System.out.println("El saldo reitirado"+titular+" ha sido " + cantidad);
        }

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }

}
