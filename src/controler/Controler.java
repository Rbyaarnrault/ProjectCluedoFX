package controler;

import controler.Controler;
import model.DATASCluedoHP;
import model.EtatPartie;
import model.Modele;

public class Controler {

    private static Modele model_;
    private static EtatPartie partie_;
    private static DATASCluedoHP datas;

    public static void main(String[] args) {
        String[] nomJoueurs = args;
        model_ = new Modele(nomJoueurs, datas.nomSuspects, datas.nomObjets, datas.nomLieux);
        partie_ = new EtatPartie(model_);
    }

    public Modele getModel() {
        return model_;
    }

    public EtatPartie getEtatPartie() {
        return partie_;
    }
}