package com.poke.poke.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pokemon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id; 

    private String surname;

    @OneToMany
    private List<Capacite> capacitesList;


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
