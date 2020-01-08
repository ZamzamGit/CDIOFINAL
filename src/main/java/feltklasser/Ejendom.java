package feltklasser;
import klasser.Spiller;

public class Ejendom extends Felt {

    private int værdi;
    private Spiller ejer;

    public Ejendom(String navn, int værdi) {
        super(navn);
        this.værdi = værdi;
        this.ejer = null;
    }

    public int getVærdi() {
        return værdi;
    }

    public Spiller getEjer() {
        return ejer;
    }

    public void setEjer(Spiller ejer) {
        this.ejer = ejer;
    }

    public boolean isEjet() {
        return false;
    }

}
