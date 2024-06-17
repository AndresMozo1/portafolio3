/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Andrew
 */
public class Main {
    public static void main(String[] args) {
        vista.ClienteView view = new vista.ClienteView();
        controlador.ClienteController controller = new controlador.ClienteController(view);
        view.setVisible(true);
    }
}

