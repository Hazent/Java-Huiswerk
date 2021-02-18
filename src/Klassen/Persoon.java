package Klassen;

public class Persoon {
    private String naam;
    private int lengte;

    public Persoon(String _naam, int _lengte){
        this.naam = _naam;
        this.lengte = _lengte;
    }

    public String getNaam() {
        return naam;
    }

    public int getLengte() {
        return lengte;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }
}
