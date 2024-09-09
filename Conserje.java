/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Conserje extends Persona {

    public Conserje(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public void limpiarInstalaciones() {
        // Metodo para limpiar instalaciones
        System.out.println("El conserje " + getNombre() + " está limpiando las instalaciones.");
    }
}
