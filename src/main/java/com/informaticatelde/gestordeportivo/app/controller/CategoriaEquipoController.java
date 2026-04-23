package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEquipo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CategoriaEquipoController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<CategoriaEquipo> listar (){
        return service.listar();
    }

    @GetMapping("/categoria/equipo/lista/{idCategoriaEquipo}")
    public CategoriaEquipo getById(@PathVariable Integer idCategoriaEquipo) {
        return service.getById(idCategoriaEquipo);
    }

    @PostMapping
    public CategoriaEquipo crear(@RequestBody CategoriaEquipo categoria) {
        return service.guardar(categoria);
    }

    @PutMapping("/{idCategoriaEquipo}")
    public CategoriaEquipo actualizar(@PathVariable Integer idCategoriaEquipo, @RequestBody CategoriaEquipo categoria) {
        CategoriaEquipo existente = service.getById(idCategoriaEquipo);
        if (existente == null) return null;

        existente.setNombre(CategoriaEquipo.getNombre());
        existente.setDescripcion(CategoriaEquipo.getDescripcion());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idCategoriaEquipo}")
    public void eliminar(@PathVariable Integer idCategoriaEquipo) {
        service.eliminar(idCategoriaEquipo);
    }

*/


}
