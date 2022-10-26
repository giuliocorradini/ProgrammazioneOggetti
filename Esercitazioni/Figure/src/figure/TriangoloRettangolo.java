package figure;

public class TriangoloRettangolo extends Rettangolo {
    private double ipotenusa;

    public TriangoloRettangolo(double base, double altezza) {
        super(base, altezza);
        calcolaIpotenusa();
    }

    private void calcolaIpotenusa() {
        ipotenusa = Math.sqrt(
            Math.pow(getBase(), 2) +
            Math.pow(getAltezza(), 2)
        );
    }

    public double getIpotenusa() {
        return ipotenusa;
    }

    @Override
    protected double calcolaArea() {
        return super.calcolaArea() / 2;
    }


    @Override
    protected double calcolaPerimetro() {
        return getBase() + getAltezza() + getIpotenusa();
    }
}
