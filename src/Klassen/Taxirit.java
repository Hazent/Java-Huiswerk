package Klassen;

public class Taxirit {
    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;
    static int totaalAantalRitten;

    public Taxirit(double afstand, int _aantalPers, int _maxAantal){
        this.afstand = afstand;
        this.aantalPers = _aantalPers;
        this.maxAantal = _maxAantal;
        totaalAantalRitten++;
    }

    public Taxirit(double afstand){
        this(afstand,1, 4);
        totaalAantalRitten++;
    }

    public void voegPersoonToe(int aantal){
        int nieuwAantal = this.aantalPers + aantal;
        if(this.maxAantal > nieuwAantal) {
            this.aantalPers += aantal;
        } else {
            System.out.println("Er is geen ruimte meer in de taxi");
        }
    }

    public double berekenPrijsPerPersoon(){
        double prijs = this.prijsPerKm * afstand;
        prijs = prijs / aantalPers;
        if(this.maxAantal == this.aantalPers) {
            prijs *= 0.9;
        }
        if(prijs < 2.5){
            prijs = 2.5;
        }
        return prijs;
    }

    public double berekenPrijsPerPersoon(double korting){
        double prijs = this.prijsPerKm * this.afstand;
        prijs /= aantalPers;
        korting /= 100;
        prijs *= korting;

        if(prijs < 2.5){
            prijs = 2.5;
        }
        return prijs;
    }

    public int getTotaalAantalRitten(){
        return totaalAantalRitten;
    }

}
