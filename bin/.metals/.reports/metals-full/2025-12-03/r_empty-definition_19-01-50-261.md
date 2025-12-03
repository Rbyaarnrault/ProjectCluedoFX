error id: file:///C:/Users/barra/Desktop/Ryan/Perso/JavaProjects/ProjectCluedoFX/src/model/EtatPartie.java:_empty_/listeCartesMelangees#
file:///C:/Users/barra/Desktop/Ryan/Perso/JavaProjects/ProjectCluedoFX/src/model/EtatPartie.java
empty definition using pc, found symbol in pc: _empty_/listeCartesMelangees#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1826
uri: file:///C:/Users/barra/Desktop/Ryan/Perso/JavaProjects/ProjectCluedoFX/src/model/EtatPartie.java
text:
```scala
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class EtatPartie {

    private Modele modele_;
    private Solution solution_;
    private ArrayList<Joueur> joueurs_;
    private ArrayList<Carte> cartes_;
    private int nbJoueurs_;

    public EtatPartie(Modele modele_) {
        this.modele_ = modele_;
        this.joueurs_ = this.modele_.getJoueurs();
        this.nbJoueurs_ = this.joueurs_.size();

        // Solution aléatoire
        Random rand = new Random();

        int indexSuspect = rand.nextInt(this.modele_.getSuspects().size()); // aléatoire entre 0 et taille liste-1
        int indexObjet = rand.nextInt(this.modele_.getObjets().size());
        int indexLieu = rand.nextInt(this.modele_.getLieux().size());

        Suspect su = this.modele_.getSuspects().get(indexSuspect);
        Objet ob = this.modele_.getObjets().get(indexObjet);
        Lieu li = this.modele_.getLieux().get(indexLieu);

        this.solution_ = new Solution(su, ob, li);

        // --------------- Distribution des cartes ---------------
        ArrayList<Carte> cartesDistrib = this.modele_.getCartes();

        // Retrait de la solution
        cartesDistrib.remove(su);
        cartesDistrib.remove(ob);
        cartesDistrib.remove(li);

        int nbCartesParJoueur = cartesDistrib.size() / this.nbJoueurs_;

        // Mélange aléatoire des cartes
        Collections.shuffle(cartesDistrib);

        for (int i = 0; i < nbJoueurs_; i++) { // Pour chaque Joueur

            for (int j = 0; j < nbCartesParJoueur; j++) {
                Carte c = cartesDistrib.get(0);
                joueurs_.get(i).ajouterCarteMain(c); // Affecte la première carte au Joueur j
                @@listeCartesMelangees.remove(0);
            }
        }
    }
    

    public Solution getSolution() {
        return this.solution_;
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/listeCartesMelangees#