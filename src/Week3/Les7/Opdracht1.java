package Week3.Les7;
import Klassen.*;

public class Opdracht1 {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Vincent Hazekamp", 2);
        p1.setNaam("Vincent Hazekamp");

        Student s1 = new Student("Vincent Hazekamp", 2, 1140691);
        s1.setStudentnr(1140691);

        System.out.println(s1);
    }
}
