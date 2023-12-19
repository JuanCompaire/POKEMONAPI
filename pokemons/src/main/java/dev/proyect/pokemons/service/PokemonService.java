package dev.proyect.pokemons.service;

import dev.proyect.pokemons.model.Pokemon;
import dev.proyect.pokemons.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> AllPokemons(){
        List<Pokemon> pokemons = pokemonRepository.findAll();
        System.out.println("Número de Pokémon recuperados: " + pokemons.size());
        System.out.println(pokemonRepository.findAll().toString());
        return pokemonRepository.findAll();

    }
}
