package com.informaticatelde.gestordeportivo.app.controller;


import com.informaticatelde.gestordeportivo.app.model.Habilidad;
import com.informaticatelde.gestordeportivo.app.service.HabilidadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidad")
public class HabilidadController {
/*
    private final HabilidadService service;

    public HabilidadController(HabilidadService habilidadService){
        this.service = habilidadService;
    }

    @GetMapping
    public List<Habilidad> listar (){
        return service.listar();
    }

    @GetMapping("/{idMaterial}")
    public Habilidad buscarPorId(@PathVariable Integer idHabilidad) {
        return service.buscarPorId(idHabilidad);
    }

    @PostMapping
    public Habilidad crear(@RequestBody Habilidad habilidad) {
        return service.guardar(habilidad);
    }

    @PutMapping("/{idMaterial}")
    public Habilidad actualizar(@PathVariable Integer idHabilidad, @RequestBody Habilidad habilidad) {
        return service.actualizar(habilidad,idHabilidad);
    }

    @DeleteMapping("/{idMaterial}")
    public void eliminar(@PathVariable Integer idHabilidad) {
        service.eliminar(idHabilidad);
    }
*/

}
