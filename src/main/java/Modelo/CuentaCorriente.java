/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(String numeroCuenta, String titularCuenta) {
        super(numeroCuenta, titularCuenta);
    }
    
    @Override
    public final String toString() {
        String infoCuenta = this.getTitularCuenta() + "[" + this.getNumeroCuenta() + "] (Corriente)";
        return infoCuenta;
    }
}
