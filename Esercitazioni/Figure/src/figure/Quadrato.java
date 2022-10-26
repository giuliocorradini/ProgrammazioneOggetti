package figure;

public class Quadrato extends Rettangolo {
    public Quadrato(double lato) {
        super(lato, lato);
    }

    public double getLato() {
        return getBase();
    }
}
