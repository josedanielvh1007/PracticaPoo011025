/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class Cuenta {    
    private final String numeroCuenta;
    private final String titularCuenta;
    int saldoCuenta;

    public Cuenta(String numeroCuenta, String titularCuenta ) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
        
}
