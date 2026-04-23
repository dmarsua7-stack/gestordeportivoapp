package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.List;

//@Entity
public class Ejercicio {
    /// TODO: Elimina cantidad esto estará en EjercicioMaterial.
    /// TODO: Elimina nombreMaterial esto estará en EjercicioMaterial.
    /// TODO: un ejercicio puede tener varias imagenes. Sustituye Integer multimedia_id por List<Multimedia> imagenes
    /// TODO: Sustituye Integer categoria_id por CategoriaEjercicio categoriaEjercicio.
    /// TODO: Sustituye Integer habilidad_id por List<Habilidad> habilidades.

/*
    private Integer idEjercicio;
    private String nombre;
    private String posicion;
    private String descripcion;
    private Time duracion;
    private Integer dificultad;
    private Integer numJugMin;
    private CategoriaEjercicio categoriaEjercicio;
    private List<Habilidad> habilidades;
    private List<Multimedia> imagenes;



    public void Ejercicio (String nombre, String posicion, String descripcion, Time duracion, Integer dificultad,
                           Integer numJugMin, CategoriaEjercicio categoriaEjercicio, List<Habilidad> habilidades, List<Multimedia> imagenes) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.numJugMin = numJugMin;
        this.categoriaEjercicio = categoriaEjercicio;
        this.habilidades = habilidades;
        this.imagenes = imagenes;



    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public CategoriaEjercicio getCategoriaEjercicio() {
        return categoriaEjercicio;
    }

    public void setCategoriaEjercicio(CategoriaEjercicio categoriaEjercicio) {
        this.categoriaEjercicio = categoriaEjercicio;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Multimedia> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Multimedia> imagenes) {
        this.imagenes = imagenes;
    }*/
}
