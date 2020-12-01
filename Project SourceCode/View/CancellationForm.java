package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CancellationForm extends JFrame {
    private JTextField textField1;
    private JButton cancelTicketButton;
    private JButton returnToMenuButton;
    private JPanel panel;

    public CancellationForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public void returnToMenu(ActionListener actionListener) {
        returnToMenuButton.addActionListener(actionListener);
    }

    public void cancelTicket (ActionListener actionListener) {
        cancelTicketButton.addActionListener(actionListener);
    }

    public JTextField getTextField1() {
        return textField1;
    }
}
