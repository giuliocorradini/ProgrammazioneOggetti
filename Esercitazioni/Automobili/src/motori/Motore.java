package motori;

public abstract class Motore {
    private int cilindrata;
    private int cilindri;

    public Motore(int cilindrata, int cilindri) {
        this.cilindrata = cilindrata;
        this.cilindri = cilindri;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getCilindri() {
        return cilindri;
    }

    public int getPotenza() {
        return cilindrata * cilindri;
    }

    public abstract Boolean isDiesel();

    public abstract int maxRPM();
}