package dev.proyect.pokemons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PokemonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonsApplication.class, args);
	}



}
