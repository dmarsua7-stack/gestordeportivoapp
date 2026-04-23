package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.EjercicioMaterial;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EjercicioMaterialController {


    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<EjercicioMaterial> listar (){
        return service.listar();
    }

    @GetMapping("/ejercicio/material/lista/{idEjercicioMaterial}")
    public EjercicioMaterial getById(@PathVariable Integer idEjercicioMaterial) {
        return service.getById(idEjercicioMaterial);
    }

    @PostMapping
    public EjercicioMaterial crear(@RequestBody EjercicioMaterial material) {
        return service.guardar(material);
    }

    @PutMapping("/{idEjercicioMaterial}")
    public EjercicioMaterial actualizar(@PathVariable Integer idEjercicioMaterial, @RequestBody EjercicioMaterial material) {
        EjercicioMaterial existente = service.getById(idEjercicioMaterial);
        if (existente == null) return null;

        existente.setEjercicio(EjercicioMaterial.getEjercicio());
        existente.setMaterial(EjercicioMaterial.getMaterial());
        existente.setCantidad(EjercicioMaterial.getCantidad());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idEjercicioMaterial}")
    public void eliminar(@PathVariable Integer idEjercicioMaterial) {
        service.eliminar(idEjercicioMaterial);
    }

*/

}
