package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/multimedia")
public class MultimediaController {

/*
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
        Multimedia existente = service.getById(idMultimedia);
        if (existente == null) return null;

        existente.setNombre(Multimedia.getNombre());
        existente.setDescripcion(Multimedia.getDescripcion());
        existente.setFechaCarga(Multimedia.getFechaCarga());
        existente.setUrl(Multimedia.getUrl());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idMultimedia}")
    public void eliminar(@PathVariable Integer idMultimedia) {
        service.eliminar(idMultimedia);
    }

*/

}
