/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(String numeroCuenta, String titularCuenta) {
        super(numeroCuenta, titularCuenta);
    }
    
    @Override
    public final String toString() {
        String infoCuenta = this.getTitularCuenta() + "[" + this.getNumeroCuenta() + "] (Ahorros)";
        return infoCuenta;
    }
    
}
