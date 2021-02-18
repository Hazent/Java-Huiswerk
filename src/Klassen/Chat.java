package Klassen;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Chat {
    private String naam;
    ArrayList<Bericht> berichten = new ArrayList<Bericht>();

    public Chat(String _naam){
        this.naam = _naam;
    }

    public void voegtoe(Bericht _bericht){
        this.berichten.add(_bericht);
    }

    public void printChat(){
        System.out.println("Chat "+this.naam+": ");
        if(berichten.size() > 0) {
            for (Bericht bericht : berichten) {
                System.out.println(bericht.toString());
            }
        } else {
            System.out.println("Deze chat heeft nog geen berichten");
        }
    }

    public void printBerichtenSinds(LocalDateTime datum){
        LocalDateTime moment1 = datum;
        for (Bericht bericht : berichten) {
            LocalDateTime moment2 = bericht.getDatum();
            if (moment2.isAfter(moment1)) {
                System.out.println(bericht);
            }
        }
    }

    public void printBerichtenVan(Gebruiker _gebruiker){
        for (Bericht bericht : berichten) {
            if (bericht.getAfzender() == _gebruiker) {
                System.out.println(bericht);
            }
        }
    }

    public ArrayList<Bericht> zoekBerichtenVan(Gebruiker _gebruiker){
        ArrayList<Bericht> output = new ArrayList<Bericht>();
        for (Bericht bericht : berichten) {
            if (bericht.getAfzender() == _gebruiker) {
                output.add(bericht);
            }
        }
        return output;
    }

    public ArrayList<Bericht> zoekBerichten(String _tekst){
        ArrayList<Bericht> output = new ArrayList<Bericht>();
        for (Bericht bericht : berichten) {
            if (bericht.getBericht().equals(_tekst)) {
                output.add(bericht);
            }
        }
        return output;
    }

    public ArrayList<Bericht> zoekBerichtenVan(ArrayList<Gebruiker> _gebruikers){
        ArrayList<Bericht> output = new ArrayList<Bericht>();
        for(Bericht bericht : berichten){
            for(Gebruiker gebruiker : _gebruikers){
                if(bericht.getAfzender() == gebruiker){
                    output.add(bericht);
                }
            }
        }
        return output;
    }
}
