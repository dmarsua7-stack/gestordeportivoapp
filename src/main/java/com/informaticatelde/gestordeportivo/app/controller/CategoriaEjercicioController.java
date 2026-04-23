package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEjercicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/categoria/ejercicio")
public class CategoriaEjercicioController {


    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<CategoriaEjercicio> listar (){
        return service.listar();
    }

    @GetMapping("/categoria/ejercicio/lista/{idCategoriaEjercicio}")
    public CategoriaEjercicio getById(@PathVariable Integer idCategoriaEjercicio) {
        return service.getById(idCategoriaEjercicio);
    }

    @PostMapping
    public CategoriaEjercicio crear(@RequestBody CategoriaEjercicio categoria) {
        return service.guardar(categoria);
    }

    @PutMapping("/{idCategoriaEjercicio}")
    public CategoriaEjercicio actualizar(@PathVariable Integer idCategoriaEjercicio, @RequestBody CategoriaEjercicio categoria) {
        CategoriaEjercicio existente = service.getById(idCategoriaEjercicio);
        if (existente == null) return null;

        existente.setNombre(CategoriaEjercicio.getNombre());
        existente.setDescripcion(CategoriaEjercicio.getDescripcion());
        existente.setImagen(CategoriaEjercicio.getImagen());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idCategoriaEjercicio}")
    public void eliminar(@PathVariable Integer idCategoriaEjercicio) {
        service.eliminar(idCategoriaEjercicio);
    }


*/


}
