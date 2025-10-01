/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class ClienteNatural extends Cliente {

    public ClienteNatural(String nombreCliente, Cuenta cuentaCliente, String numeroCuenta, int tipoCuenta) {
        super(nombreCliente, cuentaCliente, numeroCuenta, tipoCuenta);
    }
    
    @Override 
    public final String toString() {
        return "Cliente Natural";
    }
    
}
