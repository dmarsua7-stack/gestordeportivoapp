package com.informaticatelde.gestordeportivo.app.service;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEjercicio;
import com.informaticatelde.gestordeportivo.app.repository.CategoriaEjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaEjercicioService {

    @Autowired
    private CategoriaEjercicioRepository repositorio;


    public List<CategoriaEjercicio> listar() {
        return repositorio.findAll();
    }

    public CategoriaEjercicio getById(Integer idCategoriaEjercicio) {
        return repositorio.findById(idCategoriaEjercicio).orElse(null);
    }

    public CategoriaEjercicio guardar(CategoriaEjercicio categoriaEjercicio) {
        return repositorio.save(categoriaEjercicio);
    }

    public void eliminar(Integer idCategoriaEjercicio) {
        repositorio.deleteById(idCategoriaEjercicio);
    }

    public CategoriaEjercicio actualizar (CategoriaEjercicio categoriaEjercicio, Integer idCategoriaEjercicio) {
        CategoriaEjercicio categoriaEjercicioExistente = repositorio.findById(idCategoriaEjercicio).get();
        if (categoriaEjercicioExistente == null){
            return null;
        } else {
            categoriaEjercicioExistente.setNombre(categoriaEjercicio.getNombre());
            categoriaEjercicioExistente.setDescripcion(categoriaEjercicio.getDescripcion());
            categoriaEjercicioExistente.setMultimedia(categoriaEjercicio.getMultimedia());

            return repositorio.save(categoriaEjercicioExistente);
        }
    }



}
