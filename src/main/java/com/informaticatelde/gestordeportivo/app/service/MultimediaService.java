package com.informaticatelde.gestordeportivo.app.service;


import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import com.informaticatelde.gestordeportivo.app.repository.MultimediaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultimediaService {


    private final MultimediaRepository repositorio;

    public MultimediaService (MultimediaRepository repositorio){
        this.repositorio = repositorio;
    }

    public List<Multimedia> listar() {
        return repositorio.findAll();
    }

    public Multimedia getById(Integer idMultimedia) {
        return repositorio.findById(idMultimedia).orElse(null);
    }

    public Multimedia guardar(Multimedia multimedia) {
        return repositorio.save(multimedia);
    }

    public void eliminar(Integer idMultimedia) {
        repositorio.deleteById(idMultimedia);
    }

    public Multimedia actualizar (Multimedia multimedia, Integer idMultimedia) {
        Multimedia multimediaExistente = repositorio.findById(idMultimedia).get();
        if (multimediaExistente == null){
            return null;
        } else {
            multimediaExistente.setNombre(multimedia.getNombre());
            multimediaExistente.setDescripcion(multimedia.getDescripcion());
            multimediaExistente.setFechaCarga(multimedia.getFechaCarga());
            multimediaExistente.setUrl(multimedia.getUrl());

            return repositorio.save(multimediaExistente);
        }
    }


}
