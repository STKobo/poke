package com.poke.poke.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poke.poke.pojo.Pokemon;
import com.poke.poke.repository.PokemonRepository;
import com.poke.poke.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService{

    private static final String Optionnal = null;
    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        Optional<Pokemon> pokemonOptional = pokemonRepository.findById(id);
        return pokemonOptional.orElse(null);
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
