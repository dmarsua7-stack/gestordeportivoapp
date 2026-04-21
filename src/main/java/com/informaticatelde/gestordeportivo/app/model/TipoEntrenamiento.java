package com.informaticatelde.gestordeportivo.app.model;

public class TipoEntrenamiento {
    /// TODO: Añadir idtipoentrenamiento, nombre, descripcion y multimedia



    private Integer idTipoEntrenamiento;
    private String nombre;
    private String descripcion;
    private Multimedia multimedia;


    public TipoEntrenamiento (String nombre, String descripcion, Multimedia multimedia){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

    }

    public Integer getIdTipoEntrenamiento() {
        return idTipoEntrenamiento;
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
