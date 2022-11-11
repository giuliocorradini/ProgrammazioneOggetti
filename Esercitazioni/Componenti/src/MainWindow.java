import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    Controller c;

    JTextField user_input;
    JTextField match_input;
    JTextField substitution_input;
    JTextField modified_input;
    JButton substitution_btn;

    public MainWindow() {
        c = new Controller(this);

        JPanel pan = new JPanel();

        pan.setLayout(new BorderLayout());
        
        //Row 1
        JPanel row1 = new JPanel();
        user_input = new JTextField(25);
        row1.add(user_input);
        pan.add(row1, BorderLayout.NORTH);

        //Row 2
        JPanel row2 = new JPanel();
        match_input = new JTextField(1);
        substitution_input = new JTextField(1);

        row2.add(new JLabel("Vecchio carattere"));
        row2.add(match_input);
        row2.add(new JLabel("Nuovo carattere"));
        row2.add(substitution_input);

        pan.add(row2, BorderLayout.CENTER);

        //Row 3
        JPanel row3 = new JPanel();
        row3.setLayout(new BorderLayout());

        modified_input = new JTextField(25);
        modified_input.setEditable(false);
        row3.add(modified_input, BorderLayout.NORTH);
        
        substitution_btn = new JButton("sostituisci");
        substitution_btn.addActionListener(c);
        row3.add(substitution_btn, BorderLayout.CENTER);

        pan.add(row3, BorderLayout.SOUTH);

        this.add(pan);
    }

    public static void main(String args[]) {
        MainWindow frame = new MainWindow();

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String getUserInput() {
        return user_input.getText();
    }

    public String getMatchInput() {
        return match_input.getText();
    }

    public String getSubstituionInput() {
        return substitution_input.getText();
    }

    public void setModifiedInput(String s) {
        modified_input.setText(s);
    }
}