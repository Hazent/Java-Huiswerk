package Klassen.Les9;

public class Rijbewijs implements Legitimatiebewijs{
    private String naam;
    private String BSN;
    private String categorie;

    public Rijbewijs(String naam, String BSN, String categorie){
        this.naam = naam;
        this.BSN = BSN;
        this.categorie = categorie;
    }

    public String getDocumentType(){
        return "Rijbewijs";
    }

    public String getNaam(){
        return this.naam;
    }

    public String getBSN(){
        return this.BSN;
    }

    public String getCategorie() {
        return categorie;
    }
}
