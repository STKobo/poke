package com.poke.poke.pojo;

public class Capacite {
    
    private Long id;

    private String libelle;

    private Long puissance;



    public Capacite(Long id, String libelle, Long puissance) {
        this.id = id;
        this.libelle = libelle;
        this.puissance = puissance;
    }

    public Capacite(String libelle, Long puissance) {
        this.libelle = libelle;
        this.puissance = puissance;
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
