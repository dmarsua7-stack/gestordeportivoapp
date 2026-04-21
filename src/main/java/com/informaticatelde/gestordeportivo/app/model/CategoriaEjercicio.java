package com.informaticatelde.gestordeportivo.app.model;

/**
 * Esta clase representa la categoria del ejercicio
 */
public class CategoriaEjercicio {
    /// TODO: Añadir Integer idCategoriaEjercicio.
    /// TODO: Añadir nombre, descripcion y Multimedia imagen.

    private Integer idCategoriaEjercicio;
    private String nombre;
    private String descripcion;
    private Multimedia imagen;

    public CategoriaEjercicio (String nombre, String descripcion, Multimedia imagen) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;

    }

    public Integer getIdCategoriaEjercicio() {
        return idCategoriaEjercicio;
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

    public Multimedia getImagen() {
        return imagen;
    }

    public void setImagen(Multimedia imagen) {
        this.imagen = imagen;
    }
}
