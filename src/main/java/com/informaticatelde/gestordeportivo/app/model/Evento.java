package com.informaticatelde.gestordeportivo.app.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    /// Vamos a simplificar esta parte. Como ya tenemos una clase Instalación que tiene gran parte de esos cambios vamos a usarla.
    /// TODO: elimina ubicacion, direccion, localidad y gmaps y crea Instalacion instalacion. De esta forma es más simple y ordenado.
    /// TODO: Sustituye Integer tipoEvento_id por TipoEvento tipoEvento.
    /// TODO: Sustituye Integer multimedia_id por Multimedia multimedia.
    /// TODO: Añade un Equipo equipo para asociar el evento al equipo.
    /// TODO: Usa LocalTime para los tiempos y LocalDate para las fechas en todas las clases. Son las que se usan ahora mismo en java.

    private Integer idEvento;
    private String nombre;
    private Instalacion instalacion;
    private LocalDate fecha;
    private LocalTime hora;
    private LocalTime horaConcentracion;
    private Equipo equipo;
    private Multimedia multimedia;
    private TipoEvento tipoEvento;


    public void Evento (String nombre, Instalacion instalacion, LocalDate fecha,
                        LocalTime hora, LocalTime horaConcentracion, Equipo equipo, Multimedia multimedia, TipoEvento tipoEvento) {

        this.nombre = nombre;
        this.instalacion = instalacion;
        this.fecha = fecha;
        this.hora = hora;
        this.horaConcentracion = horaConcentracion;
        this.equipo = equipo;
        this.multimedia = multimedia;
        this.tipoEvento = tipoEvento; // "Online / Físico " y tambien "Entrenamiento/Competición/Reunión/Fiesta";

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

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime getHoraConcentracion() {
        return horaConcentracion;
    }

    public void setHoraConcentracion(LocalTime horaConcentracion) {
        this.horaConcentracion = horaConcentracion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
