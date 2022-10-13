public class Libri {
    public static void main(String args[]) {
        Libro l1 = new Libro("Kernel Hacking 101", "Francesco Mecatti", 12, 200, "Manuali");

        l1.prestito();

        System.out.println("Chieso in prestito, rimanenti: " + l1.getCopie());
        System.out.println(l1.getCodice());
    }
}
