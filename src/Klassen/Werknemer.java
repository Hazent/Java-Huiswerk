package Klassen;

public class Werknemer extends Persoon{
    private double salaris;

    public Werknemer(String _naam, int _leeftijd, double _salaris){
        super(_naam, _leeftijd);
        this.salaris = _salaris;
    }

    public String toString(){
        return (super.toString() + ", met het salaris €" + salaris);
    }

    public void verhoogSalaris(double bedrag){
        this.salaris += bedrag;
    }
}
