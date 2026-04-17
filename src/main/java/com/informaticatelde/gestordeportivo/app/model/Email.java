package com.informaticatelde.gestordeportivo.app.model;

public class Email {


    private Integer idEmail;
    private String nombre; // Referente al tipo de email como: email propio, madre o padre.
    private String email;
    private Integer jugador_id;
    private Integer entrenador_id;


    public Email (String nombre, String email,
                    Integer jugador_id, Integer entrenador_id) {

        this.nombre = nombre;
        this.email = email;
        this.jugador_id = jugador_id;
        this.entrenador_id = entrenador_id;

    }

    public Integer getIdEmail() {
        return idEmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
