package Klassen;
import java.util.ArrayList;

public class TVGids {
    private String naam;
    private ArrayList<TVProgramma> programmas;

    public TVGids(String _naam){
        this.naam = _naam;
    }

    public String toString(){
        StringBuilder bericht = new StringBuilder();
        bericht.append("======TV Gids ").append(naam).append("======");
        for(TVProgramma programma : programmas){
            bericht.append(programma.toString());
        }
        return bericht.toString();
    }

    public void voegProgrammaToe(TVProgramma _programma){
        programmas.add(_programma);
    }
}
