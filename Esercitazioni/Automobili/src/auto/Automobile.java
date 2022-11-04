package auto;

import motori.*;
import java.util.List;

public abstract class Automobile {
    private String targa;
    private String marca;
    private String modello;
    private Motore motore;
    private List<Optional> optional;

    public Automobile(String targa, String marca, String modello, Motore motore, List<Optional> opt) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.motore = motore;
        this.optional =
    }
}
