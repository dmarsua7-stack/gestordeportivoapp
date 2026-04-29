package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.*;

@Entity
public class TipoEntrenamiento {
    /// TODO: Añadir idtipoentrenamiento, nombre, descripcion y multimedia

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoEntrenamiento;
    private String nombre;
    private String descripcion;

    @OneToOne(cascade = CascadeType.ALL) // CascadeType.ALL significa que si borras el Material, se borra su Multimedia (opcional)
    @JoinColumn(name = "multimedia_id")
    private Multimedia multimedia;



    public TipoEntrenamiento (){

    }

    public TipoEntrenamiento (String nombre, String descripcion, Multimedia multimedia){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.multimedia = multimedia;

    }


    public Integer getIdTipoEntrenamiento() {
        return idTipoEntrenamiento;
    }

    public void setIdTipoEntrenamiento(Integer idTipoEntrenamiento) {
        this.idTipoEntrenamiento = idTipoEntrenamiento;
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
