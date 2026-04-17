package com.informaticatelde.gestordeportivo.app.model;

public class Telefono {

    private Integer idTlfn;
    private String nombre; // Referente al tipo de telefono como: tlfn propio, madre o padre.
    private String telefono;
    private Integer jugador_id;
    private Integer entrenador_id;


    public Telefono(String nombre, String telefono,
                    Integer jugador_id, Integer entrenador_id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.jugador_id = jugador_id;
        this.entrenador_id = entrenador_id;

    }

    public Integer getIdTlfn() {
        return idTlfn;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(Integer entrenador_id) {
        this.entrenador_id = entrenador_id;
    }
}

