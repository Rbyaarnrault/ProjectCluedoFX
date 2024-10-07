package view;

import javax.swing.JFrame;
import controler.Controler;

public class MainView extends JFrame {

    private static EcranAccueil ecranAccueil_;
    private Controler contr_;

    public MainView(Controler contr_) {
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        initEcrans();
        switchEcran("accueil"); // choix de l'écran d'accueil pour commencer
        this.setVisible(true);
    }

    public void switchEcran(String choix_) {

        switch (choix_) {
            case "accueil":
                this.setContentPane(ecranAccueil_);

            default:
                this.setContentPane(ecranAccueil_);

        }
    }

    public void initEcrans() {
        ecranAccueil_ = new EcranAccueil(this.contr_);
    }
}