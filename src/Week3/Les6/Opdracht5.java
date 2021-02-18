package Week3.Les6;
import Klassen.*;

public class Opdracht5 {
    public static void main(String[] args) {
        Act act = new Act("act 1", 60);

        Artiest artiest1 = new Artiest("artiest 1");
        act.voegArtiestToe(artiest1);

        Artiest artiest2 = new Artiest("artiest 2");
        act.voegArtiestToe(artiest2);

        Artiest artiest3 = new Artiest("artiest 3");
        act.voegArtiestToe(artiest3);

        act.voegArtiestToe(new Artiest("artiest 4"));

        // even kijken hoe de act eruit ziet:
        System.out.println(act);

        Artiest artiest2_copy = new Artiest("artiest 2");

        boolean antwoord = act.wordtUitgevoerdDoor(artiest2_copy);
        System.out.println("act door " + artiest2_copy + "? " + antwoord); // false

        antwoord = act.wordtUitgevoerdDoor(artiest3);
        System.out.println("act door " + artiest3 + "? " + antwoord); // true

        Artiest artiest4 = new Artiest("artiest 4");
        antwoord = act.wordtUitgevoerdDoor(artiest4);
        System.out.println("act door " + artiest4 + "? " + antwoord); // false

        Artiest artiest5 = new Artiest("dazn");
        antwoord = act.wordtUitgevoerdDoor(artiest5);
        System.out.println("act door " + artiest5 + "? " + antwoord); // false

    }
}
