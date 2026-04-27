package com.informaticatelde.gestordeportivo.app.repository;

import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MultimediaRepository extends JpaRepository<Multimedia,Integer> {

   // List<Multimedia> findByNombre (String nombre);

}
