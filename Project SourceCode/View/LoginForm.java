package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The type Login form.
 */
public class LoginForm extends JFrame {
    private JTextField email;
    private JButton loginButton;
    private JButton continueAsGuestButton;
    private JButton signUpButton;
    private JPasswordField password;
    private JPanel panel;
    private JTextField errorMsg;

    /**
     * Instantiates a new Login form.
     */
    public LoginForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        errorMsg.setEditable(false);
//        setVisible(true);
    }

    /**
     * Sign up button.
     *
     * @param actionListener the action listener
     */
    public void signUpButton(ActionListener actionListener) {
        signUpButton.addActionListener(actionListener);
    }

    /**
     * Login button.
     *
     * @param actionListener the action listener
     */
    public void loginButton(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    /**
     * Continue as guest button.
     *
     * @param actionListener the action listener
     */
    public void continueAsGuestButton(ActionListener actionListener) {
        continueAsGuestButton.addActionListener(actionListener);
    }

    /**
     * Clear all fields.
     */
    public void clearAllFields() {
        email.setText("");
        password.setText("");
        errorMsg.setText("");
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public JTextField getEmail() {
        return email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public JPasswordField getPassword() {
        return password;
    }

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public JTextField getErrorMsg() {
        return errorMsg;
    }
}
