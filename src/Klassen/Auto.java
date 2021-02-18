package Klassen;

public class Auto {
    private String merk;
    private String type;
    private int pk;
    private boolean opgevoerd;
    private boolean isFoutief;
    private int maxOpvoerPks;
    private Fabriek fabriek;
    private String fabriekName;
    private Aanhanger aanhanger;
    private int serienummer;
    static int teller = 1;

    public Auto(String merk, String type, int pk) {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.opgevoerd = false;
        this.maxOpvoerPks = this.berekenOpvoerMogelijkheid();
        this.serienummer = teller;
        teller++;
    }

    public Auto(String merk, String type, int pk, Fabriek fabriek) {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.opgevoerd = false;
        this.maxOpvoerPks = this.berekenOpvoerMogelijkheid();
        this.serienummer = teller;
        this.fabriek = fabriek;
        this.fabriekName = fabriek.getFabriekName();
        teller++;
    }

    public String verschilPk (Auto auto) {
        int verschil = this.pk - auto.pk;
        String bericht = "";

        if(verschil > 0){
            bericht = ("De " + this.merk + " heeft meer vermogen dan de " + auto.merk + ", het vershil is " + verschil + " pk");
        } else if (verschil < 0){
            verschil *= -1;
            bericht = ("De " + auto.merk + " heeft meer vermogen dan de " + this.merk + ", het vershil is " + verschil + " pk");
        } else {
            bericht = "Beiden autos hebben dezelfde PK";
        }
        return bericht;
    }

    public String toString() {
        if(!opgevoerd) {
            return (merk + " " + type + " (" + pk + "pk, maximaal op te voeren met " + this.berekenOpvoerMogelijkheid() + ") uit de fabriek: " + fabriekName);
        } else {
            return (merk + " " + type + " (" + pk + "pk, is al opgevoerd)");
        }
    }

    public void setMerk (String m){
        merk = m;
    }

    public String getMerk () {
        return merk;
    }

    public void setType (String t){
        type = t;
    }

    public String getType () {
        return type;
    }

    public void setPk (int p){
        pk = p;
    }

    public int getPk () {
        return pk;
    }

    public boolean isOpgevoerd() {
        return opgevoerd;
    }

    public Fabriek getFabriek() {
        return fabriek;
    }

    public void setFabriek(Fabriek fabriek) {
        if(this.fabriek == null) {
            this.fabriek = fabriek;
            this.fabriekName = fabriek.getFabriekName();
        } else {
            System.out.println("Deze auto heeft al een fabriek");
        }
    }

    public Aanhanger getAanhanger() {
        return aanhanger;
    }

    public void setAanhanger(Aanhanger aanhanger) {
        this.aanhanger = aanhanger;
    }

    public int getSerienummer(){
        return serienummer;
    }

    public void voerOp(int extraPk){
        if(!opgevoerd) {
            int max = this.berekenOpvoerMogelijkheid();
            System.out.println(merk + " opvoeren met " + extraPk + " pk");
            if (extraPk > max) {
                System.out.println(extraPk + " is te veel, maximaal " + max);
            } else {
                pk += extraPk;
                System.out.println("Resultaat: " + this.toString());
            }
        } else {
            System.out.println("Deze auto is al een keer opgevoerd");
        }
    }

    public int berekenOpvoerMogelijkheid(){
        if(!opgevoerd) {
            int opvoer = pk - 20;
            return opvoer;
        } else {
            return 0;
        }
    }

    public void registreerProductieFout(){
        if(!isFoutief){
            this.fabriek.productieFout++;
            Fabriek.totaalProductieFout++;
            this.isFoutief = true;
            System.out.println(this.merk + " " + this.type + " is geregistreerd als foutief");
        } else {
            System.out.println("Deze auto is al geregistreerd als foutief");
        }
    }
}
