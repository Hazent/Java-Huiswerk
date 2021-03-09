package Klassen.Les9;

public class Persoon {
    private String naam;
    private Rijbewijs rijbewijs;
    private Reisdocument reisdocument;

    public Persoon(Rijbewijs rijbewijs){
        this.naam = rijbewijs.getNaam();
        this.rijbewijs = rijbewijs;
    }

    public Persoon(Reisdocument reisdocument){
        this.naam = reisdocument.getNaam();
        this.reisdocument = reisdocument;
    }

    public Legitimatiebewijs getLegitimatie(){
        if(rijbewijs != null){
            return rijbewijs;
        } else {
            if(reisdocument != null){
                return reisdocument;
            } else {
                return null;
            }
        }
    }

    public void toonOverzicht(){

    }

    public void setRijbewijs(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public void setReisdocument(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
    }

    public String toString(){
        String bericht = "Persoon{naam="+this.naam+", rijbewijs=";
        if(rijbewijs != null){
            bericht += "Rijbewijs{naam="+rijbewijs.getNaam()+", BSN="+rijbewijs.getBSN()+", categorie="+rijbewijs.getCategorie()+"}, ";
        } else {
            bericht += "null, ";
        }
        bericht += "reisdocument=";
        if(reisdocument != null){
            bericht += "Reisdocument{naam="+reisdocument.getNaam()+", BSN="+reisdocument.getBSN()+"}type: "+reisdocument.getDocumentType()+", geldig in "+reisdocument.getGeldigeLanden()+"}";
        } else {
            bericht += "null}";
        }
        return bericht;
    }
}
