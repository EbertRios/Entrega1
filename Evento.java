/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */


class Evento {
    private int id;
    private String nombre;
    private String fecha;
    private String descripcion;

    public Evento(int id, String nombre, String fecha, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarParticipante(Persona persona) {
        // Metodo para agregar un participante al evento
        System.out.println("Agregando al participante " + persona.getNombre() + " al evento " + nombre);
    }

    public void eliminarParticipante(Persona persona) {
        // Metodo para eliminar un participante del evento
        System.out.println("Eliminando al participante " + persona.getNombre() + " del evento " + nombre);
    }
}
