package com.informaticatelde.gestordeportivo.app.controller;


import com.informaticatelde.gestordeportivo.app.model.Instalacion;
import com.informaticatelde.gestordeportivo.app.service.InstalacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/instalacion")
public class InstalacionController {

    private final InstalacionService service;

    public InstalacionController(InstalacionService instalacionService){
        this.service = instalacionService;
    }

    @GetMapping
    public List<Instalacion> listar (){
        return service.listar();
    }

    @GetMapping("/{idInstalacion}")
    public Instalacion obtenerPorId(@PathVariable Integer idInstalacion) {
        return service.buscarPorId(idInstalacion);
    }

    @PostMapping
    public Instalacion crear(@RequestBody Instalacion instalacion) {
        return service.guardar(instalacion);
    }

    @PutMapping("/{idInstalacion}")
    public Instalacion actualizar(@PathVariable Integer idInstalacion, @RequestBody Instalacion instalacion) {
        return service.actualizar(instalacion,idInstalacion);
    }

    @DeleteMapping("/{idInstalacion}")
    public void eliminar(@PathVariable Integer idInstalacion) {
        service.eliminar(idInstalacion);
    }



}
