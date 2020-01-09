package main.klasser;

public class Terning {

    private final int MAX = 6;
    private int øjneVærdi;

    public Terning(int øjneVærdi) {
        this.øjneVærdi = øjneVærdi;
    }

    public int roll()  {
        øjneVærdi = (int) (Math.random() * MAX) + 1;
        return øjneVærdi;
    }
}
