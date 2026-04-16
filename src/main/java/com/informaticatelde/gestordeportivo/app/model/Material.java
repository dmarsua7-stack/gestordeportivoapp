package com.informaticatelde.gestordeportivo.app.model;

public class Material {


    private Integer idMaterial;
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private String categoria;
    private String imagen;


    public Material (String nombre,String descripcion, Integer cantidad, String categoria, String imagen) {
        this.idMaterial = 1; // Cuando se tenga una bd se debe borrar este id
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.imagen = imagen;

    }

    public Integer getIdMaterial() {
        return idMaterial;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}
