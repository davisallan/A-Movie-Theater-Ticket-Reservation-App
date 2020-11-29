package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField firstName;
    private JTextField lastName;
    private JTextField email;
    private JTextField password;
    private JButton registerButton;
    private JTextField ccNum;
    private JTextField expiry;
    private JTextField cvc;
    private JPanel panel;

    public RegistrationForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
//        setVisible(true);
    }

    public void registerButton (ActionListener actionListener) {
        getRegisterButton().addActionListener(actionListener);
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getPassword() {
        return password;
    }

    public JTextField getCcNum() {
        return ccNum;
    }

    public JTextField getExpiry() {
        return expiry;
    }

    public JTextField getCvc() {
        return cvc;
    }
}
