package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEjercicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaEjercicioRepository extends JpaRepository<CategoriaEjercicio,Integer> {

    //List<CategoriaEjercicio> findByNombre(String nombre);

}
