package Week3.Les6;
import Klassen.*;

import java.util.ArrayList;

public class Opdracht6 {
    public static void main(String[] args) {
        ArrayList<String> lijst1 = new ArrayList<String>();
        ArrayList<String> andereLijst = new ArrayList<String>();

        lijst1.add("bla");
        andereLijst.add("bla");

        if(lijst1.equals(andereLijst)){
            System.out.println("De lijsten zijn gelijk");
        } else {
            System.out.println("De lijsten zijn verschillend");
        }

        System.out.println("//////////////////////////////////////");

        ArrayList<Artiest> artiest1 = new ArrayList<Artiest>();
        ArrayList<Artiest> artiest2 = new ArrayList<Artiest>();

        Artiest artiest = new Artiest("Adriaan de Acrobaat");
        artiest1.add(artiest);

        Artiest artiest3 = new Artiest("Adriaan de Acrobaat");
        artiest2.add(artiest3);

        if(artiest1.equals(artiest2)){
            System.out.println("De lijsten zijn gelijk");
        } else {
            System.out.println("De lijsten zijn verschillend");
        }
    }
}
