package com.informaticatelde.gestordeportivo.app.model;

public class Material {
    ///  TODO: Vamos a simplificarlo. Vamos a tener nombre, descripcion y multimedia
    ///  TODO: eliminar cantidad y categoria.
    ///  TODO: Sustituir Integer multimedia_id por Multimedia multimedia.

    private Integer idMaterial;
    private String nombre;
    private String descripcion;
    private Multimedia multimedia;  // En MySql se describe como tipo MediumBlob


    public Material (String nombre,String descripcion, Multimedia multimedia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

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

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
