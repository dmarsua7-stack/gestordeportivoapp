package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

//@Entity
public class Jugador {
    /// TODO: Faltaria dirección.
    /// TODO: Sustituir Integer multimedia_id por Multimedia multimedia. Getter, setters y parametros.
    /// TODO: Sustituir Integer equipo_id por Equipo equipo. Getter, setters y parametros. Importante para crear un jugador, el equipo si debe existir.
    /// TODO: Eliminar categoria_id y subcategoria_id. Esto es info del equipo, no lo necesitamos en el jugador.
    /// TODO: Añadir lista de JugadorHabilidad habilidades.
    /// TODO: Añadir List<JugadorContacto> contactos.
 /*   private Integer idJugador;
    private String dniJugador;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private LocalDate fechaNac;
    private Integer dorsal;
    private String direccion;
    private List<JugadorHabilidad> habilidades;
    private List<JugadorContacto> contactos;
    private String observaciones;
    private LocalDate fechaReg; //
    private Equipo equipo; // Se debe unir por id?? Pq?
    private Multimedia multimedia; // Foto del jugador


    public Jugador (String dniJugador, String nombre, String apellido01, String apellido02,
                    LocalDate fechaNac, Integer dorsal, String direccion, List<JugadorHabilidad> habilidades ,
                    List<JugadorContacto> contactos, String observaciones, LocalDate fechaReg, Equipo equipo,
                    Multimedia multimedia) {

        this.dniJugador = dniJugador;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.dorsal = dorsal;
        this.direccion = direccion;
        this.habilidades = habilidades;
        this.contactos = contactos;
        this.observaciones = observaciones;
        this.fechaReg = fechaReg;
        this.equipo = equipo;
        this.multimedia = multimedia;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdJugador() {
        return idJugador;
    }

    public String getDniJugador() {
        return dniJugador;
    }

    public void setDniJugador(String dniJugador) {
        this.dniJugador = dniJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido01() {
        return apellido01;
    }

    public void setApellido01(String apellido01) {
        this.apellido01 = apellido01;
    }

    public String getApellido02() {
        return apellido02;
    }

    public void setApellido02(String apellido02) {
        this.apellido02 = apellido02;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<JugadorHabilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<JugadorHabilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<JugadorContacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<JugadorContacto> contactos) {
        this.contactos = contactos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }*/
}
