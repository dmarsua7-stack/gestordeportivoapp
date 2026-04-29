package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.*;

/**
 * Esta clase representa la categoria del ejercicio
 */

@Entity
public class CategoriaEjercicio {
    /// TODO: Añadir Integer idCategoriaEjercicio.
    /// TODO: Añadir nombre, descripcion y Multimedia imagen.

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idCategoriaEjercicio;
    private String nombre;
    private String descripcion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "multimedia_id")
    private Multimedia multimedia;

    public CategoriaEjercicio (){

    }

    public CategoriaEjercicio (String nombre, String descripcion, Multimedia multimedia) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

    }


    public Integer getIdCategoriaEjercicio() {
        return idCategoriaEjercicio;
    }

    public void setIdCategoriaEjercicio(Integer idCategoriaEjercicio) {
        this.idCategoriaEjercicio = idCategoriaEjercicio;
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

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
