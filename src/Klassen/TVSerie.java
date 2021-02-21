package Klassen;

public class TVSerie extends TVProgramma{
    private String regisseur;
    private int aflevering;

    public TVSerie(String _titel, int _tijdsduur, String _zender, String _regisseur, int _aflevering){
        super(_titel, _tijdsduur, _zender);
        this.regisseur = _regisseur;
        this.aflevering = _aflevering;
    }

    public String toString(){
        return(super.toString()+", Aflevering "+aflevering+", Regisseur: "+regisseur);
    }
}
