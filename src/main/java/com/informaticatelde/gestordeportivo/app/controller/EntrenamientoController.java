package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Entrenamiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EntrenamientoController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<Entrenamiento> listar (){
        return service.listar();
    }

    @GetMapping("/entrenamiento/lista/{idEntrenamiento}")
    public Entrenamiento getById(@PathVariable Integer idEntrenamiento) {
        return service.getById(idEntrenamiento);
    }

    @PostMapping
    public Entrenamiento crear(@RequestBody Entrenamiento entrenamiento) {
        return service.guardar(entrenamiento);
    }

    @PutMapping("/{idEntrenamiento}")
    public Entrenamiento actualizar(@PathVariable Integer idEntrenamiento, @RequestBody Entrenamiento entrenamiento) {
        Entrenamiento existente = service.getById(idEntrenamiento);
        if (existente == null) return null;

        existente.setNombre(Entrenamiento.getNombre());
        existente.setDuracion(Entrenamiento.getDuracion());
        existente.setTipoEntrenamiento(Entrenamiento.getTipoEntrenamiento());
        existente.setEjercicios(Entrenamiento.getEjercicios());
        existente.setJugadores(Entrenamiento.getJugadores());
        existente.setEquipo(Entrenamiento.getEquipo());
        existente.setFecha(Entrenamiento.getFecha());
        existente.setHoraInicio(Entrenamiento.getHoraInicio());
        existente.setHoraConcentracion(Entrenamiento.getHoraConcentracion());
        existente.setMultimedia(Entrenamiento.getMultimedia());
        existente.setInstalacion(Entrenamiento.getInstalacion());


        return service.guardar(existente);
    }

    @DeleteMapping("/{idEntrenamiento}")
    public void eliminar(@PathVariable Integer idEntrenamiento) {
        service.eliminar(idEntrenamiento);
    }

*/


}
