package Week1.Les1;

public class Opdracht3 {
    public static void main(String[] args) {
        /*
        String naam = "Esmee";

        System.out.println(naam + " is " + naam.length() + "letters");

         */ //A

        /*
        String naam1 = "Vincent";
        String naam2 = "Justin";

        if(naam1.length() > naam2.length()){
            System.out.println(naam1 + " is een langere naam dan " + naam2);
        } else if (naam1.length() < naam2.length()){
            System.out.println(naam2 + " is een langere naam dan " + naam1);
        } else {
            System.out.println("De namen zijn even lang");
        }

         */ //B

        /*
        String text = "aa";
        System.out.println(text + " " + text.length());
        text += text;
        System.out.println(text + " " + text.length());
        text += text;
        System.out.println(text + " " + text.length());

         */ //C & D

        /*
        String text = "aa";

        for(int i = 0; i < 3; i++){
            if(i % 2 == 0){
                text = text.toUpperCase(Locale.ROOT);
            } else {
                text = text.toLowerCase(Locale.ROOT);
            }
            System.out.println(text + " " + text.length());
            text += text;
        }

         */ //E

        /*
        int aantal = 4;
        System.out.print("Ik zie " + aantal + " vogel");
        if(aantal > 1) {
            System.out.print("s");
        }

         */ //F
    }
}
