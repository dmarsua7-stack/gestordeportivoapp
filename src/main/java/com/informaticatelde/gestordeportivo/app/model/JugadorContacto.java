package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JugadorContacto {
    /// Esta clase relaciona un cotnacto con un jugador. La clase contacto tendrá toda la información del contacto, emails. telefonos.
    // Esto permite controlar los casos de contactos repetidos entre jugadores y marcar incluso contactos como principales

    ///  TODO: añadir Integer id, Jugador jugador, Contacto contacto.

    private Integer idJugadorContacto;
    private Jugador jugador;
    private Contacto contacto;


    public JugadorContacto (Jugador jugador, Contacto contacto){
        this.jugador = jugador;
        this.contacto = contacto;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdJugadorContacto() {
        return idJugadorContacto;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
