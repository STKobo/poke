package com.poke.poke.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.poke.poke.pojo.Pokemon;
import com.poke.poke.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService{

    private static List<Pokemon> maListe = new ArrayList<>();

    @Override
    public List<Pokemon> getAllPokemon() {
        return maListe;
    }

    @Override
    public List<Pokemon> getAllPokemonByName(String name) {
        return maListe.stream().filter(pokemon -> pokemon.getSurname().equals(name)).collect(Collectors.toList());
    }

    @Override
    public void updatePokemon(String pokemonName, Pokemon pokemon) {
        this.deletePokemon(pokemonName);
        maListe.add(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPokemon'");
    }

    @Override
    public void deletePokemon(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePokemon'");
    }
    
    
}
