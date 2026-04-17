package com.informaticatelde.gestordeportivo.app.model;

public class Categoria {

    private Integer idCategoria;
    private String nombre;
    private String descripcion;
    private Equipo equipo;

    public Categoria(String nombre, String descripcion, Equipo equipo) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.equipo = equipo;

    }

    public Integer getIdCategoria() {
        return idCategoria;
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

}

