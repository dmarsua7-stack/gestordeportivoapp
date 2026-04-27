package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.TipoEntrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEntrenamientoRepository extends JpaRepository<TipoEntrenamiento,Integer> {
    // Nada en absoluto y debe funcionar.
}
