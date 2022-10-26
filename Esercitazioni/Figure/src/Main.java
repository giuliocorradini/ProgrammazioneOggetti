import java.util.Random;

import figure.*;

public class Main {
    public static void main(String args[]) {
        // Esempio elegante di polimorfismo

        Figura f[] = new Figura[2];
        Random rnd = new Random();

        for(int i=0; i < f.length; i++) {
            if( rnd.nextInt() % 2 == 0 )
                f[i] = new Quadrato(2);
            else f[i] = new Triangolo(7, 3, 2);
        }

        System.out.println(f[0]);
        
        for(int i=0; i<f.length; i++) {
            if (f[i] instanceof Quadrato)
                System.out.println("Quadrato");
            else if(f[i] instanceof Triangolo)
                System.out.println("Triangolo");
            else
                System.out.println("Sono un " + f[i].getClass().getCanonicalName());
        }
    }
}
