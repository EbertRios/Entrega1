/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Cocinero extends Persona {

    public Cocinero(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public void prepararComida() {
        // Metodo para mantener la limpieza
        System.out.println("El cocinero " + getNombre() + " está preparando la comida.");
    }
}
