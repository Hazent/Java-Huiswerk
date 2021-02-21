package Klassen;

public class TalkShow extends TVProgramma{
    private String presentator;
    private String onderwerp;

    public TalkShow(String _titel, int _tijdsduur, String _zender, String _presentator, String _onderwerp){
        super(_titel, _tijdsduur, _zender);
        this.presentator = _presentator;
        this.onderwerp = _onderwerp;
    }

    public String toString(){
        return (super.toString()+", Presentator: "+presentator+", Onderwerp: "+onderwerp);
    }
}
