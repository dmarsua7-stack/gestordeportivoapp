package com.informaticatelde.gestordeportivo.app.model;

public class Habilidad {
    /// TODO: Se simplifica con la creacion de los otros objetos JugadorHabilidad
    /// TODO: Sustituir String categoria por CategoriaEjercicio categoria.
    /// TODO: Añadir Multimedia imagen. Puede ser util.
    /// TODO: Eliminar jugador_id, subcategoria y ejercicio_id.Ya esta información se obtiene de las clases importantes.

    private Integer idHabilidad;
    private String nombre; // Designación de la habilidad
    private String descripcion; // Descripción detallada de la habilidad
    private CategoriaEjercicio categoria;
    private Multimedia imagen;

    public Habilidad (String nombre, String descripcion, CategoriaEjercicio categoria, Multimedia imagen) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    public Integer getIdHabilidad() {
        return idHabilidad;
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

    public CategoriaEjercicio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEjercicio categoria) {
        this.categoria = categoria;
    }

    public Multimedia getImagen() {
        return imagen;
    }

    public void setImagen(Multimedia imagen) {
        this.imagen = imagen;
    }
}
