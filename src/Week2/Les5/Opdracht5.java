package Week2.Les5;
import Klassen.*;

public class Opdracht5 {
    public static void main(String[] args) {
        Verpakking doos1 = new Verpakking(2, 10, 3, false);
        Verpakking doos2 = new Verpakking(2, 10, 3, false);

        System.out.println(doos1.equals(doos2));
    }
}
