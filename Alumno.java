/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

class Alumno extends Persona {
    private int edad;
    private List<Calificacion> calificaciones;
    private List<Asignatura> asignaturas;

    public Alumno(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido);
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    // Método para agregar una calificación al alumno
    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
        System.out.println("Calificación agregada al alumno " + getNombre() + ": " + calificacion.getValor());
    }

    // Método para obtener todas las calificaciones del alumno
    public List<Calificacion> obtenerCalificaciones() {
        return calificaciones;
    }

    // Método para agregar asignaturas
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
        System.out.println("Asignatura " + asignatura.getNombre() + " agregada al alumno " + getNombre());
    }

    // Método para obtener todas las asignaturas del alumno
    public List<Asignatura> obtenerAsignaturas() {
        return asignaturas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
