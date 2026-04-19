package com.informaticatelde.gestordeportivo.app.model;

public class Habilidad {
    /// TODO: Se simplifica con la creacion de los otros objetos JugadorHabilidad
    /// TODO: Sustituir String categoria por CategoriaEjercicio categoria.
    /// TODO: Añadir Multimedia imagen. Puede ser util.
    /// TODO: Eliminar jugador_id, subcategoria y ejercicio_id.Ya esta información se obtiene de las clases importantes.

    private Integer idHabilidad;
    private String nombre; // Designación de la habilidad
    private String descripcion; // Descripción detallada de la habilidad
    private String categoria; // Esto se puede confundir con la categoria del equipo
    private String subcategoria; // Se puede sustituir por tipo y subtipo??
    private Integer jugador_id;
    private Integer ejercicio_id;

    public Habilidad (String nombre, String descripcion, String categoria, String subcategoria,
                        Integer jugador_id, Integer ejercicio_id) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.jugador_id = jugador_id;
        this.ejercicio_id = ejercicio_id;

    }

    public Integer getIdHabilidad() {
        return idHabilidad;
    }

    public Integer getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Integer jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Integer getEjercicio_id() {
        return ejercicio_id;
    }

    public void setEjercicio_id(Integer ejercicio_id) {
        this.ejercicio_id = ejercicio_id;
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
}
