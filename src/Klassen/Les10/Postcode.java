package Klassen.Les10;
import java.util.ArrayList;

public class Postcode {
    private static ArrayList<Postcode> lijst = new ArrayList<Postcode>();
    private String code;
    private String woonplaats;
    private String straatnaam;

    public Postcode(String pc, String wp, String sn){
        this.code = pc;
        this.woonplaats = wp;
        this.straatnaam = sn;
    }

    public static void createPostcode(String pc, String wp, String sn){
        Postcode lpc = Postcode.findPostcode(pc);
        if(lpc == null){
            lijst.add(new Postcode(pc, wp, sn));
        } else {
            lpc.setWoonplaats(wp);
            lpc.setStraatnaam(sn);
        }
    }

    public static Postcode findPostcode(String pc){
        for(Postcode postcode : lijst){
            if(postcode.getCode().equals(pc)){return postcode;}
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }
}
