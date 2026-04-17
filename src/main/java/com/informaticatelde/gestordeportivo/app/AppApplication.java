package com.informaticatelde.gestordeportivo.app;

import com.informaticatelde.gestordeportivo.app.model.Categoria;
import com.informaticatelde.gestordeportivo.app.model.Equipo;
import com.informaticatelde.gestordeportivo.app.model.Material;
import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.informaticatelde.gestordeportivo.app.controller.AppApplication.class, args);

		Categoria categoria = new Categoria ("INFANTIL","Categoria de 12 a 14 años",null);
		Equipo equipo = new Equipo("CD LAS BRUJAS", categoria);
		Multimedia escudoEquipo = new Multimedia("Escudo","Escudo del Club",Date.valueOf("17/04/2026"));
		equipo.setMultimedia(escudoEquipo);
		categoria.setEquipo(equipo);

	}

}
