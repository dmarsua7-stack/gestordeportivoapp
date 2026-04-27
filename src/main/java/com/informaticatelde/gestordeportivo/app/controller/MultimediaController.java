package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import com.informaticatelde.gestordeportivo.app.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/multimedia")
public class MultimediaController {


    @Autowired
    private MultimediaService service;

    @GetMapping
    public List<Multimedia> listar (){
        return service.listar();
    }

    @GetMapping("/multimedia/lista/{idMultimedia}")
    public Multimedia getById(@PathVariable Integer idMultimedia) {
        return service.getById(idMultimedia);
    }

    @PostMapping
    public Multimedia crear(@RequestBody Multimedia multimedia) {
        return service.guardar(multimedia);
    }

    @PutMapping("/{idMultimedia}")
    public Multimedia actualizar(@PathVariable Integer idMultimedia, @RequestBody Multimedia multimedia) {
        return service.actualizar(multimedia,idMultimedia);
    }

    @DeleteMapping("/{idMultimedia}")
    public void eliminar(@PathVariable Integer idMultimedia) {
        service.eliminar(idMultimedia);
    }



}
