package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Email {

    /// TODO: Elimina jugador_id y entrenador_id. Añade una nueva propiedad Contacto contacto sus getter y setters. Ajusta el constructor.

    private Integer idEmail;
    private String nombre; // Referente al tipo de email como: email propio, madre o padre.
    private String email;
    private Contacto contacto;


    public Email(String nombre, String email, Contacto contacto) {

        this.nombre = nombre;
        this.email = email;
        this.contacto = contacto;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}

