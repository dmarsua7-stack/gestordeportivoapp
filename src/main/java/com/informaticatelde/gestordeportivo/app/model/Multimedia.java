package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Multimedia {
    /// TODO: faltaria añadir String url para la url de la imagen.
    private Integer idMultimedia;
    private String nombre;
    private String descripcion;
    private Date fechaCarga;
    private String url;



    public Multimedia (String nombre, String descripcion, Date fechaCarga, String url) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCarga = fechaCarga;
        this.url = url;


    }

    public Integer getIdMultimedia() {
        return idMultimedia;
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

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
