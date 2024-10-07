package controler;

import view.MainView;
import controler.Controler;
import model.Model;

public class Controler {

    private static MainView vue_;
    private static Model model_;

    public Controler() {

    }

    public static void main(String[] args) {
        vue_ = new MainView(new Controler());
        model_ = new Model();
    }

    public Model getModel() {
        return model_;
    }

    public MainView getView() {
        return vue_;
    }

}