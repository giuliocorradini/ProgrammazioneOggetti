import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame("Omino");

        JPanel omino = new Omino();
        frame.add(omino);

        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
