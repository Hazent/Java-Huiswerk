package Klassen;

public class InformeelBericht extends Bericht8{
    public InformeelBericht(String voornaam, String achternaam, String mv, String tekst){
        super(voornaam, achternaam, mv, tekst);
    }

    public void printBericht(){
        System.out.println("Hey " + super.getVoornaam()+",");
        System.out.println(super.getTekst());
        System.out.println("Later!");
    }
}
