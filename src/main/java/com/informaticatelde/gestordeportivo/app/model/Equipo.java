package com.informaticatelde.gestordeportivo.app.model;

import java.util.Set;
import java.util.TreeSet;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Categoria categoria;
    private Set<Jugador> jugadores;
    private Set<Entrenador> entrenadores;
    private Multimedia multimedia; // Con esto se pretende añadir una foto de equipo

    public Equipo (String nombre, Categoria categoria,
                   Set<Jugador> jugadores, Set<Entrenador> entrenadores, Multimedia multimedia){

        this.nombre = nombre;
        this.categoria = categoria;
        this.jugadores = jugadores;
        this.entrenadores= entrenadores;
        this.multimedia = multimedia;

    }
    public Equipo (String nombre, Categoria categoria){

        this.nombre = nombre;
        this.categoria = categoria;
        this.jugadores = new TreeSet<Jugador>();
        this.entrenadores= new TreeSet<Entrenador>();

    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Set<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
