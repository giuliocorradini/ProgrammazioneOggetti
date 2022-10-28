import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOBin {
    public static void main(String args[]) {
//        esercizio1(args);
        esercizio2e3(args);
    }

    public static void esercizio1(String args[]) {
        FileInputStream fin;
        FileOutputStream fout;

        if(args.length < 2) {
            System.err.println("Devi specificare un file sorgente e un file destinazione");
            System.exit(1);
        }

        try {
            int c;

            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            while((c = fin.read()) != -1) {
                fout.write((byte)c);
            }

            fin.close();    //fa il flush in automatico
            fout.close();

        } catch (FileNotFoundException e) {
            System.err.println("Il file sorgente specificato non esiste");
            System.exit(2);

        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }

    public static void esercizio2e3(String args[]) {
        if(args.length < 1) {
            System.err.println("Devi specificare il nome del file di output");
            System.exit(3);
        }

        //Esercizio 2
        System.out.println("Inserisci numeri positivi. Si ferma con un numero negativo.");

        FileOutputStream fout;
        ObjectOutputStream out;

        Scanner s = new Scanner(System.in);

        try {
            int user_num;

            fout = new FileOutputStream(args[0]);
            out = new ObjectOutputStream(fout);

            do {
                System.out.print("Numero > ");
                user_num = s.nextInt();

                if(user_num >= 0)
                    out.writeInt(user_num);

            } while(user_num >= 0);

            out.close();

        /*} catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(4);
        } catch (InputMismatchException e) {    //unchecked exception
            System.err.println("Devi inserire solo numeri");
            System.exit(5);
        }*/
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(4);
        }


        //Esercizio 3
        FileInputStream fin;
        ObjectInputStream in;

        try {
            fin = new FileInputStream(args[0]);
            in = new ObjectInputStream(fin);

            while(in.available() > 0) {
                System.out.println(in.readInt());
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.err.println("Il file specificato deve esistere.");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(6);
        }

        s.close();
    }
}