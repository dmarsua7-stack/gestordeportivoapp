package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.TipoEntrenamiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TipoEntrenamientoController {


    // @Autowired
    // private MultimediaService service;

   /* @GetMapping
    public List<TipoEntrenamiento> listar (){
        return service.listar();
    }

    @GetMapping("/entrenamiento/tipo/lista/{idTipoEntrenamiento}")
    public TipoEntrenamiento getById(@PathVariable Integer idTipoEntrenamiento) {
        return service.getById(idTipoEntrenamiento);
    }

    @PostMapping
    public TipoEntrenamiento crear(@RequestBody TipoEntrenamiento tipo) {
        return service.guardar(tipo);
    }

    @PutMapping("/{idTipoEntrenamiento}")
    public TipoEntrenamiento actualizar(@PathVariable Integer idTipoEntrenamiento, @RequestBody TipoEntrenamiento tipo) {
        TipoEntrenamiento existente = service.getById(TipoEntrenamiento);
        if (existente == null) return null;

        existente.setNombre(TipoEntrenamiento.getNombre());
        existente.setDescripcion(TipoEntrenamiento.getDescripcion());
        existente.setMultimedia(TipoEntrenamiento.getMultimedia());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idTipoEntrenamiento}")
    public void eliminar(@PathVariable Integer idTipoEntrenamiento) {
        service.eliminar(idTipoEntrenamiento);
    }

*/

}
