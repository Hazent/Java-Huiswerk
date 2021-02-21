package Klassen;

public class FormeelBericht extends Bericht8{
    public FormeelBericht(String voornaam, String achternaam, String mv, String tekst){
        super(voornaam, achternaam, mv, tekst);
    }

    public void printBericht(){
        System.out.print("Geachte ");
        if(super.getMv().equals("man")){
            System.out.println("heer " + super.getAchternaam()+",");
        } else if(super.getMv().equals("vrouw")){
            System.out.println("mevrouw " + super.getAchternaam()+",");
        }
        System.out.println(super.getTekst());
        System.out.println("Hoogachtend,");
    }
}
