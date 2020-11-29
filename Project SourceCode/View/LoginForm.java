package View;

import javax.swing.*;

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
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm login = new LoginForm();
    }
}
