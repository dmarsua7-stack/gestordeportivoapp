package com.informaticatelde.gestordeportivo.app.model;

public class Telefono {
    /// TODO: Elimina jugador_id y entrenador_id. Añade una nueva propiedad Contacto contacto sus getter y setters. Ajusta el constructor.
    ///
    private Integer idTlfn;
    private String nombre; // Referente al tipo de telefono como: tlfn propio, madre o padre.
    private String telefono;
    private Contacto contacto;


    public Telefono(String nombre, String telefono,
                    Contacto contacto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.contacto = contacto;

    }

    public Integer getIdTlfn() {
        return idTlfn;
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

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}

