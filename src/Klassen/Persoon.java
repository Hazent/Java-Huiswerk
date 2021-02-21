package Klassen;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String _naam, int _leeftijd){
        this.naam = _naam;
        this.leeftijd = _leeftijd;
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

    public String toString(){
        return "Dit is "+naam+", leeftijd "+leeftijd;
    }

    public void jarig(){
        leeftijd++;
    }
}
