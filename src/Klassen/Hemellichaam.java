package Klassen;

public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin;
    private int tempMax;

    public Hemellichaam(String naam, String type){
        this.naam = naam;
        this.type = type;
        this.tempMin = 0;
        this.tempMax = 0;
    }

    public Hemellichaam(String naam){
        this.naam = naam;
        this.type = "onbekend";
        this.tempMin = 0;
        this.tempMax = 0;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String _type) {
        System.out.println("Het type van " + this.naam + " veranderd van " + this.type + " naar " + _type);
        this.type = _type;
    }

    public void setTemperatuur(int temp){
        this.tempMax = temp;
        this.tempMin = temp;
    }

    public void setTemperatuur(int tempMin, int tempMax){
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public String toString(){
        return naam + " (" + type + ")";
    }

    public void printTemperatuur(){
        if(this.tempMax == this.tempMin){
            System.out.println("De temperatuur is ongeveer " + this.tempMax + " graden");
        } else {
            System.out.println("Het is minimaal " + this.tempMin + " graden, en maximaal " + this.tempMax + " graden");
        }
    }
}
