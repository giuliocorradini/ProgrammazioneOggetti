import java.util.TimerTask;

public class Animazione extends TimerTask {
    private Omino o;
    private int leg_direction;

    public Animazione(Omino om) {
        o = om;
        leg_direction = 1;
    }

    public void run() {
        // Position
        int windowBoundary = o.getParent().getSize().width;

        int newx = o.getXoff();
        newx += 2;

        if(newx > windowBoundary)
            newx = 0;
        o.setXoff(newx);

        //Legs
        double leg_angle = o.getLeg_angle();
        leg_angle += Radians.fromDegs(0.2) * leg_direction;

        if(leg_angle < Radians.fromDegs(-70)) {
            leg_direction = 1;
            leg_angle = Radians.fromDegs(-70);
        } else if(leg_angle > Radians.fromDegs(-55)) {
            leg_direction = -1;
            leg_angle = Radians.fromDegs(-55);
        }
        o.setLeg_angle(leg_angle);

        o.repaint();
    }
}
