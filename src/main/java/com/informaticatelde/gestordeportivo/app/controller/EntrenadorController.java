package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Ejercicio;
import com.informaticatelde.gestordeportivo.app.model.Entrenador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EntrenadorController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<Entrenador> listar (){
        return service.listar();
    }

    @GetMapping("/entrenador/lista/{idEntrenador}")
    public Entrenador getById(@PathVariable Integer idEntrenador) {
        return service.getById(idEntrenador);
    }

    @PostMapping
    public Entrenador crear(@RequestBody Entrenador entrenador) {
        return service.guardar(entrenador);
    }

    @PutMapping("/{idEntrenador}")
    public Entrenador actualizar(@PathVariable Integer idEntrenador, @RequestBody Entrenador entrenador) {
        Entrenador existente = service.getById(idEntrenador);
        if (existente == null) return null;

        existente.setPassword(Entrenador.getPassword());
        existente.setDniEntrenador(Entrenador.getDniEntrenador());
        existente.setNombre(Entrenador.getNombre());
        existente.setApellido1(Entrenador.getApellido1());
        existente.setApellido2(Entrenador.getApellido2());
        existente.setFechaNac(Entrenador.getFechaNac());
        existente.setEspecialidad(Entrenador.getEspecialidad());
        existente.setNivel(Entrenador.getNivel());
        existente.setEquipos(Entrenador.getEquipos());
        existente.setObservaciones(Entrenador.getObservaciones());
        existente.setFechaRegistro(Entrenador.getFechaRegistro());
        existente.setMultimedia(Entrenador.getMultimedia());


        return service.guardar(existente);
    }

    @DeleteMapping("/{idEntrenador}")
    public void eliminar(@PathVariable Integer idEntrenador) {
        service.eliminar(idEntrenador);
    }

*/


}
