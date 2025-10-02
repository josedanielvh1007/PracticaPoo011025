/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class ClienteJuridico extends Cliente {

    public ClienteJuridico(String nombreCliente, String numeroCuenta, int tipoCuenta) {
        super(nombreCliente, numeroCuenta, tipoCuenta);
    }
    
    @Override
    public final String toString() {
        return this.nombreCliente + " : " + cuentaCliente.toString() + " | Categoría: Juridico]";
    }
    
}
