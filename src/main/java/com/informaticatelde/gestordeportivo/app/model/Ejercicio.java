package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Time;

public class Ejercicio {
    /// TODO: Elimina cantidad esto estará en EjercicioMaterial.
    /// TODO: Elimina nombreMaterial esto estará en EjercicioMaterial.
    /// TODO: un ejercicio puede tener varias imagenes. Sustituye Integer multimedia_id por List<Multimedia> imagenes
    /// TODO: Sustituye Integer categoria_id por CategoriaEjercicio categoriaEjercicio.
    /// TODO: Sustituye Integer habilidad_id por List<Habilidad> habilidades.


    private Integer idEjercicio;
    private String nombre;
    private String posicion;
    private String descripcion;
    private Time duracion;
    private Integer dificultad;
    private Integer numJugMin;
    private Integer cantidad; // Referente al material necesario
    //Falta añadir el TipoEjercicio y SubtipoEjercicio que se quiera.
    private String nombreMaterial; // Como podemos unirlo a la base de datos??
    private Integer categoria_id;
    private Integer habilidad_id;
    private Integer multimedia_id;



    public void Ejercicio (String nombre, String posicion, String descripcion, Time duracion, Integer dificultad,
                           Integer numJugMin, Integer cantidad,
                           String nombreMaterial,  Integer categoria_id, Integer habilidad_id, Integer multimedia_id) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.numJugMin = numJugMin;
        this.cantidad = cantidad;
        this.nombreMaterial = nombreMaterial;
        this.categoria_id = categoria_id;
        this.habilidad_id = habilidad_id;
        this.multimedia_id = multimedia_id;



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

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public Integer getNumJugMin() {
        return numJugMin;
    }

    public void setNumJugMin(Integer numJugMin) {
        this.numJugMin = numJugMin;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Integer getHabilidad_id() {
        return habilidad_id;
    }

    public void setHabilidad_id(Integer habilidad_id) {
        this.habilidad_id = habilidad_id;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
