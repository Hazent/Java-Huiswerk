package Week3.Les6;
import Klassen.*;

public class Opdracht7 {
    public static void main(String[] args) {
        Gebruiker g1 = new Gebruiker("Redmer Schoenmaker", 22);
        Gebruiker g2 = new Gebruiker("Jennifer Dassen", 18);

        Bericht b1 = new Bericht(g1, "Hoi");
        Bericht b2 = new Bericht(g2, "Hallo, Hoe gaat het?");
        Bericht b3 = new Bericht(g1, "Goed! Met jou ook?");
        Bericht b4 = new Bericht(g2, "Prima, maar ik moet wel weer verder");
        Bericht b5 = new Bericht(g1, "Oké tot snel!");
        Bericht b6 = new Bericht(g2, "Doei!");

        Bericht berichten[] = {b1, b2, b3, b4, b5, b6};

        int aantal = berichten.length;

        System.out.println("Er zijn " + aantal + " berichten:");

        for(int i = 0; i < aantal; i++){
            System.out.println(berichten[i]);
        }
    }
}
