package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEquipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaEquipoRepository extends JpaRepository<CategoriaEquipo, Integer> {

    //List<CategoriaEquipo> findByNombre(String nombre);

}
