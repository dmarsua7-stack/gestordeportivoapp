package com.informaticatelde.gestordeportivo.app.model;


import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

public class Entrenamiento {
///  TODO: Sustituye Integer multimedia_id por Multimedia multimedia
/// TODO: Sustituye Integer instalacion_id por Instalacion instalacion
/// TODO: Sustituye Date fecha por LocalDate fecha.
/// TODO: Sustituye String tipo por TipoEntrenamiento tipoEntrenamiento.
/// TODO: Añade Equipo equipo.
/// TODO: Añade List<Jugador> jugadores. Elimina jugParticipantes
/// TODO: Añade List<Ejercicio> ejercicios
/// TODO: Falta por ver como añddir lo de la asistencia a los entrenamientos. Que me da que se tendrá que hacer en otra tabla.
///
    private Integer idEntrenamiento;
    private String nombre;
    private Time duracion;
    private TipoEntrenamiento tipoEntrenamiento; // Refernciar a que llamamos tipo de entrenamiento
    private List<Ejercicio> ejercicios; // Esto será una lista de ejercicios
    private List<Jugador> jugadores;
    private Equipo equipo;
    private LocalDate fecha;
    private Timestamp horaInicio;
    private Timestamp horaConcentracion;
    private Multimedia multimedia;
    private Instalacion instalacion;


    public void Entrenamiento (String nombre, Time duracion, TipoEntrenamiento tipoEntrenamiento, List<Ejercicio> ejercicios,
                               List<Jugador> jugadores, Equipo equipo, LocalDate fecha, Timestamp horaInicio, Timestamp horaConcentracion,
                               Multimedia multimedia, Instalacion instalacion) {

        this.nombre = nombre;
        this.duracion = duracion;
        this.tipoEntrenamiento = tipoEntrenamiento;
        this.ejercicios = ejercicios;
        this.jugadores = jugadores;
        this.equipo = equipo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaConcentracion = horaConcentracion;
        this.multimedia = multimedia;
        this.instalacion = instalacion;
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

    public TipoEntrenamiento getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }

    public void setTipoEntrenamiento(TipoEntrenamiento tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }
}
