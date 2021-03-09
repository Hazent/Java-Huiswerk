package Klassen.Les9;

public abstract class Reisdocument implements Legitimatiebewijs{
    protected String naam;
    protected String BSN;

    abstract String getGeldigeLanden();

    public String toString(){
        return super.toString() + "type: " + getDocumentType() + " geldig in " + getGeldigeLanden();
    }

    public String getNaam(){
        return this.naam;
    }

    public String getBSN(){
        return this.BSN;
    }
}
