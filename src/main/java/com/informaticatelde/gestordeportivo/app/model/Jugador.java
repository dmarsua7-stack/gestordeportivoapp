package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Jugador {
    /// TODO: Faltaria dirección.
    /// TODO: Sustituir Integer multimedia_id por Multimedia multimedia. Getter, setters y parametros.
    /// TODO: Sustituir Integer equipo_id por Equipo equipo. Getter, setters y parametros. Importante para crear un jugador, el equipo si debe existir.
    /// TODO: Eliminar categoria_id y subcategoria_id. Esto es info del equipo, no lo necesitamos en el jugador.
    /// TODO: Añadir lista de JugadorHabilidad habilidades.
    /// TODO: Añadir List<JugadorContacto> contactos.
    private Integer idJugador;
    private String dniJugador;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private Date fechaNac;
    private Integer dorsal;
    private String observaciones;
    private Date fechaReg; // Sobra el set??
    private Integer equipo_id; // Se debe unir por id?? Pq?
    private Integer multimedia_id; // Foto del jugador
    private Integer categoria_id; // Esto debería ser otra lista/clase
    private Integer subcategoria_id;


    public Jugador (String dniJugador, String nombre, String apellido01, String apellido02,
                    Date fechaNac, Integer dorsal, String observaciones, Date fechaReg,
                    Integer equipo_id, Integer multimedia_id, Integer categoria_id, Integer subcategoria_id) {

        this.dniJugador = dniJugador;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.dorsal = dorsal;
        this.observaciones = observaciones;
        this.fechaReg = fechaReg;
        this.equipo_id = equipo_id;
        this.multimedia_id = multimedia_id;
        this.categoria_id = categoria_id;
        this.subcategoria_id = subcategoria_id;
    }

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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Integer getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Integer equipo_id) {
        this.equipo_id = equipo_id;
    }

    public Integer getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(Integer multimedia_id) {
        this.multimedia_id = multimedia_id;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Integer getSubcategoria_id() {
        return subcategoria_id;
    }

    public void setSubcategoria_id(Integer subcategoria_id) {
        this.subcategoria_id = subcategoria_id;
    }
}
