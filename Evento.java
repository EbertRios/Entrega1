/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

/**
 *
 * @author user
 */
import java.util.Date;
import java.util.List;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private String descripcion;
    private List<Alumno> participantes;

    // Constructor
    public Evento(int id, String nombre, Date fecha, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Métodos
    public void agregarParticipante(Alumno alumno) {
        participantes.add(alumno);
    }

    public void eliminarParticipante(Alumno alumno) {
        participantes.remove(alumno);
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alumno> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Alumno> participantes) {
        this.participantes = participantes;
    }
}
