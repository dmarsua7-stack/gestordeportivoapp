package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.CategoriaEjercicio;
import com.informaticatelde.gestordeportivo.app.service.CategoriaEjercicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/categoria/ejercicio")
public class CategoriaEjercicioController {



    private final CategoriaEjercicioService service;

    public CategoriaEjercicioController (CategoriaEjercicioService service){
        this.service = service;
    }


    @GetMapping
    public List<CategoriaEjercicio> listar (){
        return service.listar();
    }

    @GetMapping("/{idCategoriaEjercicio}")
    public CategoriaEjercicio getById(@PathVariable Integer idCategoriaEjercicio) {
        return service.getById(idCategoriaEjercicio);
    }

    @PostMapping
    public CategoriaEjercicio crear(@RequestBody CategoriaEjercicio categoria) {
        return service.guardar(categoria);
    }

    @PutMapping("/{idCategoriaEjercicio}")
    public CategoriaEjercicio actualizar(@PathVariable Integer idCategoriaEjercicio, @RequestBody CategoriaEjercicio categoria) {

        return service.actualizar(categoria, idCategoriaEjercicio);
    }

    @DeleteMapping("/{idCategoriaEjercicio}")
    public void eliminar(@PathVariable Integer idCategoriaEjercicio) {
        service.eliminar(idCategoriaEjercicio);
    }





}
