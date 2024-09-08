/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
import java.util.List;

public class Administrativo {
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private List<Profesor> personal;
    private List<Inventario> inventarios;
    private List<Conserje> conserjes;
    private List<Cocinero> cocineros;
    private List<Bibliotecario> bibliotecarios;

    // Constructor
    public Administrativo(int id, String nombre, String apellido, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    // Métodos
    public void gestionarPersonal(List<Profesor> personal) {
        this.personal = personal;
    }

    public void gestionarInventario(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public void agregarConserje(Conserje conserje) {
        conserjes.add(conserje);
    }

    public void agregarCocinero(Cocinero cocinero) {
        cocineros.add(cocinero);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public List<Conserje> obtenerConserjes() {
        return conserjes;
    }

    public List<Cocinero> obtenerCocineros() {
        return cocineros;
    }

    public List<Bibliotecario> obtenerBibliotecarios() {
        return bibliotecarios;
    }

    public List<Inventario> obtenerInventarios() {
        return inventarios;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
