package model;

public class Solution {

    private Suspect suspect;
    private Objet objet;
    private Lieu lieu;
    private Boolean suspectTrouve;
    private Boolean objetTrouve;
    private Boolean lieuTrouve;

    public Solution(Suspect s, Objet o, Lieu l) {
        this.suspect = s;
        this.objet = o;
        this.lieu = l;
    }

    public Suspect getSuspect() {
        return this.suspect;
    }

    public Objet getObjet() {
        return this.objet;
    }

    public Lieu getLieu() {
        return this.lieu;
    }

    public Boolean suspectTrouve() {
        return suspectTrouve;
    }

    public Boolean objetTrouve() {
        return objetTrouve;
    }

    public Boolean lieuTrouve() {
        return lieuTrouve;
    }

    public void setSuspectTrouve(Boolean b) {
        this.suspectTrouve = b;
    }

    public void setObjetTrouve(Boolean b) {
        this.objetTrouve = b;
    }

    public void setLieuTrouve(Boolean b) {
        this.lieuTrouve = b;
    }
}
