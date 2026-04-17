package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Entrenador {

    private Integer idEntrenador;
    private String dniEntrenador;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private Date fechaNac;
    private String especialidad; // Primer entrenador, Segundo, Delegado, Fisio, etc.
    private String nivel; // Esto puede ser un enum
    private String observaciones;
    private Date fechaRegistro; // Se debe añadir aquí un tlfn_id + email_id??
    private String equipo_nombre; // Se debe unir por id?? Pq?
    private Integer multimedia_id; // Foto del entrenador

    public Entrenador (String dniEntrenador, String nombre, String apellido01, String apellido02,
                    Date fechaNac, String especialidad, String nivel, String observaciones, Date fechaRegistro,
                    String equipo_nombre, Integer multimedia_id ) {

        this.dniEntrenador = dniEntrenador;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.especialidad = especialidad;
        this.nivel = nivel;
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
        this.equipo_nombre = equipo_nombre;
        this.multimedia_id = multimedia_id;
    }

    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public String getDniEntrenador() {
        return dniEntrenador;
    }

    public void setDniEntrenador(String dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido01() {
        return apellido01;
    }

    public void setApellido01(String apellido01) {
        this.apellido01 = apellido01;
    }

    public String getApellido02() {
        return apellido02;
    }

    public void setApellido02(String apellido02) {
        this.apellido02 = apellido02;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEquipo_nombre() {
        return equipo_nombre;
    }

    public void setEquipo_nombre(String equipo_nombre) {
        this.equipo_nombre = equipo_nombre;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
