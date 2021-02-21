package Klassen;

public class Klant extends Persoon{
    private double budget;

    public Klant(String _naam, int _leeftijd, double _budget){
        super(_naam, _leeftijd);
        this.budget = _budget;
    }

    public String toString(){
        return super.toString() + ", met een budget van €" +budget;
    }

    public void verhoogBudget(double bedrag){
        this.budget += bedrag;
    }
}
