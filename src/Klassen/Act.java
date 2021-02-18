package Klassen;

import java.util.ArrayList;

public class Act {
    private String naam;
    private int tijdsduur;
    private ArrayList<Artiest> artiesten = new ArrayList<>();

    public Act(String naam, int tijdsduur){
        this.naam = naam;
        this.tijdsduur = tijdsduur;
    }

    public String toString(){
        StringBuilder a = new StringBuilder(("De act " + this.naam + " van " + tijdsduur + " minuten heeft de volgende artiesten: "));
        for(int i = 0; i < artiesten.size(); i++){
            a.append(artiesten.get(i).getNaam() + ", ");
        }
        return a.toString();
    }

    public int getTijdsduur(){
        return(this.tijdsduur);
    }

    public void voegArtiestToe(Artiest artiest){
        this.artiesten.add(artiest);
    }

    public void printAct(){
        System.out.println("De act: " + this.naam + " van " + this.tijdsduur + " minuten bevat de volgende artiesten: ");
        //System.out.println(artiesten.toString());
        for(Artiest a : artiesten){
            System.out.println(a.getNaam());
        }
    }

    public int getAantalArtiesten(){
        return artiesten.size();
    }

    public boolean wordtUitgevoerdDoor(Artiest a){
        return artiesten.contains(a);
    }
}
