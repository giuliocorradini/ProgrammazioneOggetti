import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.Math;

public class Omino extends JPanel {
    private double scale = 1;
    private static final float base_unit = 400;
    private static final double head = 70;     //x & y
    private static final double body = 100;    //y
    private static final double arm = 50;      //hypotenuse
    private static final double arm_angle = -30 * Math.PI / 180;
    private static final double leg = 100;      //hypotenuse
    private static final double leg_angle = -70 * Math.PI / 180;

    public void paint(Graphics g) {
        super.paint(g);

        Dimension parent_size = getParent().getSize();
        scale = parent_size.width / base_unit;

        g.translate((int)(parent_size.width / 2 - scale * head / 2), 30);

        // Testa
        g.drawOval(0, 0, (int)(scale * head), (int)(scale * head));

        // Corpo
        g.drawLine(
            (int)(scale * head / 2),
            (int)(scale * head),
            (int)(scale * head / 2),
            (int)(scale * (head + body))
        );

        //Braccia
        g.drawLine(
            (int)(scale * (head / 2)),
            (int)(scale * (head + 20)),
            (int)(scale * (head / 2 + arm * Math.cos(arm_angle))),
            (int)(scale * (head + 20 - arm * Math.sin(arm_angle)))
        );
        g.drawLine(
            (int)(scale * head / 2),
            (int)(scale * (head + 20)),
            (int)(scale * (head/2 - arm * Math.cos(arm_angle))),
            (int)(scale * (head + 20 - arm * Math.sin(arm_angle)))
        );

        //Gambe
        g.drawLine(
            (int)(scale * head / 2),
            (int)(scale * (head + body)),
            (int)(scale * (head/2 + leg * Math.cos(leg_angle))),
            (int)(scale * (head + body - leg * Math.sin(leg_angle)))
        );
        g.drawLine(
            (int)(scale * head / 2),
            (int)(scale * (head + body)),
            (int)(scale * (head/2 - leg * Math.cos(leg_angle))),
            (int)(scale * (head + body - leg * Math.sin(leg_angle)))
        );
    }
}
