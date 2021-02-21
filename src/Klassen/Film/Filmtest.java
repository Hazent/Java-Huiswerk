package Klassen.Film;

public class Filmtest {

    public static void main(String[] args) {

        Film film = new Film("Een korte ontmoeting", 2);

        Rol mevrouwDeKort = new Rol("Mevrouw de Kort", "vriendelijke mevrouw");
        Rol meneerVanLoon = new Rol("Meneer van Loon", "vriendelijke meneer");
        Rol conducteur = new Rol("Conducteur", "norse conducteur");

        Acteur dWinterland = new Acteur("Dagmar Winterland","24 mei 1996","vrouw", mevrouwDeKort, 600, 30);
        Acteur hDrissi = new Acteur("Haroen Drissi","12 februari 1994","man", meneerVanLoon, 500, 35);
        Acteur hGerards = new Acteur("Hubert Gerards","30 juli 1987","man", conducteur, 550, 32);

        film.voegPersoonToe(dWinterland);
        film.voegPersoonToe(hDrissi);
        film.voegPersoonToe(hGerards);

        Scenario scenario = new Scenario();

        Scene scene1 = new Scene("Op het perron", 3);
        scene1.voegActieToe(mevrouwDeKort, "Pardon, U staat op mijn tas");
        scene1.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scenario.voegSceneToe(scene1);

        Scene scene2 = new Scene("In de trein", 4);
        scene2.voegActieToe(conducteur, "Goedemorgen, vervoersbewijzen alstublieft");
        scene2.voegActieToe(meneerVanLoon, "Goedemorgen", "laat ov-kaart zien");
        scene2.voegActieToe(mevrouwDeKort, "Moment alstublieft", "zoekt haar tas");
        scene2.voegActieToe(conducteur, "Vervoersbewijs altublieft", "wordt ongeduldig");
        scene2.voegActieToe(meneerVanLoon, "Wat bent u ongeduldig");
        scene2.voegActieToe(mevrouwDeKort, "Ik ben mijn tas kwijt conducteur");
        scene2.voegActieToe(mevrouwDeKort, "Pardon meneer, U zit op mijn tas", "kijkt naar meneer van Loon");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scene2.voegActieToe(mevrouwDeKort, "Alstublieft", "haalt kaart tevoorschijn");
        scene2.voegActieToe(conducteur, "Dank u, prettige reis");
        scene2.voegActieToe(mevrouwDeKort, "Wat heeft u toch met mijn tas meneer?");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien, ik ben mijn bril vergeten", "lacht");
        scenario.voegSceneToe(scene2);

        film.setScenario(scenario);

        Medewerker m1 = new Medewerker("Vincent Hazekamp", "13 januari 2001", "man", "Regisseur", 250);
        film.voegPersoonToe(m1);

        System.out.println(film);

        System.out.println("======================");

        System.out.println(film.berekenTotaalKosten());
    }
}
