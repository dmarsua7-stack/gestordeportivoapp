package com.informaticatelde.gestordeportivo.app.model;

public class Subcategoria {

    private Integer idSubcategoria;
    private String nombre;
    private String descripcion;
    private Integer categoria_id;


    public Subcategoria (String nombre, String descripcion, Integer categoria_id){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria_id = categoria_id;

    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
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

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }
}
