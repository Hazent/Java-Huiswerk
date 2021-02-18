package Week2.Les5;
import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        /*
        String x = "Ja";
        String y = "va";
        String z = "Java";
        String xeny = x + y;

        if(xeny == z){
            System.out.println("Ze zijn gelijk");
        } else {
            System.out.println("Ze zijn niet gelijk");
        }

         */ //A

        /*
        String tekst1 = "Java";
        String tekst2 = "Java";

        if(tekst1 == tekst2){
            System.out.println("Ze zijn gelijk");
        } else {
            System.out.println("Ze zijn niet gelijk");
        }

         */ //B

        String teVergelijkenMet = "Java";

        Scanner in = new Scanner(System.in);
        System.out.println("input vergelijken met: \"" + teVergelijkenMet + "\" :");

        String gebruikerInput = in.nextLine();
        System.out.println("Je input was \"" + gebruikerInput + "\"");

        if(teVergelijkenMet.equals(gebruikerInput)) {
            System.out.println("Ze zijn gelijk aan elkaar");
        } else {
            System.out.println("Ze zijn niet gelijk aan elkaar");
        }
    }
}
