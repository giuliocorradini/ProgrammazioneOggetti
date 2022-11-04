package auto;

public abstract class Optional {
    private String codice;
    private String descrizione;
    private int valore;

    public Optional(String codice, String descrizione, int valore) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.valore = valore;
    }
}
