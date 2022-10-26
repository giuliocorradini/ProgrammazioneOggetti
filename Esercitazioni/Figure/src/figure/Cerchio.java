package figure;

public class Cerchio extends Figura {
    private double raggio;

    public Cerchio(double r) {
        raggio = r;
        aggiornaProps();
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    protected double calcolaArea() {
        return Math.pow(raggio, 2) * Math.PI;
    }

    @Override
    protected double calcolaPerimetro() {
        return raggio * 2 * Math.PI;
    }
}
