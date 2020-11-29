package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JButton loginButton;
    private JButton continueAsGuestButton;
    private JButton signUpButton;
    private JPasswordField passwordField1;
    private JPanel panel;

    public LoginForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
//        setVisible(true);
    }

    public void signUpButton(ActionListener actionListener) {
        signUpButton.addActionListener(actionListener);
    }

    public void loginButton (ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public void continueAsGuestButton (ActionListener actionListener) {
        continueAsGuestButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        LoginForm login = new LoginForm();
    }
}
