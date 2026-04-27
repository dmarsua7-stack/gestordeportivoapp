package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEventoRepository  extends JpaRepository<TipoEvento,Integer> {

    // List<TipoEvento> findByNombre(String nombre);

}
