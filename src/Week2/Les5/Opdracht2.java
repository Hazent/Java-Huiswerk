package Week2.Les5;
import Klassen.*;

public class Opdracht2 {
    public static void main(String[] args) {
        Cirkel cirkel1 = new Cirkel(3.6);

        System.out.println("Omtrek van Cirkel1 is " + cirkel1.berekenOmtrek());
        System.out.println("Oppervlakte van Cirkel1 is " + cirkel1.berekenOppervlakte());
    }
}
