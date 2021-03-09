package Klassen.Les9;

public class Paspoort extends Reisdocument{
    public Paspoort(String naam, String BSN){
        this.naam = naam;
        this.BSN = BSN;
    }

    public String getGeldigeLanden(){
        return "de hele wereld";
    }

    public String getDocumentType(){
        return "Paspoort";
    }
}
