package com.informaticatelde.gestordeportivo.app.service;

import com.informaticatelde.gestordeportivo.app.model.Material;
import com.informaticatelde.gestordeportivo.app.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository repositorio;


    public List<Material> listar() {
        return repositorio.findAll();
    }

    public Material buscarPorId(Integer idMaterial) {
        return repositorio.findById(idMaterial).orElse(null);
    }

    public Material guardar(Material material) {
        return repositorio.save(material);
    }

    public void eliminar(Integer idMaterial) {
        repositorio.deleteById(idMaterial);
    }

    public Material actualizar (Material material, Integer idMaterial) {
        Material materialExistente = repositorio.findById(idMaterial).get();
        if (materialExistente == null){
            return null;
        } else {
            materialExistente.setNombre(material.getNombre());
            materialExistente.setDescripcion(material.getDescripcion());
            materialExistente.setMultimedia(material.getMultimedia());

            return repositorio.save(materialExistente);
        }
    }


}
