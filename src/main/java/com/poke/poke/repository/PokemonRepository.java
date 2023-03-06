package com.poke.poke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poke.poke.pojo.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Long>{
    
    
}
