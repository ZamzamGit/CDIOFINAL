package main.klasser;

public class Spiller {

    private String navn;
    private int lokation;
    private Konto konto;

    public Spiller() {
        this.lokation = 0;
        this.konto = new Konto();
    }

    public Konto getKonto() {
        return konto;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getLokation() {
        return lokation;
    }

    public void setLokation(int lokation) {
        this.lokation = lokation;
    }
}
