package figure;

public class Triangolo extends Figura {
    private double a;
    private double b;
    private double c;

    public Triangolo(double a, double b, double c) {
        super();

        this.a = a;
        this.b = b;
        this.c = c;

        aggiornaProps();
    }

    protected double calcolaArea() {
        return a + b + c;
    }

    protected double calcolaPerimetro() {
        return Math.sqrt(
            (getPerimetro() / 2 - a) *
            (getPerimetro() / 2 - b) *
            (getPerimetro() / 2 - c) *
            (getPerimetro() / 2)
        );
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
