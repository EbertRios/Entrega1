/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Administrativo extends Persona {
    private String cargo;

    public Administrativo(int id, String nombre, String apellido, String cargo) {
        super(id, nombre, apellido);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void gestionarPersonal() {
        // Metodo para gestionar el personal
        System.out.println("Gestionando personal como " + getCargo());
    }

    public void gestionarInventario() {
        // Metodo para gestionar el inventario
        System.out.println("Gestionando inventario como " + getCargo());
    }
}