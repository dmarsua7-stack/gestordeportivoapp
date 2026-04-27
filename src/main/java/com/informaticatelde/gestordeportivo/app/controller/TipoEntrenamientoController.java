package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.TipoEntrenamiento;
import com.informaticatelde.gestordeportivo.app.service.TipoEntrenamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/entrenamiento/tipo")
public class TipoEntrenamientoController {


    @Autowired
    private TipoEntrenamientoService service;

   @GetMapping
    public List<TipoEntrenamiento> listar (){
        return service.listar();
    }

    @GetMapping("/{idTipoEntrenamiento}")
    public TipoEntrenamiento buscarPorId(@PathVariable Integer idTipoEntrenamiento) {
        return service.buscarPorId(idTipoEntrenamiento);
    }

    @PostMapping
    public TipoEntrenamiento crear(@RequestBody TipoEntrenamiento tipo) {
        return service.guardar(tipo);
    }

    @PutMapping("/{idTipoEntrenamiento}")
    public TipoEntrenamiento actualizar(@PathVariable Integer idTipoEntrenamiento, @RequestBody TipoEntrenamiento tipoEntrenamiento) {

        return service.actualizar(tipoEntrenamiento,idTipoEntrenamiento);
    }

    @DeleteMapping("/{idTipoEntrenamiento}")
    public void eliminar(@PathVariable Integer idTipoEntrenamiento) {
        service.eliminar(idTipoEntrenamiento);
    }


}
