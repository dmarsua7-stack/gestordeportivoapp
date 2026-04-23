package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.util.List;

@Entity
public class Entrenador {

    /// TODO: Añadir listado para los equipos
    /// TODO: Añadir password. Son los usuarios del sistema.
    /// TODO: Expicame especialidad y nivel
    /// Modificar multimedia_id para que sea un objeto Multimedia multimedia;
    /// Modificar constructores para poner como parametros aquellos que sean estrictamente necesarios para crear un entrenador. Ejemplo: el equipo no es necesario.
    private Integer idEntrenador;
    private String password;
    private String dniEntrenador;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private Date fechaNac;
    private String especialidad; // Primer entrenador, Segundo, Delegado, Fisio, etc.
    private String nivel; // Esto puede ser un enum - Categoria básica, regional, nacional... etc. (Cada deporte tiene sus niveles de conocimientos)
    private List<Equipo> equipos;
    private String observaciones;
    private Date fechaRegistro; // Se debe añadir aquí un tlfn_id + email_id??
    private Multimedia multimedia; // Foto del entrenador

    public Entrenador (String password, String dniEntrenador, String nombre, String apellido01, String apellido02,
                    Date fechaNac, String especialidad, String nivel, List<Equipo> equipos , String observaciones, Date fechaRegistro,
                   Multimedia multimedia) {

        this.password = password;
        this.dniEntrenador = dniEntrenador;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.especialidad = especialidad;
        this.nivel = nivel;
        this.equipos = equipos;
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
        this.multimedia = multimedia;
    }

    public Entrenador (String password, String dniEntrenador, String nombre, String apellido01, String apellido02,
                       Date fechaNac, Date fechaRegistro) {

        this.password = password;
        this.dniEntrenador = dniEntrenador;
        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.fechaNac= fechaNac;
        this.fechaRegistro = fechaRegistro;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public String getDniEntrenador() {
        return dniEntrenador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDniEntrenador(String dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
