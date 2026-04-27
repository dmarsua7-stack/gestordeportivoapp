package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEquipo;
import com.informaticatelde.gestordeportivo.app.service.CategoriaEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/categoria/equipo")
public class CategoriaEquipoController {

    @Autowired
    private CategoriaEquipoService service;

    @GetMapping
    public List<CategoriaEquipo> listar (){
        return service.listar();
    }

    @GetMapping("/{idCategoriaEquipo}")
    public CategoriaEquipo buscarPorId(@PathVariable Integer idCategoriaEquipo) {
        return service.buscarPorId(idCategoriaEquipo);
    }

    @PostMapping
    public CategoriaEquipo crear(@RequestBody CategoriaEquipo categoriaEquipo) {
        return service.guardar(categoriaEquipo);
    }

    @PutMapping("/{idCategoriaEquipo}")
    public CategoriaEquipo actualizar(@PathVariable Integer idCategoriaEquipo, @RequestBody CategoriaEquipo categoriaEquipo) {
        return service.actualizar(categoriaEquipo, idCategoriaEquipo);
    }

    @DeleteMapping("/{idCategoriaEquipo}")
    public void eliminar(@PathVariable Integer idCategoriaEquipo) {
        service.eliminar(idCategoriaEquipo);
    }




}
