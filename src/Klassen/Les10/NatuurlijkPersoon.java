package Klassen.Les10;

public class NatuurlijkPersoon extends Persoon{
    private String achternaam;
    private String tussenvoegsel;
    private String voornaam;
    private String voorletters;
    private char geslacht;

    @Override
    public String getAan() {
        String mv = Character.toString(geslacht);
        String bericht = "";
        if(mv.equals("M")){
            bericht += "Aan: meneer "+voorletters+" ";
        } else {
            bericht += "Aan: mevrouw "+voorletters+" ";
        }
        if(tussenvoegsel != null){
            bericht += tussenvoegsel+" ";
        }
        bericht += achternaam;
        return bericht;
    }

    @Override
    public String getGeachte() {
        String mv = Character.toString(geslacht);
        String bericht = "";
        if(mv.equals("M")){
            bericht += "Geachte meneer "+voorletters+" ";
        } else {
            bericht += "Geachte mevrouw "+voorletters+" ";
        }
        if(tussenvoegsel != null){
            bericht += tussenvoegsel+" ";
        }
        bericht += achternaam;
        return bericht;
    }
}
