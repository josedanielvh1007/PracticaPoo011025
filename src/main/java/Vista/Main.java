/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Main {
    
    private static final ArrayList<Cliente> clientes = new ArrayList<>();


    public static void main(String[] args) {
        
        int option;
        
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                    Menu : 
                                    1. Ingrese nuevo cliente.
                                    2. Listar clientes.
                                    3. Consignaciones.
                                    4. Reembolsos.
                                    5. Retiros.
                                    6. Salir."""));
            
            switch (option) {
                case 1 -> {
                    String nombreCliente = JOptionPane.showInputDialog("Nombre : ");
                    int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                   Seleccione el tipo de cliente : 
                                                                                   1. Cliente natural.
                                                                                   2. Cliente jurídico."""));
                    int tipoCuenta = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                  Ingrese el tipo de cuenta : 
                                                                                  1. Cuenta de ahorros.
                                                                                  2. Cuenta corriente."""));
                    
                    String numeroCuenta = String.valueOf(clientes.size() + 1);
                    switch (tipoCliente) {
                        case 1 -> clientes.add(new ClienteNatural(nombreCliente, numeroCuenta, tipoCuenta));
                        case 2 -> clientes.add(new ClienteJuridico(nombreCliente, numeroCuenta, tipoCuenta));
                    }
                }
                case 2 -> {
                    String texto = "Listado clientes : \n\n";
                    for (Cliente clt : clientes ) {
                        texto += clt.toString();
                    }
                    JOptionPane.showMessageDialog(null, texto);
                }
                case 3 -> consignarCliente();
                case 4 -> reembolsoCliente();
                case 5 -> retiroCliente();
                case 6 -> JOptionPane.showMessageDialog(null, "Saliendo de la app...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente.");
            }
        } while (option != 6);
    }
    
    
    private static void consignarCliente() {
        String numeroCuenta = JOptionPane.showInputDialog("Número de cuenta: ");
        Cliente cliente = buscarClientePorCuenta(numeroCuenta);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a consignar: "));
        cliente.getCuentaCliente().incrementarSaldo(valor);
        JOptionPane.showMessageDialog(null, "Nuevo saldo: " + cliente.getCuentaCliente().getSaldoCuenta());
    }

    private static void retiroCliente() {
        String numeroCuenta = JOptionPane.showInputDialog("Número de cuenta: ");
        Cliente cliente = buscarClientePorCuenta(numeroCuenta);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a retirar: "));
        if (valor > cliente.getCuentaCliente().getSaldoCuenta()) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
            return;
        }
        cliente.getCuentaCliente().reducirSaldo(valor);
        JOptionPane.showMessageDialog(null, "Nuevo saldo: " + cliente.getCuentaCliente().getSaldoCuenta());
    }
    
    private static void reembolsoCliente() {
        String numeroCuenta = JOptionPane.showInputDialog("Número de cuenta: ");
        Cliente cliente = buscarClientePorCuenta(numeroCuenta);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a reembolsar: "));
        cliente.getCuentaCliente().incrementarSaldo(valor);
        JOptionPane.showMessageDialog(null, "Nuevo saldo: " + cliente.getCuentaCliente().getSaldoCuenta());
    }

    private static Cliente buscarClientePorCuenta(String numeroCuenta) {
        for (Cliente c : clientes) {
            if (c.getCuentaCliente().getNumeroCuenta().equals(numeroCuenta)) {
                return c;
            }
        }
        return null;
    }
}
