package view;

import controler.Controler;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class EcranAccueil extends JPanel {

    public EcranAccueil(Controler contr_) {
        this.setName("Accueil -");
        JLabel lab = new JLabel("COUCOU");
        this.add(lab);
    }
}