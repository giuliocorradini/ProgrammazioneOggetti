import java.io.*;

public class IOSer {
    public static void main(String args[]) {
        if(args.length < 1) {
            System.err.println("Inserisci il percorso del file in cui serializzare gli oggeti");
            System.exit(-1);
        }

        //esercizio2(args);
        esercizio3(args);
    }

    public static void esercizio2(String args[]) {
        //Lavoro in binario
        FileInputStream fin;
        FileOutputStream fout;

        //Classe filtro
        ObjectInputStream in;
        ObjectOutputStream out;

        //Permesso di serializzare un oggetto: Serializable
        MyClass m1, m2, m3;
        m1 = new MyClass(12);
        m2 = new MyClass(8);
        m3 = new MyClass(-3);

        //Serialize
        try {
            fout = new FileOutputStream(args[0]);
            out = new ObjectOutputStream(fout);

            out.writeObject(m1);
            out.writeObject(m2);
            out.writeObject(m3);

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Serialized!");
        m1 = null;
        m2 = null;
        m3 = null;

        //Deserialize
        try {
            fin = new FileInputStream(args[0]);
            in = new ObjectInputStream(fin);

            m1 = (MyClass)in.readObject();
            m2 = (MyClass)in.readObject();
            m3 = (MyClass)in.readObject();

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Non trovo la definizione per questa classe");
            System.exit(2);
        }

        System.out.println("" + m1 + ", " + m2 + ", " + m3);
    }

    public static void esercizio3(String args[]) {
        //Lavoro in binario
        FileInputStream fin;
        FileOutputStream fout;

        //Classe filtro
        ObjectInputStream in;
        ObjectOutputStream out;

        //Permesso di serializzare un oggetto: Serializable
        MyClass[] ms = new MyClass[5];
        for(int i=0; i<5; i++)
            ms[i] = new MyClass(2*i);

        //Serialize
        try {
            fout = new FileOutputStream(args[0]);
            out = new ObjectOutputStream(fout);

            out.writeObject(ms);

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Serialized!");
        out = null;

        //Deserialize
        try {
            fin = new FileInputStream(args[0]);
            in = new ObjectInputStream(fin);

            ms = (MyClass[])in.readObject();

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Non trovo la definizione per questa classe");
            System.exit(2);
        }

        for(int i=0; i<ms.length; i++) {
            System.out.println(ms[i]);
        }
    }
}