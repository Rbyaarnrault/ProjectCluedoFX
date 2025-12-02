package model;

import java.util.ArrayList;
import java.util.Random;

public class EtatPartie {

    private ArrayList<Joueur> joueurs;
    private ArrayList<Carte> cartes;
    private ArrayList<Suspect> suspects;
    private ArrayList<Objet> objets;
    private ArrayList<Lieu> lieux;

    public EtatPartie(String[] nomsJoueurs, String[] nomsSuspects, String[] nomsObjets, String[] nomsLieux) {
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

        // Solution aléatoire
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        int indexSuspect = rand1.nextInt(this.suspects.size()); // index aléatoire entre 0 et taille liste - 1
        int indexObjet = rand2.nextInt(this.objets.size());
        int indexLieu = rand3.nextInt(this.lieux.size());

        Suspect su = this.suspects.get(indexSuspect);
        Objet ob = this.objets.get(indexObjet);
        Lieu li = this.lieux.get(indexLieu);

        Solution solution = new Solution(su, ob, li);
    }
}
