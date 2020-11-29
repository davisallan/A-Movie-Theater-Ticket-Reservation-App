package View;


import javax.swing.*;

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
}
