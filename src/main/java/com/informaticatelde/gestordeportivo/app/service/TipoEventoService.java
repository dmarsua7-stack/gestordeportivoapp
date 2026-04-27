package com.informaticatelde.gestordeportivo.app.service;


import com.informaticatelde.gestordeportivo.app.model.TipoEvento;
import com.informaticatelde.gestordeportivo.app.repository.TipoEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEventoService {

    @Autowired
    private TipoEventoRepository repositorio;


    public List<TipoEvento> listar() {
        return repositorio.findAll();
    }

    public TipoEvento buscarPorId(Integer idTipoEvento) {
        return repositorio.findById(idTipoEvento).orElse(null);
    }

    public TipoEvento guardar(TipoEvento tipoEvento) {
        return repositorio.save(tipoEvento);
    }

    public void eliminar(Integer idTipoEvento) {
        repositorio.deleteById(idTipoEvento);
    }

    public TipoEvento actualizar (TipoEvento tipoEvento, Integer idTipoEvento) {
        TipoEvento tipoEventoExistente = repositorio.findById(idTipoEvento).get();
        if (tipoEventoExistente == null){
            return null;
        } else {
            tipoEventoExistente.setNombre(tipoEvento.getNombre());
            tipoEventoExistente.setDescripcion(tipoEvento.getDescripcion());

            return repositorio.save(tipoEventoExistente);
        }
    }

}
