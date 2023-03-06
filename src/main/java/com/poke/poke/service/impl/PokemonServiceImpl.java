package com.poke.poke.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public void updatePokemon(Long id, Pokemon pokemon) {
        this.deletePokemon(id);
        pokemonRepository.save(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public void deletePokemon(Long id) {
       pokemonRepository.deleteById(id);
    }
    
    
}
