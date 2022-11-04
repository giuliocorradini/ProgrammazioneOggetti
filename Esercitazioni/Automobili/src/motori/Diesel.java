package motori;

public class Diesel extends Motore {
    public Diesel(int cilindrata, int cilindri) {
        super(cilindrata, cilindri);
    }

    public Boolean isDiesel() {
        return true;
    }

    public int maxRPM() {
        return 5000 + (int)(0.1 * getCilindrata());
    }
}
