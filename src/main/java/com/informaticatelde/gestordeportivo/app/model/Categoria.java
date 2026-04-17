package com.informaticatelde.gestordeportivo.app.model;

public class Categoria {

    private Integer idCategoria;
    private String nombre;
    private String descripcion;
    private Integer equipo_id;
    private Integer jugador_id;
    private Integer entrenamiento_id;
    private Integer ejercicio_id;
    private Integer subcategoria_id;

    public Categoria (String nombre, String descripcion, Integer equipo_id,
                    Integer jugador_id,Integer entrenamiento_id,Integer ejercicio_id, Integer subcategoria_id){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.equipo_id = equipo_id;
        this.jugador_id = jugador_id;
        this.entrenamiento_id = entrenamiento_id;
        this.ejercicio_id = ejercicio_id;
        this.subcategoria_id = subcategoria_id;

    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Integer equipo_id) {
        this.equipo_id = equipo_id;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Integer getEntrenamiento_id() {
        return entrenamiento_id;
    }

    public void setEntrenamiento_id(Integer entrenamiento_id) {
        this.entrenamiento_id = entrenamiento_id;
    }

    public Integer getEjercicio_id() {
        return ejercicio_id;
    }

    public void setEjercicio_id(Integer ejercicio_id) {
        this.ejercicio_id = ejercicio_id;
    }

    public Integer getSubcategoria_id() {
        return subcategoria_id;
    }

    public void setSubcategoria_id(Integer subcategoria_id) {
        this.subcategoria_id = subcategoria_id;
    }
}
