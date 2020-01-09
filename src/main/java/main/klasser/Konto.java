package main.klasser;

public class Konto {

    private int beløb;

    public Konto() {
        this.beløb = 1500;
    }
    public int getBeløb() {
        return beløb;
    }
    public void indsæt(int indsætBeløb) {
        beløb += indsætBeløb;
    }
    public void træk(int trækBeløb) {
        beløb -= trækBeløb;
    }
    public void setBeløb(int beløb) {
        this.beløb = beløb;
    }
}
