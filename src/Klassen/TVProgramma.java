package Klassen;

public class TVProgramma {
    private String titel;
    private int tijdsduur;
    private String zender;

    public TVProgramma(String _titel, int _tijdsduur, String _zender){
        this.titel = _titel;
        this.tijdsduur = _tijdsduur;
        this.zender = _zender;
    }

    public String toString(){
        return ("Titel: "+titel+", Tijdsduur: "+tijdsduur+", Zender: "+zender);
    }
}
