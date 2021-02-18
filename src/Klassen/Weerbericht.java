package Klassen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Weerbericht {
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking;
    private boolean neerslag;
    private boolean zon;
    private LocalDate datum;
    private DateTimeFormatter datumFormat;

    public Weerbericht(double temp, int windkracht, String windrichting, boolean _bewolking, boolean _neerslag, boolean _zon){
        this.temperatuur = temp;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        setBewolking(_bewolking);
        setNeerslag(_neerslag);
        setZon(_zon);
        datum = LocalDate.now();
        datumFormat = DateTimeFormatter.ofPattern("eeee");
    }

    public Weerbericht(double temp, int windkracht, String windrichting){
        this(temp, windkracht, windrichting, false, false, true);
    }

    public String toString(){
        String bericht = "Weerbericht " + this.getDagVanDeWeek() + " - temperatuur: " + this.temperatuur + ", wind: " + this.windkracht + " " + this.windrichting;
        if(this.neerslag){
            bericht += ", neerslag";
        }
        if(this.bewolking){
            bericht += ", bewolking";
        }
        if(this.zon){
            bericht += ", zon";
        }

        return bericht;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }

    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }

    public void setBewolking(boolean bewolking) {
        if(!bewolking) {
            this.zon = true;
            this.bewolking = false;
            this.neerslag = false;
        } else {
            this.bewolking = true;
        }
    }

    public void setNeerslag(boolean neerslag) {
        if(neerslag){
            this.bewolking = true;
            this.neerslag = true;
        } else {
            this.neerslag = false;
        }
    }

    public void setZon(boolean zon) {
        if(zon){
            this.zon = true;
            this.bewolking = false;
            this.neerslag = false;
        } else {
            this.zon = false;
            this.bewolking = true;
        }
    }

    public double getTemperatuur() {
        return temperatuur;
    }

    public int getWindkracht() {
        return windkracht;
    }

    public String getWindrichting() {
        return windrichting;
    }

    public String getDagVanDeWeek(){
        return datum.format(datumFormat);
    }

    public void verhoogDag(){
        datum = datum.plusDays(1);
    }

    public void verhoogDag(int aantal){
        datum = datum.plusDays(aantal);
    }
}
