/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Andrew
 */
public class Cliente {
    private final int id;
    private final String nombre;
    private final String direccion;
    private final String correo;
    private final String telefono;
    private final String pais;

    public Cliente(int id, String nombre, String direccion, String correo, String telefono, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.pais = pais;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getPais() { return pais; }
}

