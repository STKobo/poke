package com.poke.poke.pojo;

import java.util.List;

public class Pokedex {
    
    private Long id;

    private String region; 

    private List<Pokemon> pokemonList;


    public Pokedex(String region, List<Pokemon> pokemonList) {
        this.region = region;
        this.pokemonList = pokemonList;
    }


    public Pokedex(Long id, String region, List<Pokemon> pokemonList) {
        this.id = id;
        this.region = region;
        this.pokemonList = pokemonList;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


}
