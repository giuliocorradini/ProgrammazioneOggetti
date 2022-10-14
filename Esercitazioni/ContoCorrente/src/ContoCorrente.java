class ContoCorrente {
    private int numero_cc;
    private int saldo;
    private int[] movimenti;
    private int n_movimenti;

    private int MAX_MOVS = 2;

    public ContoCorrente(int cc, int saldo) {
        this.numero_cc = cc;
        this.saldo = saldo;

        this.movimenti = new int[MAX_MOVS];
    }

    private void relocate_array() {
        System.err.println("Relocating array for " + this.toString());

        int[] new_movimenti = new int[MAX_MOVS*2];

        for(int i=0; i<n_movimenti; i++)
            new_movimenti[i] = movimenti[i];

        movimenti = new_movimenti;
        MAX_MOVS *= 2;
    }

    public void prelievo(int importo) {
        if(importo <= 0) {
            System.out.println("L'importo deve essere positivo");
        } else {
            this.saldo -= importo;
            
            if(n_movimenti == MAX_MOVS)
                relocate_array();
            
            movimenti[n_movimenti] = -importo;
            n_movimenti++;
        }
    }

    public void versamento(int importo) {
        if(importo <= 0) {
            System.out.println("L'importo deve essere positivo");
        } else {
            this.saldo += importo;
            
            if(n_movimenti == MAX_MOVS)
                relocate_array();
            
            movimenti[n_movimenti] = importo;
            n_movimenti++;
        }
    }

    // Restituzione del saldo
    public int restituzione() {
        return saldo;
    }

    public void stampa() {
        for(int i=0; i<n_movimenti; i++) {
            System.out.println(movimenti[i]);
        }
    }
}
