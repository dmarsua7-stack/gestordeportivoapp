package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Contacto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ContactoController {


    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<Contacto> listar (){
        return service.listar();
    }

    @GetMapping("/contacto/lista/{idContacto}")
    public Contacto getById(@PathVariable Integer idContacto) {
        return service.getById(idContacto);
    }

    @PostMapping
    public Contacto crear(@RequestBody Contacto contacto) {
        return service.guardar(contacto);
    }

    @PutMapping("/{idContacto}")
    public Contacto actualizar(@PathVariable Integer idContacto, @RequestBody Contacto contacto) {
        Contacto existente = service.getById(idContacto);
        if (existente == null) return null;

        existente.setNombre(Contacto.getNombre());
        existente.setApellido1(Contacto.getApellido1());
        existente.setApellido2(Contacto.getApellido2());
        existente.setEmails(Contacto.getEmails());
        existente.setTelefonos(Contacto.getTelefonos());
        existente.setJugadores(Contacto.getJugadores());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idContacto}")
    public void eliminar(@PathVariable Integer idContacto) {
        service.eliminar(idContacto);
    }

*/

}
