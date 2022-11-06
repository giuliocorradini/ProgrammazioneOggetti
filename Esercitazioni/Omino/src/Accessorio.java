import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public enum Accessorio implements AccessorioDisegnabile {
    OCCHI {
        @Override
        public void paint(Graphics g) {
            g.drawOval(0, 0, (int)(10), (int)(10));
            g.drawOval((int)(12), 0, (int)(10), (int)(10));
        }
    },

    NASO {
        @Override
        public void paint(Graphics g) {
            final int[] nosex = {3,0,6};
            final int[] nosey = {0,8,8};
            final Polygon nose = new Polygon(nosex, nosey, 3);
            g.drawPolygon(nose);
        }
    },

    BOCCA {
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(0, 0, 20, 5);
            g.setColor(Color.BLACK);
        }
    },

    CAPPELLO {
        @Override
        public void paint(Graphics g) {
            final int[] hatx = {12,28,40,0}, haty = {0,0,10,10};
            final Polygon hat = new Polygon(hatx, haty, 4);

            Graphics2D g2 = (Graphics2D)g;

            g.setColor(Color.ORANGE);
            g2.fill(hat);
            g.setColor(Color.BLACK);
        }
    },

    OMBRELLO {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.drawImage(ombrello, null, null);
        }
    };

    private static BufferedImage ombrello;

    static {
        try {
            ombrello = ImageIO.read(new File("assets/ombrello.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
