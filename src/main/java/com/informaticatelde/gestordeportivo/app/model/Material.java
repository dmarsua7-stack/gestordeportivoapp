package com.informaticatelde.gestordeportivo.app.model;

public class Material {
    ///  TODO: Vamos a simplificarlo. Vamos a tener nombre, descripcion y multimedia
    ///  TODO: eliminar cantidad y categoria.
    ///  TODO: Sustituir Integer multimedia_id por Multimedia multimedia.

    private Integer idMaterial;
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private String categoria;
    private Integer multimedia_id;  // En MySql se describe como tipo MediumBlob


    public Material (String nombre,String descripcion, Integer cantidad, String categoria, Integer multimedia_id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.multimedia_id = multimedia_id;

    }

    public Integer getIdMaterial() {
        return idMaterial;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
