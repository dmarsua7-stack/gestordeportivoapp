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
    private String tipo;
    private String categoria;
    private Date fecha;
    private Timestamp hora;
    private Timestamp horaCon;
    private Integer multimedia_id;


    public void Evento (String nombre, String ubicacion, String direccion, String localidad, String gmaps,
                        String tipo, String categoria, Date fecha, Timestamp hora, Timestamp horaCon, Integer multimedia_id) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gmaps = gmaps;
        this.tipo = tipo; // "Online / Físico ";
        this.categoria =  categoria; // "Entrenamiento/Competición/Reunión/Fiesta";
        this.fecha = fecha;
        this.hora = hora;
        this.horaCon = horaCon;
        this.multimedia_id = multimedia_id;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public Timestamp getHoraCon() {
        return horaCon;
    }

    public void setHoraCon(Timestamp horaCon) {
        this.horaCon = horaCon;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
