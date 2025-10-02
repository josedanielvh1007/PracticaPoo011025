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
    protected final String numeroCuenta;
    int saldoCuenta;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public void incrementarSaldo(int valorIncremento) {
        this.saldoCuenta += valorIncremento;
    }
    
    public void reducirSaldo(int valorReduccion) {
        this.saldoCuenta -= valorReduccion;
    }
        
}
