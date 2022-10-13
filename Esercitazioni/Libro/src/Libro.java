public class Libro {
    private String titolo;
    private String autore;
    private int copieTot;
    private int copie;
    private int pagine;
    private String genere;
    private String codice;
    
    Libro(String titolo, String autore, int copie, int numeroPagine, String genere) {
        this.titolo = titolo;
        this.autore = autore;

        this.copie = copie;
        this.copieTot = copie;
        
        this.pagine = numeroPagine;

        this.genere = genere;

        this.codice = this.genere.substring(0, 1)
                    + this.pagine
                    + this.autore.substring(0, 2)
                    + this.titolo.substring(0, 5);
    }

    public void prestito() {
        if(copie <= 0)
            System.out.println("Errore!");

        else
            copie--;
    }

    public void restituzione() {
        if(copie < copieTot)
            copie++;

        else
            System.out.println("Errore!");
    }

    public int getCopie() {
        return copie;
    }

    public int getCopieTot() {
        return copieTot;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getPagine() {
        return pagine;
    }

    public String getGenere() {
        return genere;
    }

    public String getCodice() {
        return codice;
    }
}