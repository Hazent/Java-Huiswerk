package Klassen;
import java.util.ArrayList;

public class Circus {
    private String naam;
    private Artiest artiesten[] = new Artiest[3];
    private ArrayList<Act> act = new ArrayList<Act>();

    public Circus(String naam){
        this.naam = naam;
        Artiest a1 = new Artiest("Bassie");
        Artiest a2 = new Artiest("Leo de Leeuwentemmer");
        Artiest a3 = new Artiest("Adriaan de Acrobaat");

        artiesten[0] = a1;
        artiesten[1] = a2;
        artiesten[2] = a3;
    }

    public void printArtiesten(){
        int i = 1;
        System.out.println("Circus " + this.naam + " heeft de volgende artiesten:");
        for(Artiest artiest : artiesten){
            String value = artiest.getNaam();

            System.out.println(" * artiest nr. " + i + " = " + value + " (een artiest)" );
            i++;
        }
    }

    public int getAantalArtiesten(){
        return artiesten.length;
    }

    public void setArtiest(int positie, Artiest artiest){
        if(positie <= artiesten.length && positie > 0) {
            this.artiesten[positie - 1] = artiest;
        } else {
            System.out.println("Er is maar plek voor 3 artiesten in dit Circus");
        }
    }

    public void voegActToe(Act act){
        this.act.add(act);
    }

    public void printActOverzicht(){
        System.out.println("Circus " + this.naam + " heeft de volgende acts: ");
        for(Act a : act){
            a.printAct();
        }
    }

    public Act zoekLangsteAct(){
        Act af = new Act("a", 0);
        for(Act a : act){
            if(af.getTijdsduur() < a.getTijdsduur()){
                af = a;
            }
        }
        if(af.getTijdsduur() == 0){
            return null;
        } else {
            return af;
        }
    }

    public ArrayList<Act> zoekActsMetAantalArtiesten(int aantal){
        ArrayList<Act> n = new ArrayList<Act>();
        for(int i = 0; i < this.act.size(); i++){
            Act m = act.get(i);
            if(m.getAantalArtiesten() == aantal){
              n.add(m);
            }
        }
        return n;
    }
}
