package dev.proyect.pokemons.repository;

import dev.proyect.pokemons.model.Pokemon;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, ObjectId>   {
}
