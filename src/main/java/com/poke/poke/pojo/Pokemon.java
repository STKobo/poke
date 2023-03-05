package com.poke.poke.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Pokemon {
    
    @Id
    @SequenceGenerator(name = "pokemon_seq", sequenceName = "pokedex_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_seq")
    @Column(name =  "pokemon_id", updatable = false)
    private Long id; 

    private String surname;

    @ManyToOne
    @JoinColumn(name = "pokedex_id")
    private Pokedex pokedex;
    
    private List<Capacite> capacitesList;

    public Pokemon(String surname, List<Capacite> capacitesList) {
        this.surname = surname;
        this.capacitesList = capacitesList;
    }
    

    public Pokemon(Long id, String surname, List<Capacite> capacitesList) {
        this.id = id;
        this.surname = surname;
        this.capacitesList = capacitesList;
    }

    public Pokemon(){}


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Capacite> getCapacitesList() {
        return this.capacitesList;
    }

    public void setCapacitesList(List<Capacite> capacitesList) {
        this.capacitesList = capacitesList;
    }


}
