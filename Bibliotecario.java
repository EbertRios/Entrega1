/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Bibliotecario extends Persona {

    public Bibliotecario(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public void gestionarLibros() {
        // Metodo para gestionar los libros en la biblioteca
        System.out.println("El bibliotecario " + getNombre() + " está gestionando los libros.");
    }
}