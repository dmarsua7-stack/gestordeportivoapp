package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Ejercicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EjercicioController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<Ejercicio> listar (){
        return service.listar();
    }

    @GetMapping("/ejercicio/lista/{idEjercicio}")
    public Ejercicio getById(@PathVariable Integer idEjercicio) {
        return service.getById(idEjercicio);
    }

    @PostMapping
    public Ejercicio crear(@RequestBody Ejercicio ejercicio) {
        return service.guardar(ejercicio);
    }

    @PutMapping("/{idEjercicio}")
    public Ejercicio actualizar(@PathVariable Integer idEjercicio, @RequestBody Ejercicio ejercicio) {
        Ejercicio existente = service.getById(idEjercicio);
        if (existente == null) return null;

        existente.setEjercicio(Ejercicio.getEjercicio());
        existente.setMaterial(Ejercicio.getMaterial());
        existente.setCantidad(Ejercicio.getCantidad());


        return service.guardar(existente);
    }

    @DeleteMapping("/{idEjercicio}")
    public void eliminar(@PathVariable Integer idEjercicio) {
        service.eliminar(idEjercicio);
    }

*/
}
