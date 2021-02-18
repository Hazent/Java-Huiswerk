package Week2.Les5;
import Klassen.*;

public class Opdracht3 {
    public static void main(String[] args) {
        Weerbericht wb1 = new Weerbericht(14.5, 3, "NW", false, false, true);
        System.out.println(wb1);
        wb1.verhoogDag();
        System.out.println(wb1);
        wb1.verhoogDag(2);
        System.out.println(wb1);
    }
}
