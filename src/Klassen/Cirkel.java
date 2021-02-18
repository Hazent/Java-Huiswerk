package Klassen;

public class Cirkel {
    private double straal;

    public Cirkel(double _straal){
        this.straal = _straal;
    }

    public double berekenOmtrek(){
        return 2 * this.straal * Math.PI;
    }

    public double berekenOppervlakte(){
        return Math.PI * Math.pow(this.straal, 2);
    }
}
