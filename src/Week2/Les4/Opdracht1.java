package Week2.Les4;
import Klassen.*;

public class Opdracht1 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Tesla", "S", 400);
        System.out.println(auto1);

        auto1.voerOp(50);

        Fabriek fabriek1 = new Fabriek();

        Auto auto3 = fabriek1.maakAuto("Tesla", "Model 3", 360);
        System.out.println(auto3);
    }
}
