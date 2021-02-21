package Week3.Les8;
import Klassen.*;

public class Opdracht1 {
    public static void main(String[] args) {
        FormeelBericht f1 = new FormeelBericht("Harm", "Woudstra", "man", "Bedankt voor de bloemen.");
        InformeelBericht i1 = new InformeelBericht("Harm", "Woudstra", "man", "Bedankt voor de bloemen.");

        f1.printBericht();
        System.out.println("====================");
        i1.printBericht();
    }
}
