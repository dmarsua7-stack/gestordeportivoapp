package com.informaticatelde.gestordeportivo.app.model;

import java.sql.Date;

public class Jugador {

    private Integer idJugador;
    private String nombre;
    private String apellido01;
    private String apellido02;
    private String telefono01;
    private String telefono02;
    private String telefono03;
    private String email01;
    private String email02;
    private String email03;
    private String foto;
    private Date fechaNac;
    private String categoria;
    private String subcategoria;
    private String observaciones;


    public void jugador (String nombre, String apellido01, String apellido02, String telefono01, String telefono02, String telefono03,
                        String email01, String email02, String email03, String foto, Date fechaNac, String categoria, String subcategoria, String observaciones) {

        this.nombre = nombre;
        this.apellido01 = apellido01;
        this.apellido02 = apellido02;
        this.telefono01 = telefono01;
        this.telefono02 = telefono02;
        this.telefono03 = telefono03;
        this.email01 = email01;
        this.email02 = email02;
        this.email03 = email03;
        this.foto = foto;
        this.fechaNac= fechaNac;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.observaciones = observaciones;
    }

    public Integer getIdJugador() {
        return idJugador;
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

    public String getTelefono01() {
        return telefono01;
    }

    public void setTelefono01(String telefono01) {
        this.telefono01 = telefono01;
    }

    public String getTelefono02() {
        return telefono02;
    }

    public void setTelefono02(String telefono02) {
        this.telefono02 = telefono02;
    }

    public String getTelefono03() {
        return telefono03;
    }

    public void setTelefono03(String telefono03) {
        this.telefono03 = telefono03;
    }

    public String getEmail01() {
        return email01;
    }

    public void setEmail01(String email01) {
        this.email01 = email01;
    }

    public String getEmail02() {
        return email02;
    }

    public void setEmail02(String email02) {
        this.email02 = email02;
    }

    public String getEmail03() {
        return email03;
    }

    public void setEmail03(String email03) {
        this.email03 = email03;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


}
