package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.TipoEvento;
import com.informaticatelde.gestordeportivo.app.service.TipoEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/evento/tipo")
public class TipoEventoController {

    @Autowired
    private TipoEventoService service;

    @GetMapping
    public List<TipoEvento> listar (){
        return service.listar();
    }

    @GetMapping("/lista/{idTipoEvento}")
    public TipoEvento buscarPorId(@PathVariable Integer idTipoEvento) {
        return service.buscarPorId(idTipoEvento);
    }

    @PostMapping
    public TipoEvento crear(@RequestBody TipoEvento tipoEvento) {
        return service.guardar(tipoEvento);
    }

    @PutMapping("/{idTipoEvento}")
    public TipoEvento actualizar(@PathVariable Integer idTipoEvento, @RequestBody TipoEvento tipoEvento) {

        return service.actualizar(tipoEvento, idTipoEvento);
    }

    @DeleteMapping("/{idTipoEvento}")
    public void eliminar(@PathVariable Integer idTipoEvento) {
        service.eliminar(idTipoEvento);
    }

}
