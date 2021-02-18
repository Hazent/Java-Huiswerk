package Week3.Les6;
import Klassen.*;

public class Opdracht4 {
    public static void main(String[] args) {
        Act act1 = new Act("Act1", 60);

        Artiest a1 = new Artiest("Redmer Schoenmaker");
        Artiest a2 = new Artiest("Vincent Hazekamp");
        Artiest a3 = new Artiest("Jasmijn Rijpstra");

        act1.voegArtiestToe(a1);
        act1.voegArtiestToe(a2);
        act1.printAct();
        act1.voegArtiestToe(a3);
        act1.printAct();

        System.out.println("================");

        Circus c1 = new Circus("BroederGozer");

        c1.voegActToe(act1);

        Act act2 = new Act("Act2", 30);
        act2.voegArtiestToe(a2);
        act2.voegArtiestToe(a3);
        Circus c2 = new Circus("GozerMakker");
        c2.voegActToe(act2);

        c1.printActOverzicht();
        c2.printActOverzicht();
    }
}
