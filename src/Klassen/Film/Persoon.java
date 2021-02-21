package Klassen.Film;

public abstract class Persoon {
    private String naam;
    private String gebDatum;
    private String sex;

    public Persoon(String naam, String gebDatum, String sex){
        this.naam = naam;
        this.gebDatum = gebDatum;
        this.sex = sex;
    }

    public abstract double berekenBeloning(int draaidagen);

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
