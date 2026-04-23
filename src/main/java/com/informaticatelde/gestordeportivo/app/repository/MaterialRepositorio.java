package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepositorio extends JpaRepository<Material, Integer> {

    List<Material> findByNombre(String nombre);

    // Borrar - boolean existsByNombre(String nombre);

}
