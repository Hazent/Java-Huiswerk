package Klassen.Film;

public class Acteur extends Persoon {

    private Rol rol;
    private int vasteBeloning;
    private int loonPerDraaidag;

    public Acteur(String naam, String gebDatum, String sex, Rol rol, int vasteBeloning, int loonPerDraaidag) {
        super(naam, gebDatum, sex);
        this.rol = rol;
        this.vasteBeloning = vasteBeloning;
        this.loonPerDraaidag = loonPerDraaidag;
    }

    public double berekenBeloning(int draaidagen){
        return vasteBeloning + (loonPerDraaidag * draaidagen);
    }
}
