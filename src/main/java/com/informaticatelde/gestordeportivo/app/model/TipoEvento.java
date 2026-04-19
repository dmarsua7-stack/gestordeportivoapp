package com.informaticatelde.gestordeportivo.app.model;

public class TipoEvento {

    /// TODO: Elimina evento_id. No es necesario. Esa info se obtiene del evento.

    private Integer idTipoEvento;
    private String nombre;
    private String descripcion;
    private Integer evento_id;

    public TipoEvento(String nombre, String descripcion, Integer tipoEvento_id){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.evento_id = evento_id;

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

    public Integer getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(Integer tipoEvento_id) {
        this.evento_id = tipoEvento_id;
    }
}
