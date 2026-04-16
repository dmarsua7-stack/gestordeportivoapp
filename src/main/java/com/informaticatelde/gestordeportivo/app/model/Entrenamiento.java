package com.informaticatelde.gestordeportivo.app.model;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Entrenamiento {

    private Integer idEntrenamiento;
    private String nombre;
    private Time duracion;
    private String instalacion;
    private String tipo;
    private String listaEjercicios;
    private Integer jugParticipantes;
    private String multimedia;
    private Date fecha;
    private Timestamp horaInicio;
    private Timestamp horaConcentracion;




    public void Entrenamiento (String nombre, Time duracion, String instalacion, String tipo, String listaEjercicios,
                               Integer jugParticipantes, String multimedia, Date fecha, Timestamp horaInicio, Timestamp horaConcentracion ) {

        this.nombre = nombre;
        this.duracion = duracion;
        this.instalacion = instalacion;
        this.tipo = tipo;
        this.listaEjercicios = listaEjercicios;
        this.jugParticipantes = jugParticipantes;
        this.multimedia = multimedia;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaConcentracion = horaConcentracion;


    }


    public Integer getIdEntrenamiento() {
        return idEntrenamiento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Timestamp getDuracion() {
        return duracion;
    }


    public void setDuracion(Timestamp duracion) {
        this.duracion = duracion;
    }


    public String getInstalacion() {
        return instalacion;
    }


    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
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


    public String getMultimedia() {
        return multimedia;
    }


    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
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


}
