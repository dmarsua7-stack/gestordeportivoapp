package com.informaticatelde.gestordeportivo.app.model;

public class Instalacion {

    /// TODO: Sustituye Integer multimedia_id por Multimedia multimedia.
    ///
    private Integer idInstalacion;
    private String nombre;
    private String direccion;
    private String localidad;
    private String gmaps;
    private Integer multimedia_id;


    public void Instalacion (String nombre, String direccion, String localidad, String gmaps, Integer multimedia_id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gmaps = gmaps;
        this.multimedia_id = multimedia_id;

    }

    public Integer getIdInstalacion() {
        return idInstalacion;
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

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
