package figure;

public class Rettangolo extends Figura {
    private double base;
    private double altezza;

    public Rettangolo(double b, double h) {
        base = b;
        altezza = h;

        aggiornaProps();
    }

    @Override
    protected double calcolaArea() {
        return base * altezza;
    }

    @Override
    protected double calcolaPerimetro() {
        return (base + altezza) * 2;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }
}