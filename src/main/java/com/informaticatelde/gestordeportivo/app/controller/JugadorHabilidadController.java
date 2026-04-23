package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.JugadorHabilidad;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class JugadorHabilidadController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<JugadorHabilidad> listar (){
        return service.listar();
    }

    @GetMapping("/jugador/habilidad/lista/{idJugadorHabilidad}")
    public JugadorHabilidad getById(@PathVariable Integer idJugadorHabilidad) {
        return service.getById(idJugadorHabilidad);
    }

    @PostMapping
    public JugadorHabilidad crear(@RequestBody JugadorHabilidad habilidad) {
        return service.guardar(habilidad);
    }

    @PutMapping("/{idJugadorHabilidad}")
    public JugadorHabilidad actualizar(@PathVariable Integer idJugadorHabilidad, @RequestBody JugadorHabilidad habilidad) {
        JugadorHabilidad existente = service.getById(idJugadorHabilidad);
        if (existente == null) return null;

        existente.setJugador(JugadorHabilidad.getJugador());
        existente.setHabilidad(JugadorHabilidad.getHabilidad());
        existente.setPuntuacion(JugadorHabilidad.getPuntuacion());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idJugadorHabilidad}")
    public void eliminar(@PathVariable Integer idJugadorHabilidad) {
        service.eliminar(idJugadorHabilidad);
    }

*/

}
