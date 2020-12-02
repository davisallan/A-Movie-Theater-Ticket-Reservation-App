package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The type Registration form.
 */
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

    /**
     * Instantiates a new Registration form.
     */
    public RegistrationForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Register button.
     *
     * @param actionListener the action listener
     */
    public void registerButton (ActionListener actionListener) {
        getRegisterButton().addActionListener(actionListener);
    }

    /**
     * Clear all fields.
     */
    public void clearAllFields() {
        firstName.setText("");
        lastName.setText("");
        email.setText("");
        password.setText("");
        ccNum.setText("");
        expiry.setText("");
        cvc.setText("");
    }

    /**
     * Gets register button.
     *
     * @return the register button
     */
    public JButton getRegisterButton() {
        return registerButton;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public JTextField getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public JTextField getLastName() {
        return lastName;
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
    public JTextField getPassword() {
        return password;
    }

    /**
     * Gets cc num.
     *
     * @return the cc num
     */
    public JTextField getCcNum() {
        return ccNum;
    }

    /**
     * Gets expiry.
     *
     * @return the expiry
     */
    public JTextField getExpiry() {
        return expiry;
    }

    /**
     * Gets cvc.
     *
     * @return the cvc
     */
    public JTextField getCvc() {
        return cvc;
    }
}
