package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.JugadorContacto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class JugadorContactoController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<JugadorContacto> listar (){
        return service.listar();
    }

    @GetMapping("/jugador/contacto/lista/{idJugadorContacto}")
    public JugadorContacto getById(@PathVariable Integer idJugadorContacto) {
        return service.getById(idJugadorContacto);
    }

    @PostMapping
    public JugadorContacto crear(@RequestBody JugadorContacto contacto) {
        return service.guardar(contacto);
    }

    @PutMapping("/{idJugadorContacto}")
    public JugadorContacto actualizar(@PathVariable Integer idJugadorContacto, @RequestBody JugadorContacto contacto) {
        JugadorContacto existente = service.getById(idJugadorContacto);
        if (existente == null) return null;

        existente.setJugador(JugadorContacto.getJugador());
        existente.setContacto(JugadorContacto.getContacto());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idJugadorContacto}")
    public void eliminar(@PathVariable Integer idJugadorContacto) {
        service.eliminar(idJugadorContacto);
    }

*/

}
