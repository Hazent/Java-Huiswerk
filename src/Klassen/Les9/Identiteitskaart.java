package Klassen.Les9;

public class Identiteitskaart extends Reisdocument{
    public Identiteitskaart(String naam, String BSN){
        this.naam  = naam;
        this.BSN = BSN;
    }

    public String getGeldigeLanden(){
        return "Europa";
    }

    public String getDocumentType(){
        return "Identiteitskaart";
    }

}
