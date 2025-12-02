package model;

import java.util.ArrayList;

public class Joueur {

    private String nom_;
    private ArrayList<Carte> main_;

    public Joueur(String nom_) {
        this.nom_ = nom_;
        this.main_ = new ArrayList<Carte>();
    }

    public void ajouterCarteMain(Carte c) {
        this.main_.add(c);
    }

    // -----------------------------------------------------------------
    // getters et setters

    public String getNom() {
        return nom_;
    }

    public void setNom(String nom_) {
        this.nom_ = nom_;
    }

    public ArrayList<Carte> getMain() {
        return main_;
    }
}