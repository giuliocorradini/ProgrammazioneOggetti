package figure;

public abstract class Figura {
    private double perimetro;
    private double area;

    protected void setPerimetro(double p) {
        if (p >= 0) {
            perimetro = p;
        }
    }

    protected void setArea(double a) {
        if (a >= 0) {
            area = a;
        }
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    protected abstract double calcolaArea();
    protected abstract double calcolaPerimetro();

    protected void aggiornaProps() {
        setPerimetro(calcolaArea());
        setPerimetro(calcolaPerimetro());
    }

    public String toString() {
        return "Figura con area: " + area + " e perimetro: " + perimetro;
    }
}
