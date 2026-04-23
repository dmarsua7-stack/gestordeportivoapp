package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.TipoEvento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TipoEventoController {

    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<TipoEvento> listar (){
        return service.listar();
    }

    @GetMapping("/evento/tipo/lista/{idTipoEvento}")
    public TipoEvento getById(@PathVariable Integer idTipoEvento) {
        return service.getById(idTipoEvento);
    }

    @PostMapping
    public TipoEvento crear(@RequestBody TipoEvento tipo) {
        return service.guardar(tipo);
    }

    @PutMapping("/{idTipoEvento}")
    public TipoEvento actualizar(@PathVariable Integer idTipoEvento, @RequestBody TipoEvento tipo) {
        TipoEvento existente = service.getById(idTipoEvento);
        if (existente == null) return null;

        existente.setNombre(TipoEvento.getNombre());
        existente.setDescripcion(TipoEvento.getDescripcion());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idTipoEvento}")
    public void eliminar(@PathVariable Integer idTipoEvento) {
        service.eliminar(idTipoEvento);
    }


*/

}
