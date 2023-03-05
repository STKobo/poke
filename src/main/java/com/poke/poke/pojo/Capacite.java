package com.poke.poke.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GeneratedValue;

@Entity
public class Capacite {
    
    @Id
    @SequenceGenerator(name = "capacite_seq", sequenceName = "capacite_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "capacite_seq")
    @Column(name =  "capacite_id", updatable = false)
    private Long id;

    private String libelle;

    private Long puissance;

    @ManyToOne
    @JoinColumn(name = "pokemon_id", nullable = false)
    private Pokemon pokemon;


    public Capacite(Long id, String libelle, Long puissance) {
        this.id = id;
        this.libelle = libelle;
        this.puissance = puissance;
    }

    public Capacite(String libelle, Long puissance) {
        this.libelle = libelle;
        this.puissance = puissance;
    }

    public Capacite () {
        
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getPuissance() {
        return this.puissance;
    }

    public void setPuissance(Long puissance) {
        this.puissance = puissance;
    }
    
}
