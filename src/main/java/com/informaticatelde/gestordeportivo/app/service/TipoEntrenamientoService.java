package com.informaticatelde.gestordeportivo.app.service;


import com.informaticatelde.gestordeportivo.app.model.TipoEntrenamiento;
import com.informaticatelde.gestordeportivo.app.repository.TipoEntrenamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEntrenamientoService {


    @Autowired
    private TipoEntrenamientoRepository repositorio;


    public List<TipoEntrenamiento> listar() {
        return repositorio.findAll();
    }

    public TipoEntrenamiento buscarPorId(Integer idTipoEntrenamiento) {
        return repositorio.findById(idTipoEntrenamiento).orElse(null);
    }

    public TipoEntrenamiento guardar(TipoEntrenamiento tipoEntrenamiento) {
        return repositorio.save(tipoEntrenamiento);
    }

    public void eliminar(Integer idTipoEntrenamiento) {
        repositorio.deleteById(idTipoEntrenamiento);
    }

    public TipoEntrenamiento actualizar (TipoEntrenamiento tipoEntrenamiento, Integer idTipoEntrenamiento) {
        TipoEntrenamiento tipoEntrenamientoExistente = repositorio.findById(idTipoEntrenamiento).get();
        if (tipoEntrenamientoExistente == null){
            return null;
        } else {
            tipoEntrenamientoExistente.setNombre(tipoEntrenamiento.getNombre());
            tipoEntrenamientoExistente.setDescripcion(tipoEntrenamiento.getDescripcion());
            tipoEntrenamientoExistente.setMultimedia(tipoEntrenamiento.getMultimedia());

            return repositorio.save(tipoEntrenamientoExistente);
        }
    }

}
