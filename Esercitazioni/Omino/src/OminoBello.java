import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.lang.Math;

public class OminoBello extends Omino {
    private boolean[] accessori;

    public OminoBello() {
        accessori = new boolean[Accessorio.values().length];
    }

    public void addAccessorio(Accessorio a) {
        accessori[a.ordinal()] = true;
    }

    public void removeAccessorio(Accessorio a) {
        accessori[a.ordinal()] = false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D)g;
        
        AffineTransform ombrello_rot = new AffineTransform();
        ombrello_rot.translate(20, 5);
        ombrello_rot.rotate(Math.PI * 30 / 180, 54, 113);

        for(Accessorio a: Accessorio.values()) {
            if(accessori[a.ordinal()]) {
                //Save current affine transform status
                AffineTransform t = g2.getTransform();

                switch(a) {
                    case OCCHI:
                        g.translate((int)((getHead() / 2 - 11)), (int)((getHead() / 2 - 10)));
                        break;

                    case NASO:
                        g.translate((int)((getHead() / 2 - 3)), (int)((getHead() / 2 + 4)));
                        break;

                    case BOCCA:
                        g.translate((int)(getHead() / 2 - 10), (int)(getHead() / 2 + 20));
                        break;
                        
                    case CAPPELLO:
                        g.translate((int)(getHead() / 2 - 20), (int)(getHead() / 2 - 40));
                        break;

                    case OMBRELLO:
                        g2.transform(ombrello_rot);
                }

                a.paint(g);
                g2.setTransform(t); //restore previous transform
            }
        }
    }
}