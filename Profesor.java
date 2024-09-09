/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
class Profesor extends Persona {
    private String especialidad;

    public Profesor(int id, String nombre, String apellido, String especialidad) {
        super(id, nombre, apellido);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void agregarAlumnos() {
        // Metodo para agregar alumnos a las asignaturas del profesor
        System.out.println("Agregando alumnos a las asignaturas del profesor " + getNombre());
    }

    public void obtenerAlumnos() {
        // Metodo para obtener la lista de alumnos del profesor
        System.out.println("Obteniendo la lista de alumnos del profesor " + getNombre());
    }
}
