import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    private static final Boolean abilitaEstensioni = true;

    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame("Omino");

        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Omino omino;
        if (abilitaEstensioni) {
            OminoBello ominobello = new OminoBello();
            ominobello.addAccessorio(Accessorio.OCCHI);
            ominobello.addAccessorio(Accessorio.NASO);
            ominobello.addAccessorio(Accessorio.BOCCA);
            ominobello.addAccessorio(Accessorio.CAPPELLO);
            ominobello.addAccessorio(Accessorio.OMBRELLO);

            omino = ominobello;
        } else {
            omino = new Omino();
        }


        frame.add(omino);

        frame.setVisible(true);
    }
}
