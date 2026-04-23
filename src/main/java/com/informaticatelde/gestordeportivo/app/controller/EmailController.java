package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Email;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmailController {


    // @Autowired
    // private MultimediaService service;
/*
    @GetMapping
    public List<Email> listar (){
        return service.listar();
    }

    @GetMapping("/email/lista/{idEjercicioMaterial}")
    public Email getById(@PathVariable Integer idEmail) {
        return service.getById(idEmail);
    }

    @PostMapping
    public Email crear(@RequestBody Email email) {
        return service.guardar(email);
    }

    @PutMapping("/{idEmail}")
    public Email actualizar(@PathVariable Integer idEmail, @RequestBody Email email) {
        Email existente = service.getById(idEmail);
        if (existente == null) return null;

        existente.setNombre(Email.getNombre());
        existente.setEmail(Email.getEmail());
        existente.setContacto(Email.getContacto());

        return service.guardar(existente);
    }

    @DeleteMapping("/{idEmaill}")
    public void eliminar(@PathVariable Integer idEmail) {
        service.eliminar(idEmail);
    }
*/
}
