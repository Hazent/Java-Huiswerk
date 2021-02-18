package Klassen;

public class Verpakking {
    private int lengte;
    private int breedte;
    private int hoogte;
    private boolean vloeistof;

    public Verpakking(int _lengte, int _breedte, int _hoogte, boolean _vloeistof){
        this.lengte = _lengte;
        this.breedte = _breedte;
        this.hoogte = _hoogte;
        this.vloeistof = _vloeistof;
    }

    public boolean equals (Verpakking obj){
        if(this.vloeistof == obj.vloeistof){
            if(this.vloeistof){
                int thisInhoud = this.lengte * this.hoogte * this.breedte;
                int objInhoud = obj.lengte * obj.hoogte * obj.breedte;
                return thisInhoud == objInhoud;
            } else {
                return (this.lengte == obj.lengte && this.breedte == obj.breedte && this.hoogte == obj.hoogte);
            }
        } else {
            return false;
        }
    }
}
