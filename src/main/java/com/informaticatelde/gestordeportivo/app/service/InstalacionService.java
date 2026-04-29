package com.informaticatelde.gestordeportivo.app.service;


import com.informaticatelde.gestordeportivo.app.model.Instalacion;
import com.informaticatelde.gestordeportivo.app.repository.InstalacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstalacionService {

    @Autowired
    private InstalacionRepository repositorio;


    public List<Instalacion> listar() {
        return repositorio.findAll();
    }

    public Instalacion buscarPorId(Integer idInstalacion) {
        return repositorio.findById(idInstalacion).orElse(null);
    }

    public Instalacion guardar(Instalacion instalacion) {
        return repositorio.save(instalacion);
    }

    public void eliminar(Instalacion idInstalacion) {
        repositorio.deleteById(idInstalacion);
    }

    public Instalacion actualizar (Instalacion instalacion, Integer idInstalacion) {
        Instalacion instalacionExistente = repositorio.findById(idInstalacion).get();
        if (instalacionExistente == null){
            return null;
        } else {
            instalacionExistente.setNombre(instalacion.getNombre());
            instalacionExistente.setDireccion(instalacion.getDireccion());
            instalacionExistente.setLocalidad(instalacion.getLocalidad());
            instalacionExistente.setGmaps(instalacion.getGmaps());
            instalacionExistente.setMultimedia(instalacion.getMultimedia());

            return repositorio.save(instalacionExistente);
        }
    }


}
