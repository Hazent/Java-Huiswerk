package Klassen.Film;

public class Medewerker extends Persoon{
    private String functie;
    private int loonPerDraaidag;

    public Medewerker(String naam, String gebDatum, String sex, String functie, int loonPerDraaidag){
        super(naam, gebDatum, sex);
        this.functie = functie;
        this.loonPerDraaidag = loonPerDraaidag;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double berekenBeloning(int draaidagen){
        return loonPerDraaidag * draaidagen;
    }
}
