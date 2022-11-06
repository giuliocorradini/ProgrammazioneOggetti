import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class OminoBello extends Omino {
    private boolean[] accessori;
    private BufferedImage ombrello;

    public OminoBello() {
        accessori = new boolean[Accessorio.values().length];

        try {
            ombrello = ImageIO.read(new File("assets/ombrello.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        int[] nosex = {3,0,6};
        int[] nosey = {0,8,8};
        Polygon nose = new Polygon(nosex, nosey, 3);

        int[] hatx = {12,28,40,0};
        int[] haty = {0,0,10,10};
        Polygon hat = new Polygon(hatx, haty, 4);
        
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
                        g.drawOval(0, 0, (int)(10), (int)(10));
                        g.drawOval((int)(12), 0, (int)(10), (int)(10));
                        break;

                    case NASO:
                        g.translate((int)((getHead() / 2 - 3)), (int)((getHead() / 2 + 4)));
                        g.drawPolygon(nose);
                        break;

                    case BOCCA:
                        g.translate((int)(getHead() / 2 - 10), (int)(getHead() / 2 + 20));
                        g.setColor(Color.RED);
                        g.fillOval(0, 0, 20, 5);
                        g.setColor(getForeground());
                        break;
                        
                    case CAPPELLO:
                        g.translate((int)(getHead() / 2 - 20), (int)(getHead() / 2 - 40));
                        g.setColor(Color.ORANGE);
                        g2.fill(hat);
                        g.setColor(getForeground());
                        break;

                    case OMBRELLO:
                        g2.drawImage(ombrello, ombrello_rot, null);
                        break;
                }

                g2.setTransform(t); //restore previous transform
            }
        }
    }
}