/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Andrew
 */
import java.util.List;
import modelo.Cliente;
import modelo.ClienteDAO;
import vista.ClienteView;

public final class ClienteController {
    private final ClienteView view;
    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteView view) {
        this.view = view;
        this.clienteDAO = new ClienteDAO();
        cargarClientes();
    }

    public void cargarClientes() {
        List<Cliente> clientes = clienteDAO.obtenerTodosLosClientes();
        view.mostrarClientes(clientes);
    }
}
