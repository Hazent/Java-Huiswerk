package Klassen;

public class Fabriek {
    private String name = "Tesla";
    private int aantalGemaakteAutos;
    public static int totaalAantalGemaakteAutos;
    public int productieFout;
    public static int totaalProductieFout;

    public Auto maakAuto(String merk, String model, int pk){
        this.aantalGemaakteAutos++;
        Fabriek.totaalAantalGemaakteAutos++;
        return new Auto (merk, model, pk, this);
    }

    public static void printTotaalAantalGemaakteAutos(){
        System.out.println("Aantal auto's gemaakt: " + totaalAantalGemaakteAutos);
    }

    public void printTotaalZonderFout(){
        int zonderFout = totaalAantalGemaakteAutos - totaalProductieFout;
        System.out.println("Aantal autos zonder productie fouten: " + zonderFout);
    }

    public String getFabriekName() {
        return name;
    }
}
