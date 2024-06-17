/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Andrew
 */

import javax.swing.*;
import java.awt.*;
import java.util.List;
import modelo.Cliente;



public class ClienteView extends JFrame {
    private final JTextArea areaClientes;

    public ClienteView() {
        setTitle("Gestión de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        areaClientes = new JTextArea();
        areaClientes.setEditable(false);
        add(new JScrollPane(areaClientes), BorderLayout.CENTER);
    }

    public void mostrarClientes(List<Cliente> clientes) {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : clientes) {
            sb.append("ID: ").append(cliente.getId()).append("\n");
            sb.append("Nombre: ").append(cliente.getNombre()).append("\n");
            sb.append("Dirección: ").append(cliente.getDireccion()).append("\n");
            sb.append("Correo: ").append(cliente.getCorreo()).append("\n");
            sb.append("Teléfono: ").append(cliente.getTelefono()).append("\n");
            sb.append("País: ").append(cliente.getPais()).append("\n");
            sb.append("-------------------------------\n");
        }
        areaClientes.setText(sb.toString());
    }
}
