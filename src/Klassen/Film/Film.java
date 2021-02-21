package Klassen.Film;

import java.util.ArrayList;

public class Film {

    private String titel;
    private Scenario scenario;
    private ArrayList<Persoon> personen;
    private int draaidagen;

    public Film(String titel, int draaidagen) {
        this.titel = titel;
        personen = new ArrayList<>();
        this.draaidagen = draaidagen;
    }

    public void voegPersoonToe(Persoon acteur) {
        this.personen.add(acteur);
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public String toString(){
        StringBuilder bericht = new StringBuilder();
        bericht.append("Film ").append(titel).append(" heeft de volgende mensen\n");
        for(Persoon persoon : personen){
            bericht.append(persoon.getNaam()).append(" - ").append(persoon.getClass().getSimpleName());
            if(persoon instanceof Medewerker){
                bericht.append(" Functie: ").append(((Medewerker) persoon).getFunctie());
            }
            bericht.append("\n");
        }
        return bericht.toString();
    }

    public int berekenTotaalKosten(){
        int kosten = 0;
        for(Persoon persoon : personen){
            kosten += persoon.berekenBeloning(this.draaidagen);
        }
        return kosten;
    }
}
