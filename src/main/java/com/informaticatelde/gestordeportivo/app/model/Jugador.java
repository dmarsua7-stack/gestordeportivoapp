package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Jugador {

    private Integer idJug;
    private String dniJug;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private Date fechaNac;
    private String categoria; // Esto debería ser otra lista/clase
    private String subcategoria; // Como anidamos categorias dependientes??
    private Integer dorsal;
    private String observaciones;
    private Date fechaReg;
    private String equipo_nombre; // Se debe unir por id?? Pq?
    private Integer multimedia_id; // Foto del jugador

    public Jugador (String dniJug, String nombre, String apellido01, String apellido02,
                         String foto, Date fechaNac, String categoria, String subcategoria, Integer dorsal,
                    String observaciones, Date fechaReg, String equipo_nombre, Integer multimedia_id ) {
        this.dorsal = dorsal;
        this.dniJug = dniJug;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.observaciones = observaciones;
        this.fechaReg = fechaReg;
        this.equipo_nombre = equipo_nombre;
        this.multimedia_id = multimedia_id;
    }

    public Integer getIdJug() {
        return idJug;
    }

    public String getDniJug() {
        return dniJug;
    }

    public void setDniJug(String dniJug) {
        this.dniJug = dniJug;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
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
