package com.poke.poke.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poke.poke.pojo.Pokemon;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonWs {

    @GetMapping
    public List<Pokemon> getAllPokemon(){
        return null;
    }

    @PostMapping
    public void createPokemon(@RequestBody Pokemon pokemon){
        
    }

    @PutMapping("{name}")
    public void updatePokemon(@PathVariable(name = "name") String nom){

    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable(name = "name") String nom){

    }

}
