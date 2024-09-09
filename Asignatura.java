/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Asignatura {
    private int id;
    private String nombre;

    public Asignatura(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor profesor) {
        // Metodo para agregar un profesor a la asignatura
        System.out.println("Agregando al profesor " + profesor.getNombre() + " a la asignatura " + nombre);
    }

    public void agregarAlumnos(Alumno alumno) {
        // Metodo para agregar alumnos a la asignatura
        System.out.println("Agregando al alumno " + alumno.getNombre() + " a la asignatura " + nombre);
    }
}
