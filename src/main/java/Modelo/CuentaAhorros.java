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
    
    public CuentaAhorros(String numeroCuenta) {
        super(numeroCuenta);
    }
    
    @Override
    public final String toString() {
        String infoCuenta = "Cuenta N°: " + numeroCuenta + " | Saldo: $" + saldoCuenta + " | Tipo: Ahorros";
        return infoCuenta;
    }
    
}
