package dev.proyect.pokemons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @Id
    private ObjectId numero_pokedex;
    private String nombre;
    private String tipos;
    private Float peso;
    private Float altura;

    private String foto;
}
