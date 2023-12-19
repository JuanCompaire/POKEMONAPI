package dev.proyect.pokemons.controller;

import dev.proyect.pokemons.model.Pokemon;
import dev.proyect.pokemons.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pokemons")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;
    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemons() {
        List<Pokemon> pokemons = pokemonService.AllPokemons();
        System.out.println("Número de Pokémon en la respuesta: " + pokemons.size());
        return new ResponseEntity<List<Pokemon>>(pokemonService.AllPokemons(), HttpStatus.OK);
    }
}
