/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Cliente {
    
    protected final String nombreCliente;
    protected Cuenta cuentaCliente;

    public Cliente(String nombreCliente, String numeroCuenta, int tipoCuenta) {
        this.nombreCliente = nombreCliente;
        switch (tipoCuenta) {
            case 1 -> this.cuentaCliente = new CuentaAhorros(numeroCuenta); 
            case 2 -> this.cuentaCliente = new CuentaCorriente(numeroCuenta);
        }
    }
    
    private void consignacion(int valorConsignacion) {
        this.cuentaCliente.incrementarSaldo(valorConsignacion);
    }
    
    private void retiro(int valorRetiro) {
        this.cuentaCliente.reducirSaldo(valorRetiro);
    }
    
    public void consignarCuenta(int valorConsignacion) {
        int saldoInicial = this.cuentaCliente.getSaldoCuenta();
        int saldoEstimado = saldoInicial + valorConsignacion;
        
        consignacion(valorConsignacion);
        
        if (this.cuentaCliente.getSaldoCuenta() == saldoEstimado) {
            JOptionPane.showMessageDialog(null, "La consignación fue exitosa. Nuevo saldo : " + saldoEstimado);
        }
    }
    
    public void realizarRetiro(int valorRetiro) {
        int saldoInicial = this.cuentaCliente.getSaldoCuenta();
        int saldoEstimado = saldoInicial - valorRetiro;
        
        retiro(valorRetiro);
        
        if (this.cuentaCliente.getSaldoCuenta() == saldoEstimado) {
            JOptionPane.showMessageDialog(null, "El retiro fue exitoso. Nuevo saldo : " + saldoEstimado);
        }
    }
    
    public Cuenta getCuentaCliente() {
        return cuentaCliente;
    }
}
