package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField email;
    private JButton loginButton;
    private JButton continueAsGuestButton;
    private JButton signUpButton;
    private JPasswordField password;
    private JPanel panel;
    private JTextField errorMsg;

    public LoginForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        errorMsg.setEditable(false);
//        setVisible(true);
    }

    public void signUpButton(ActionListener actionListener) {
        signUpButton.addActionListener(actionListener);
    }

    public void loginButton(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public void continueAsGuestButton(ActionListener actionListener) {
        continueAsGuestButton.addActionListener(actionListener);
    }

    public JTextField getEmail() {
        return email;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JTextField getErrorMsg() {
        return errorMsg;
    }
}
