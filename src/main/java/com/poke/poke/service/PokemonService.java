package com.poke.poke.service;

import java.util.List;

import com.poke.poke.pojo.Pokemon;

public interface PokemonService {
    
    List<Pokemon> getAllPokemon();

    List<Pokemon> getAllPokemonByName(String name);

    void updatePokemon(String pokemonName, Pokemon pokemon);

    void createPokemon(Pokemon pokemon);

    void deletePokemon(String name);
}
