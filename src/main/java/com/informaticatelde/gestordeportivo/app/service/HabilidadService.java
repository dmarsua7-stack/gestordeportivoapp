package com.informaticatelde.gestordeportivo.app.service;

import com.informaticatelde.gestordeportivo.app.model.Habilidad;
import com.informaticatelde.gestordeportivo.app.repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadService {

    @Autowired
    private HabilidadRepository repositorio;

    public List<Habilidad> listar() {
        return repositorio.findAll();
    }

    public Habilidad buscarPorId(Integer idHabilidad) {
        return repositorio.findById(idHabilidad).orElse(null);
    }

    public Habilidad guardar(Habilidad habilidad) {
        return repositorio.save(habilidad);
    }

    public void eliminar(Integer idHabilidad) {
        repositorio.deleteById(idHabilidad);
    }

    public Habilidad actualizar (Habilidad habilidad, Integer idHabilidad) {
        Habilidad habilidadExistente = repositorio.findById(idHabilidad).get();
        if (habilidadExistente == null){
            return null;
        } else {
            habilidadExistente.setNombre(habilidad.getNombre());
            habilidadExistente.setDescripcion(habilidad.getDescripcion());
            habilidadExistente.setCategoria(habilidad.getCategoria());
            habilidadExistente.setMultimedia(habilidad.getMultimedia());

            return repositorio.save(habilidadExistente);
        }
    }



}
