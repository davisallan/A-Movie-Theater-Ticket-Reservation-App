package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The type Annual fee form.
 */
public class AnnualFeeForm extends JFrame {
    private JPanel panel;
    private JTextField cardName;
    private JTextField ccNum;
    private JTextField expiry;
    private JTextField cvc;
    private JButton submitPaymentButton;
    private JTextField subTotal;
    private JTextField email;

    /**
     * Instantiates a new Annual fee form.
     */
    public AnnualFeeForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subTotal.setEditable(false);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Submit annual fee payment.
     *
     * @param actionListener the action listener
     */
    public void submitAnnualFeePayment (ActionListener actionListener) {
        submitPaymentButton.addActionListener(actionListener);
    }

    /**
     * Clear all text fields.
     */
    public void clearAllTextFields() {
        cardName.setText("");
        ccNum.setText("");
        expiry.setText("");
        cvc.setText("");
        subTotal.setText("");
        email.setText("");
    }

    /**
     * Gets card name.
     *
     * @return the card name
     */
    public JTextField getCardName() {
        return cardName;
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

    /**
     * Gets sub total.
     *
     * @return the sub total
     */
    public JTextField getSubTotal() {
        return subTotal;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public JTextField getEmail() {
        return email;
    }
}
