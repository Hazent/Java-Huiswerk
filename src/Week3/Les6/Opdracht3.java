package Week3.Les6;
import Klassen.*;

public class Opdracht3 {
    public static void main(String[] args) {
        Circus cir = new Circus("Makkermaat");
        cir.printArtiesten();

        Circus andereNaamVoorZelfdeCircus = cir;
        andereNaamVoorZelfdeCircus.setArtiest(1, new Artiest("Jopie de Clown"));
        cir.printArtiesten();
    }
}
