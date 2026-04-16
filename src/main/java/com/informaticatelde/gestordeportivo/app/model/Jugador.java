package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Jugador {

    private Integer idJugador;
    private String dniJug;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private String foto;
    private Date fechaNac;
    private String equipo;
    private String categoria;
    private String subcategoria;
    private Integer dorsal;
    private String observaciones;
    private Date fechaReg;


    public Jugador (String dniJug, String nombre, String apellido01, String apellido02,
                         String foto, Date fechaNac, String equipo, String categoria, String subcategoria, Integer dorsal, String observaciones, Date fechaReg) {
        this.dorsal = dorsal;
        this.dniJug = dniJug;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.foto = foto;
        this.fechaNac= fechaNac;
        this.equipo = equipo;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.observaciones = observaciones;
        this.fechaReg = fechaReg;
    }

    public Integer getIdJugador() {
        return idJugador;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
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
}
