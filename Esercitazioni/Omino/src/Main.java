import java.util.Timer;

import javax.swing.JFrame;

public class Main {
    private static final Boolean abilitaEstensioni = true;

    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame("Omino");

        //Window placement and size
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Add omino
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

        Timer timer = new Timer();
        Animazione anim = new Animazione(omino);
        timer.scheduleAtFixedRate(anim, 0, 1000 / 60);

        //Show window
        frame.setVisible(true);
    }
}
