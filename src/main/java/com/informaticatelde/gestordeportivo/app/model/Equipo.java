package com.informaticatelde.gestordeportivo.app.model;

import java.util.List;

public class Equipo {

    /// TODO: Cambiar los Set por List. más simple y evitamos complejidad en los métodos.
    /// TODO: Cambiar Categoria por CategoriaEquipo y asi diferenciarlo de CategoriaHabilidad.
    /// TODO: Añadir listado de entrenamientos.

    private Integer idEquipo;
    private String nombre;
    private CategoriaEquipo categoriaEquipo;
    private List<Jugador> jugadores;
    private List<Entrenador> entrenadores;
    private List<Entrenamiento> entrenamientos;
    private Multimedia multimedia; // Con esto se pretende añadir una foto de equipo

    public Equipo (String nombre, CategoriaEquipo categoriaEquipo,
                   List<Jugador> jugadores, List<Entrenador> entrenadores, List<Entrenamiento> entrenamientos,
                   Multimedia multimedia){

        this.nombre = nombre;
        this.categoriaEquipo = categoriaEquipo;
        this.jugadores = jugadores;
        this.entrenadores= entrenadores;
        this.entrenamientos = entrenamientos;
        this.multimedia = multimedia;

    }
    public Equipo (String nombre, CategoriaEquipo categoriaEquipo){

        this.nombre = nombre;
        this.categoriaEquipo = categoriaEquipo;
        this.jugadores = jugadores;
        this.entrenadores= entrenadores;

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

    public CategoriaEquipo getCategoria() {
        return categoriaEquipo;
    }

    public void setCategoria(CategoriaEquipo categoriaEquipo) {
        this.categoriaEquipo = categoriaEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public CategoriaEquipo getCategoriaEquipo() {
        return categoriaEquipo;
    }

    public void setCategoriaEquipo(CategoriaEquipo categoriaEquipo) {
        this.categoriaEquipo = categoriaEquipo;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
