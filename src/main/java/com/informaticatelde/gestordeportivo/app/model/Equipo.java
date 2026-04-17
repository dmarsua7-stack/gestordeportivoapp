package com.informaticatelde.gestordeportivo.app.model;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Integer categoria_id;
    private Integer subcategoria_id;
    private Integer jugador_id; // Esto no iría con la lista de jugdores?
    private Integer entrenador_id; // Entiendo que también se necesita una lista de entrenadores
    private Integer multimedia_id; // Con esto se pretende añadir una foto de equipo

    public Equipo (String nombre, Integer categoria_id, Integer subcategoria_id,
                   Integer jugador_id, Integer entrenador_id, Integer multimedia_id){

        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.subcategoria_id = subcategoria_id;
        this.jugador_id = jugador_id;
        this.entrenador_id = entrenador_id;
        this.multimedia_id = multimedia_id;

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

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Integer getSubcategoria_Id() {
        return subcategoria_id;
    }

    public void setSubcategoria_id(Integer subcategoria_id) {
        this.subcategoria_id = subcategoria_id;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Integer getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(Integer entrenador_id) {
        this.entrenador_id = entrenador_id;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
