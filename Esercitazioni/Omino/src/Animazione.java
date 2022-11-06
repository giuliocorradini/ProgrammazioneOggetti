import java.util.TimerTask;

public class Animazione extends TimerTask {
    private Omino o;

    public Animazione(Omino om) {
        o = om;
    }

    public void run() {
        int windowBoundary = o.getParent().getSize().width;

        int newx = o.getXoff();
        newx += 2;

        if(newx > windowBoundary)
            newx = 0;

        o.setXoff(newx);
        o.repaint();
    }
}
