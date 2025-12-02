package controler;

import view.MainView;
import controler.Controler;
import model.DATASCluedoHP;
import model.EtatPartie;

public class Controler {

    private static MainView vue_;
    private static EtatPartie model_;
    private static DATASCluedoHP datas;

    public static void main(String[] args) {
        vue_ = new MainView(new Controler());

        String[] nomJoueurs = args;
        model_ = new EtatPartie(nomJoueurs, datas.nomSuspects, datas.nomObjets, datas.nomLieux);
    }

    public EtatPartie getModel() {
        return model_;
    }

    public MainView getView() {
        return vue_;
    }

}