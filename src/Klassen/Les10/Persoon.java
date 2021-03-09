package Klassen.Les10;

public abstract class Persoon{
    private Postcode postcode;
    protected int huisnummer;
    protected String toevoeging;

    public abstract String getAan();
    public abstract String getGeachte();

    public String getAdres(){
        String bericht = postcode.getStraatnaam()+" "+huisnummer;
        if(toevoeging == null){
            bericht += " "+toevoeging;
        }
        bericht += ", "+postcode.getWoonplaats()+" "+postcode.getCode();
        return bericht;
    }
}
