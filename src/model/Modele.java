package model;

import java.util.ArrayList;

public class Modele {

    private ArrayList<Joueur> joueurs;
    private ArrayList<Carte> cartes;
    private ArrayList<Suspect> suspects;
    private ArrayList<Objet> objets;
    private ArrayList<Lieu> lieux;

    public Modele(String[] nomsJoueurs, String[] nomsSuspects, String[] nomsObjets, String[] nomsLieux) {
        // Préparation de la partie

        // Joueurs
        this.joueurs = new ArrayList<Joueur>();
        for (String n : nomsJoueurs) {
            this.joueurs.add(new Joueur(n));
        }

        // Cartes
        this.suspects = new ArrayList<Suspect>();
        this.objets = new ArrayList<Objet>();
        this.lieux = new ArrayList<Lieu>();

        for (String s : nomsSuspects) {
            this.suspects.add(new Suspect(s));
        }
        for (String o : nomsObjets) {
            this.objets.add(new Objet(o));
        }
        for (String l : nomsLieux) {
            this.lieux.add(new Lieu(l));
        }

        cartes = new ArrayList<Carte>();
        cartes.addAll(suspects);
        cartes.addAll(objets);
        cartes.addAll(lieux);
    }

    public ArrayList<Joueur> getJoueurs() {
        return this.joueurs;
    }

    public ArrayList<Carte> getCartes() {
        return this.cartes;
    }

    public ArrayList<Suspect> getSuspects() {
        return this.suspects;
    }

    public ArrayList<Objet> getObjets() {
        return this.objets;
    }

    public ArrayList<Lieu> getLieux() {
        return this.lieux;
    }
}
