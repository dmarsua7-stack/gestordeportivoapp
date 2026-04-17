package com.informaticatelde.gestordeportivo.app.model;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private String categoria;
    private String subcategoria;
    private Integer jugador_id; // Esto no iría con la lista de jugdores?
    private Integer multimedia_id; // Con esto se pretende añadir una foto de equipo

    public Equipo (String nombre, String categoria, String subcategoria, Integer jugador_id, Integer multimedia_id){

        this.nombre = nombre;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.jugador_id = jugador_id;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }
}
