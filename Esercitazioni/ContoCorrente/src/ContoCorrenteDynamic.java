import java.util.ArrayList;

public class ContoCorrenteDynamic {
    private int numero_cc;
    private int saldo;
    private int n_movimenti;
    private ArrayList<Integer> movimenti;

    public ContoCorrenteDynamic(int cc, int saldo) {
        this.numero_cc = cc;
        this.saldo = saldo;

        this.n_movimenti = 0;

        this.movimenti = new ArrayList<Integer>(10);
    }

    public void prelievo(int importo) {
        if(importo <= 0) {
            System.out.println("L'importo deve essere positivo");
        } else {
            this.saldo -= importo;
            
            movimenti.set(n_movimenti, -importo);
            n_movimenti++;
        }
    }

    public void versamento(int importo) {
        if(importo <= 0) {
            System.out.println("L'importo deve essere positivo");
        } else {
            this.saldo += importo;
            
            movimenti.set(n_movimenti, importo);
            n_movimenti++;
        }
    }

    // Restituzione del saldo
    public int restituzione() {
        return saldo;
    }

    public void stampa() {
        for(int i=0; i<n_movimenti; i++) {
            System.out.println(movimenti.get(i));
        }
    }
}
