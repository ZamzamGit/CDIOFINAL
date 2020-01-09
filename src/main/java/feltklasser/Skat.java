package feltklasser;

public class Skat extends Felt {
private int værdi;
    public Skat(String navn, int værdi) {
        super(navn);
        this.værdi=værdi;
    }

    public int getVærdi(){
        return værdi;
    }
}
