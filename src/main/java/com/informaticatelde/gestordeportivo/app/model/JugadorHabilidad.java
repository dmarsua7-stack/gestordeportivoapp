package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JugadorHabilidad {
    /// TODO: La clase JugadorHabilidad hay que crearla con un Integer idjugadorhabilidad, Jugador jugador, Habilidad habilidad, int puntuacion.
    /// TODO: Crear getter, setter y constructores.


    private Integer idJugadorHabilidad;
    private Jugador jugador;
    private Habilidad habilidad;
    private Integer puntuacion;


    public JugadorHabilidad (Jugador jugador, Habilidad habilidad, Integer puntuacion){
        this.jugador = jugador;
        this.habilidad = habilidad;
        this.puntuacion = puntuacion;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdJugadorHabilidad() {
        return idJugadorHabilidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
}
