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

public class Asignatura {
    private int id;
    private String nombre;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;

    // Constructor
    public Asignatura(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
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

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
