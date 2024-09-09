/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Alumno extends Persona {
    private int edad;

    public Alumno(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void obtenerCalificaciones() {
        // Metodo para obtener las calificaciones del alumno
        System.out.println("Obteniendo calificaciones del alumno " + getNombre());
    }

    public void obtenerAsignaturas() {
        // Metodo para obtener las asignaturas del alumno
        System.out.println("Obteniendo asignaturas del alumno " + getNombre());
    }
}
