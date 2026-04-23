package com.informaticatelde.gestordeportivo.app.controller;

import com.informaticatelde.gestordeportivo.app.model.Material;
import com.informaticatelde.gestordeportivo.app.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/material")
public class MaterialController {

    private final MaterialService service;

    public MaterialController(MaterialService materialService){
        this.service = materialService;
    }

    @GetMapping
    public List<Material> listar (){
        return service.listar();
    }

    @GetMapping("/{idMaterial}")
    public Material obtenerPorId(@PathVariable Integer idMaterial) {
        return service.buscarPorId(idMaterial);
    }

    @PostMapping
    public Material crear(@RequestBody Material material) {
        return service.guardar(material);
    }

    @PutMapping("/{idMaterial}")
    public Material actualizar(@PathVariable Integer idMaterial, @RequestBody Material material) {
        return service.actualizar(material,idMaterial);
    }

    @DeleteMapping("/{idMaterial}")
    public void eliminar(@PathVariable Integer idMaterial) {
        service.eliminar(idMaterial);
    }

}
