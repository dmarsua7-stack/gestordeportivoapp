package com.informaticatelde.gestordeportivo.app;

import com.informaticatelde.gestordeportivo.app.controller.MaterialController;
import com.informaticatelde.gestordeportivo.app.model.CategoriaEquipo;
import com.informaticatelde.gestordeportivo.app.model.Equipo;
import com.informaticatelde.gestordeportivo.app.model.Multimedia;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialController.class, args);

		CategoriaEquipo categoriaEquipo = new CategoriaEquipo("INFANTIL","Categoria de 12 a 14 años");
		Equipo equipo = new Equipo("CD LAS BRUJAS", categoriaEquipo);
		Multimedia escudoEquipo = new Multimedia("Escudo","Escudo del Club",LocalDate.of(2026,4,17),"/yasevera/");
		equipo.setMultimedia(escudoEquipo);
		// categoria.setEquipo(equipo);

	}

}
