package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Multimedia {

    private Integer idArchivo;
    private String nombre;
    private String descripcion;
    private Date fechaCarga;
    private Integer jugador_id;
    private Integer entrenador_id;
    private Integer instalacion_id;
    private Integer ejercicio_id;
    private Integer entrenamiento_id;
    private Integer equipo_id;
    private Integer evento_id;


    public Multimedia (String nombre, String descripcion, Date fechaCarga, Integer jugador_id,
                       Integer entrenador_id, Integer instalacion_id, Integer ejercicio_id,
                       Integer entrenamiento_id, Integer equipo_id, Integer evento_id) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCarga = fechaCarga;
        this.jugador_id = jugador_id;
        this.entrenador_id = entrenador_id;
        this.instalacion_id = instalacion_id;
        this.ejercicio_id = ejercicio_id;
        this.entrenamiento_id = entrenamiento_id;
        this.equipo_id = equipo_id;
        this.evento_id = evento_id;

    }

    public Integer getIdArchivo() {
        return idArchivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Integer getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(Integer entrenador_id) {
        this.entrenador_id = entrenador_id;
    }

    public Integer getInstalacion_id() {
        return instalacion_id;
    }

    public void setInstalacion_id(Integer instalacion_id) {
        this.instalacion_id = instalacion_id;
    }

    public Integer getEjercicio_id() {
        return ejercicio_id;
    }

    public void setEjercicio_id(Integer ejercicio_id) {
        this.ejercicio_id = ejercicio_id;
    }

    public Integer getEntrenamiento_id() {
        return entrenamiento_id;
    }

    public void setEntrenamiento_id(Integer entrenamiento_id) {
        this.entrenamiento_id = entrenamiento_id;
    }

    public Integer getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Integer equipo_id) {
        this.equipo_id = equipo_id;
    }

    public Integer getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(Integer evento_id) {
        this.evento_id = evento_id;
    }
}
