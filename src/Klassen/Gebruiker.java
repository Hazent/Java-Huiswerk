package Klassen;

public class Gebruiker {
    private String naam;
    private int leeftijd;

    public Gebruiker(String _naam, int _leeftijd){
        this.naam = _naam;
        this.leeftijd = _leeftijd;
    }

    public String toString(){
        return(this.naam + ", " + this.leeftijd);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
