package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.*;

/**
 * Esta clase representa la categoria del ejercicio
 */

@Entity
public class CategoriaEjercicio {
    /// TODO: Añadir Integer idCategoriaEjercicio.
    /// TODO: Añadir nombre, descripcion y Multimedia imagen.

    private Integer idCategoriaEjercicio;
    private String nombre;
    private String descripcion;
    private Multimedia multimedia;

    public CategoriaEjercicio (){

    }

    public CategoriaEjercicio (String nombre, String descripcion, Multimedia multimedia) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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

    @OneToOne(cascade = CascadeType.ALL) // CascadeType.ALL significa que si borras el Material, se borra su Multimedia (opcional)
    @JoinColumn(name = "multimedia_id") // Nombre de la columna en la tabla Material
    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
