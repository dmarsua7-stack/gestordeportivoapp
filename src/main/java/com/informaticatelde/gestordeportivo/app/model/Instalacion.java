package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.*;

@Entity
public class Instalacion {

    /// TODO: Sustituye Integer multimedia_id por Multimedia multimedia.
    ///
    ///
    ///
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInstalacion;
    private String nombre;
    private String direccion;
    private String localidad;
    private String gmaps;
    @ManyToOne
    @JoinColumn(name = "multimedia_id_multimedia")
    private Multimedia multimedia;


    public void Instalacion () {

    }

    public void Instalacion (String nombre, String direccion, String localidad, String gmaps, Multimedia multimedia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gmaps = gmaps;
        this.multimedia= multimedia;

    }


    public Integer getIdInstalacion() {
        return idInstalacion;
    }

    public void setIdInstalacion(Integer idInstalacion) {
        this.idInstalacion = idInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGmaps() {
        return gmaps;
    }

    public void setGmaps(String gmaps) {
        this.gmaps = gmaps;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
