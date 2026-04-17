package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Evento {


    private Integer idEvento;
    private String nombre;
    private String ubicacion;
    private String direccion;
    private String localidad;
    private String gmaps;
    private Date fecha;
    private Timestamp hora;
    private Timestamp horaConcentracion;
    private Integer multimedia_id;
    private Integer tipoEvento_id;


    public void Evento (String nombre, String ubicacion, String direccion, String localidad, String gmaps,
             Date fecha, Timestamp hora, Timestamp horaConcentracion, Integer multimedia_id, Integer tipoEvento_id) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gmaps = gmaps;
        this.fecha = fecha;
        this.hora = hora;
        this.horaConcentracion = horaConcentracion;
        this.multimedia_id = multimedia_id;
        this.tipoEvento_id = tipoEvento_id; // "Online / Físico " y tambien "Entrenamiento/Competición/Reunión/Fiesta";

    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public Timestamp getHoraConcentracion() {
        return horaConcentracion;
    }

    public void setHoraConcentracion(Timestamp horaConcentracion) {
        this.horaConcentracion = horaConcentracion;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }

    public Integer getTipoEvento_id() {
        return tipoEvento_id;
    }

    public void setTipoEvento_id(Integer tipoEvento_id) {
        this.tipoEvento_id = tipoEvento_id;
    }
}
