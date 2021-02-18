package Week2.Les4;
import Klassen.*;

public class Opdracht8 {
    public static void main(String[] args) {
        Hemellichaam hl1 = new Hemellichaam("Mercurius", "planeet");
        Hemellichaam hl2 = new Hemellichaam("PSO J318.5-22");
        Hemellichaam hl3 = new Hemellichaam("Pluto", "planeet");
        Hemellichaam hl4 = new Hemellichaam("Aarde", "Planeet");
        Hemellichaam hl5 = new Hemellichaam("Antares", "ster");

        hl3.setType("dwergplaneet");

        hl4.setTemperatuur(-89, 58);
        hl4.printTemperatuur();

        hl5.setTemperatuur(3204);
        hl5.printTemperatuur();
    }
}
