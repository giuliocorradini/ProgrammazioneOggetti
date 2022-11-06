import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.Math;

public class Omino extends JPanel {
    private double scale = 1;
    private static final float base_unit = 350;
    private static final double head = 70;     //x & y
    private static final double body = 100;    //y
    private static final double arm = 50;      //hypotenuse
    private double arm_angle = -30 * Math.PI / 180;
    private static final double leg = 100;      //hypotenuse
    private double leg_angle = -70 * Math.PI / 180;

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D)g;
        
        Dimension parent_size = getParent().getSize();
        scale = parent_size.height / base_unit;
        g.translate((int)(parent_size.width / 2), 30);
        g2.scale(scale, scale);
        g.translate((int)(-head / 2), 0);   //perché questa va fatta dopo lo scaling?


        // Testa
        g.drawOval(0, 0, (int)(head), (int)(head));

        // Corpo
        g.drawLine(
            (int)(head / 2),
            (int)(head),
            (int)(head / 2),
            (int)((head + body))
        );

        //Braccia
        g.drawLine(
            (int)((head / 2)),
            (int)((head + 20)),
            (int)((head / 2 + arm * Math.cos(arm_angle))),
            (int)((head + 20 - arm * Math.sin(arm_angle)))
        );
        g.drawLine(
            (int)(head / 2),
            (int)((head + 20)),
            (int)((head/2 - arm * Math.cos(arm_angle))),
            (int)((head + 20 - arm * Math.sin(arm_angle)))
        );

        //Gambe
        g.drawLine(
            (int)(head / 2),
            (int)((head + body)),
            (int)((head/2 + leg * Math.cos(leg_angle))),
            (int)((head + body - leg * Math.sin(leg_angle)))
        );
        g.drawLine(
            (int)(head / 2),
            (int)((head + body)),
            (int)((head/2 - leg * Math.cos(leg_angle))),
            (int)((head + body - leg * Math.sin(leg_angle)))
        );
    }

    public double getScale() {
        return scale;
    }

    public static double getHead() {
        return head;
    }

    public static double getBody() {
        return body;
    }

    public static double getArm() {
        return arm;
    }

    public double getArm_angle() {
        return arm_angle;
    }

    public void setArm_angle(double arm_angle) {
        this.arm_angle = arm_angle;
    }

    public static double getLeg() {
        return leg;
    }

    public double getLeg_angle() {
        return leg_angle;
    }

    public void setLeg_angle(double leg_angle) {
        this.leg_angle = leg_angle;
    }
}
