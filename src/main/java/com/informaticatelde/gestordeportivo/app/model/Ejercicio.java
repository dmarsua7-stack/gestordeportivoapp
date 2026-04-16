package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Time;

public class Ejercicio {

    private Integer idEjercicio;
    private String nombre;
    private String posicion;
    private String descripcion;
    private String multimedia;
    private Time duracion;
    private String categoria;
    private String subcategoria;
    private Integer dificultad;
    private String habilidad;
    private String nombreMaterial;
    private Integer cantMaterial;
    private Integer numJugMin;

    public void Ejercicio (String nombre, String posicion, String descripcion, String multimedia, Time duracion, String categoria,
                            String subcategoria, Integer dificultad, String habilidad, String nombreMaterial, Integer cantMaterial, Integer numJugMin) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.multimedia = multimedia;
        this.duracion = duracion;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.habilidad = habilidad;
        this.nombreMaterial = nombreMaterial;
        this.cantMaterial = cantMaterial;
        this.numJugMin = 1;

    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
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

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public Integer getCantMaterial() {
        return cantMaterial;
    }

    public void setCantMaterial(Integer cantMaterial) {
        this.cantMaterial = cantMaterial;
    }

    public Integer getNumJugMin() {
        return numJugMin;
    }

    public void setNumJugMin(Integer numJugMin) {
        this.numJugMin = numJugMin;
    }


}
