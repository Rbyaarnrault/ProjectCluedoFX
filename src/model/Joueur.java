package model;

public class Joueur {

    private String nom_;

    public Joueur(String nom_) {
        this.nom_ = nom_;
    }

    // -------------
    // getters et setters

    public String getNom() {
        return nom_;
    }

    public void setNom(String nom_) {
        this.nom_ = nom_;
    }
}