package Klassen;
import java.time.LocalDateTime;

public class Bericht {
    private Gebruiker afzender;
    private String bericht;
    private LocalDateTime datum;

    public Bericht(Gebruiker _afzender, String _bericht){
        this.afzender = _afzender;
        this.bericht = _bericht;
        this.datum = LocalDateTime.now();
    }

    public String toString(){
        return(this.afzender.toString() + " (" + this.datum + "): " + this.bericht);
    }

    public Gebruiker getAfzender() {
        return afzender;
    }

    public void setAfzender(Gebruiker afzender) {
        this.afzender = afzender;
    }

    public String getBericht() {
        return bericht;
    }

    public void setBericht(String bericht) {
        this.bericht = bericht;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }
}
