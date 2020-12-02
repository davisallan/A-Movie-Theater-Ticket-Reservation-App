package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The type Cancellation form.
 */
public class CancellationForm extends JFrame {
    private JTextField textField1;
    private JButton cancelTicketButton;
    private JButton returnToMenuButton;
    private JPanel panel;

    /**
     * Instantiates a new Cancellation form.
     */
    public CancellationForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Return to menu.
     *
     * @param actionListener the action listener
     */
    public void returnToMenu(ActionListener actionListener) {
        returnToMenuButton.addActionListener(actionListener);
    }

    /**
     * Cancel ticket.
     *
     * @param actionListener the action listener
     */
    public void cancelTicket (ActionListener actionListener) {
        cancelTicketButton.addActionListener(actionListener);
    }

    /**
     * Gets text field 1.
     *
     * @return the text field 1
     */
    public JTextField getTextField1() {
        return textField1;
    }
}
