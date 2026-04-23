package com.informaticatelde.gestordeportivo.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que relaciona el ejercicio con el material y la cantidad necesaria para usarlo.
 */

@Entity
public class EjercicioMaterial {
    /// TODO: Añadir idEjercicioMaterial, Ejercicio ejercicio, Material material, int cantidad.

    private Integer idEjercicioMaterial;
    private Ejercicio ejercicio;
    private Material material;
    private Integer cantidad;


    public EjercicioMaterial (Ejercicio ejercicio, Material material, Integer cantidad){
        this.ejercicio = ejercicio;
        this.material = material;
        this.cantidad = cantidad;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdEjercicioMaterial() {
        return idEjercicioMaterial;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
