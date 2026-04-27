package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity

public class Habilidad {
    /// TODO: Se simplifica con la creacion de los otros objetos JugadorHabilidad
    /// TODO: Sustituir String categoria por CategoriaEjercicio categoria.
    /// TODO: Añadir Multimedia imagen. Puede ser util.
    /// TODO: Eliminar jugador_id, subcategoria y ejercicio_id.Ya esta información se obtiene de las clases importantes.
/*
    private Integer idHabilidad;
    private String nombre; // Designación de la habilidad
    private String descripcion; // Descripción detallada de la habilidad
    private CategoriaEjercicio categoria;
    private Multimedia multimedia;

    public Habilidad (String nombre, String descripcion, CategoriaEjercicio categoria, Multimedia multimedia) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.multimedia = multimedia;
    }

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(Integer idHabilidad) {
        this.idHabilidad = idHabilidad;
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

    public CategoriaEjercicio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEjercicio categoria) {
        this.categoria = categoria;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

 */
}
