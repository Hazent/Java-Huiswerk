package Week4.Les9;
import Klassen.Les9.*;

public class ID {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
        Persoon persoon2 = new Persoon(new Identiteitskaart("Jennie", "44320098"));
        Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));

        System.out.println(persoon1);
        System.out.println(persoon2);
        System.out.println(persoon3);

    }
}
