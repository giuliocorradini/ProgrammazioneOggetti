import java.awt.event.*;

public class Controller implements ActionListener {
    MainWindow w;

    public Controller(MainWindow w) {
        this.w = w;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get inputs
        String user_in = w.getUserInput();
        String match = w.getMatchInput();
        String sub = w.getSubstituionInput();

        // Perform substituion
        String mod = user_in.replace(match, sub);

        // Update textfield
        w.setModifiedInput(mod);
    }
}
