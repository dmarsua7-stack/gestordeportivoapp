package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.*;

@Entity
public class Material {
    ///  TODO: Vamos a simplificarlo. Vamos a tener nombre, descripcion y multimedia
    ///  TODO: eliminar cantidad y categoria.
    ///  TODO: Sustituir Integer multimedia_id por Multimedia multimedia.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMaterial;
    private String nombre;
    private String descripcion;

    @OneToOne(cascade = CascadeType.ALL) // CascadeType.ALL significa que si borras el Material, se borra su Multimedia (opcional)
    @JoinColumn(name = "multimedia_id") // Nombre de la columna en la tabla Material
    private Multimedia multimedia;


    public Material(){

    }

    public Material (String nombre,String descripcion, Multimedia multimedia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

    }


    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial){
        this.idMaterial = idMaterial;
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

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
}
