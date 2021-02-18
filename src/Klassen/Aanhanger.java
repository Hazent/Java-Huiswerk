package Klassen;

public class Aanhanger {
    private int lengte;
    private int aantalWielen;

    public Aanhanger (int lengte, int aantalWielen){
        this.lengte = lengte;
        this.aantalWielen = aantalWielen;
    }

    public String toString(){
        return "Lengte van aanhanger: " + lengte + ", aantal wielen: " +aantalWielen;
    }

    public int getLengte() {
        return lengte;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }
}
