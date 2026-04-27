package com.informaticatelde.gestordeportivo.app.service;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEquipo;
import com.informaticatelde.gestordeportivo.app.repository.CategoriaEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaEquipoService {

    @Autowired
    private CategoriaEquipoRepository repositorio;


    public List<CategoriaEquipo> listar() {
        return repositorio.findAll();
    }

    public CategoriaEquipo buscarPorId(Integer idCategoriaEquipo) {
        return repositorio.findById(idCategoriaEquipo).orElse(null);
    }

    public CategoriaEquipo guardar(CategoriaEquipo categoriaEquipo) {
        return repositorio.save(categoriaEquipo);
    }

    public void eliminar(Integer idCategoriaEquipo) {
        repositorio.deleteById(idCategoriaEquipo);
    }

    public CategoriaEquipo actualizar (CategoriaEquipo categoriaEquipo, Integer idCategoriaEquipo) {
        CategoriaEquipo categoriaEquipoExistente = repositorio.findById(idCategoriaEquipo).get();
        if (categoriaEquipoExistente == null){
            return null;
        } else {
            categoriaEquipoExistente.setNombre(categoriaEquipo.getNombre());
            categoriaEquipoExistente.setDescripcion(categoriaEquipo.getDescripcion());

            return repositorio.save(categoriaEquipoExistente);
        }
    }

}
