package Week2.Les5;
import Klassen.*;

public class Opdracht1 {
    public static void main(String[] args) {
        System.out.println("Aantal: " + Fabriek.totaalAantalGemaakteAutos);
        Fabriek fabriek = new Fabriek();
        Auto a = fabriek.maakAuto("Tesla", "Model S", 360);
        Auto bb = fabriek.maakAuto("BMW", "Civic", 180);
        System.out.println("Aantal: " + Fabriek.totaalAantalGemaakteAutos);
        Fabriek fabriek2 = new Fabriek();
        Auto ccc = fabriek2.maakAuto("", "", 10);
        Auto dddd = fabriek2.maakAuto("", "", 120);
        Auto eeeee = fabriek2.maakAuto("", "", 340);
        System.out.println("Aantal: " + Fabriek.totaalAantalGemaakteAutos);
    }
}
