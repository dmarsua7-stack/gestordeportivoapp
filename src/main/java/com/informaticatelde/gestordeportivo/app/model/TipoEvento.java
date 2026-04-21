package com.informaticatelde.gestordeportivo.app.model;

public class TipoEvento {

    /// TODO: Elimina evento_id. No es necesario. Esa info se obtiene del evento.

    private Integer idTipoEvento;
    private String nombre;
    private String descripcion;


    public TipoEvento(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public Integer getIdTipoEvento() {
        return idTipoEvento;
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
