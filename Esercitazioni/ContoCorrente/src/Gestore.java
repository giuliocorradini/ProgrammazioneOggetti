class Gestore {
    public static void main(String[] args) {
        ContoCorrente[] conti = new ContoCorrente[3];

        conti[0] = new ContoCorrente(445738, 2000);
        conti[1] = new ContoCorrente(9998, 34);
        conti[2] = new ContoCorrente(100029, 0);

        conti[0].prelievo(100);
        conti[0].prelievo(150);
        
        conti[0].stampa();

        conti[0].versamento(200);
        conti[0].prelievo(10);

        conti[0].prelievo(-50);

        conti[0].stampa();

        System.out.println("Saldo del conto all'indice 0: " + conti[0].restituzione());


        conti[2].versamento(100);
        System.out.println("Saldo del conto all'indice 2: " + conti[2].restituzione());
    }
}