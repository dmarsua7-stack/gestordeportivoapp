package com.informaticatelde.gestordeportivo.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Multimedia {
    /// TODO: faltaria añadir String url para la url de la imagen.
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idMultimedia;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCarga;
    private String url;

    public Multimedia(){}


    public Multimedia (String nombre, String descripcion, LocalDate fechaCarga, String url) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCarga = fechaCarga;
        this.url = url;


    }

    public Integer getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(Integer idMultimedia){
        this.idMultimedia= idMultimedia;
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

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
