package Week2.Les4;
import Klassen.*;

public class Opdracht6 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Tesla", "Model 3", 360);
        Aanhanger dezeAanhanger = new Aanhanger(40, 4);
        auto1.setAanhanger(dezeAanhanger);
        dezeAanhanger.setLengte(999);

        auto1.getAanhanger();
        System.out.println(dezeAanhanger);
    }
}
