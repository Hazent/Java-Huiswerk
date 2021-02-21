package Klassen;

public abstract class Bericht8 {
    private String voornaam;
    private String achternaam;
    private String mv;
    private String tekst;

    public Bericht8(String voornaam, String achternaam, String mv, String tekst){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.mv = mv;
        this.tekst = tekst;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getMv() {
        return mv;
    }

    public void setMv(String mv) {
        this.mv = mv;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public abstract void printBericht();
}
