package Week1.Les1;

public class Opdracht2 {
    public static void main(String[] args) {
        /*
        int breedte = 8;
        int hoogte = 8;
        for(int i = 0; i < hoogte; i++){
            System.out.println("*".repeat(breedte));
        }
        */ //Rechthoek

        /*
        int hoogte = 8;
        for(int i = 1; i <= hoogte; i++){
            System.out.println("*".repeat(i));
        }
        */ //Driehoek

        /*
        int hoogte = 20;
        for(int i = hoogte; i > 0; i--){
            System.out.println("*".repeat(i));
        }
        */ //Reverse Driehoek

        //Pyramide
        int breedte = 5;
        for(int i = 1; i <= breedte; i++){
            System.out.println("*".repeat(i));
        }
        for(int j = breedte-1; j > 0; j--){
            System.out.println("*".repeat(j));
        }
    }
}
