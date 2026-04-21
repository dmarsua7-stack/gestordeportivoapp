package com.informaticatelde.gestordeportivo.app.model;

public class CategoriaEquipo {
    /// TODO: Refactorizar la clase y llamarla CategoriEquipo
    /// TODO: Eliminar la propiedad Equipo. No la necesitamos en esta clase. Solo dejamos idCategoriaEquipo, nombre y descripcion.
    private Integer idCategoriaEquipo;
    private String nombre;
    private String descripcion;

    public CategoriaEquipo(String nombre, String descripcion) {

        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public Integer getIdCategoria() {
        return idCategoriaEquipo;
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

}

