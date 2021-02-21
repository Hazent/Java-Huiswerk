package Week3.Les7;
import Klassen.*;

public class Opdracht2 {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Hilde", 26);
        p1.jarig();
        System.out.println(p1);

        System.out.println("===================");
        Werknemer w1 = new Werknemer("Piet", 34, 1400.75);
        w1.jarig();
        System.out.println(w1);

        System.out.println("===================");
        Klant k1 = new Klant("Ashwin", 31, 75.5);
        k1.jarig();
        System.out.println(k1);
    }
}
