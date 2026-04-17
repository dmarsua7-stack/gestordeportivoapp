package com.informaticatelde.gestordeportivo.app.model;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Entrenamiento {

    private Integer idEntrenamiento;
    private String nombre;
    private Time duracion;
    private String tipo; // Refernciar a que llamamos tipo de entrenamiento
    private String listaEjercicios; // Esto será una lista de ejercicios
    private Integer jugParticipantes;
    private Date fecha;
    private Timestamp horaInicio;
    private Timestamp horaConcentracion;
    private Integer multimedia_id; // Esto puede incluir varios archivos, puede ser otra lista
    private Integer instalacion_id;


    public void Entrenamiento (String nombre, Time duracion, String tipo, String listaEjercicios,
                               Integer jugParticipantes, Date fecha, Timestamp horaInicio, Timestamp horaConcentracion,
                               Integer multimedia_id, Integer instalacion_id) {

        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
        this.listaEjercicios = listaEjercicios;
        this.jugParticipantes = jugParticipantes;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaConcentracion = horaConcentracion;
        this.multimedia_id = multimedia_id;
        this.instalacion_id = instalacion_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEntrenamiento() {
        return idEntrenamiento;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getListaEjercicios() {
        return listaEjercicios;
    }

    public void setListaEjercicios(String listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }

    public Integer getJugParticipantes() {
        return jugParticipantes;
    }

    public void setJugParticipantes(Integer jugParticipantes) {
        this.jugParticipantes = jugParticipantes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
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

    public Integer getInstalacion_id() {
        return instalacion_id;
    }

    public void setInstalacion_id(Integer instalacion_id) {
        this.instalacion_id = instalacion_id;
    }
}
