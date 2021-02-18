package Klassen;

public class Student extends Persoon{
    private int studentnr;

    public Student(String _naam, int _lengte, int _studentnr){
        super(_naam, _lengte);
        this.studentnr = _studentnr;
    }

    public int getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
    }

    public String toString(){
        return(this.getNaam() + " " + this.studentnr);
    }
}
