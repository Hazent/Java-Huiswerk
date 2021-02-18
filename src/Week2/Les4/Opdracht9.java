package Week2.Les4;
import Klassen.*;

public class Opdracht9 {
    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO", false, false, true);
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());

        System.out.println("============");

        System.out.println(weerbericht);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.setNeerslag(true);
        System.out.println(weerbericht);

        Weerbericht wb = new Weerbericht(10.9, 4, "ZO", true, true, true);
        System.out.println(wb);
        System.out.println("============");

        Weerbericht wb3 = new Weerbericht(4.0, 9, "NO", false, true, false);
        System.out.println(wb3);

        wb3.setBewolking(false);
        System.out.println(wb3);
    }
}
