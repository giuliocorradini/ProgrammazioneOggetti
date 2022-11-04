package motori;

public class Benzina extends Motore {
    public Benzina(int cilindrata, int cilindri) {
        super(cilindrata, cilindri);
    }

    public Boolean isDiesel() {
        return false;
    }

    public int maxRPM() {
        return 7000 + (int)(0.1 * getCilindrata());
    }
}
