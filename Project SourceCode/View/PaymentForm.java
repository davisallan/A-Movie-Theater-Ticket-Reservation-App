package View;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The type Payment form.
 */
public class PaymentForm extends JFrame {
    private JTextField cardName;
    private JTextField ccNum;
    private JTextField expiry;
    private JTextField cvc;
    private JRadioButton creditCardRadioButton;
    private JRadioButton voucherRadioButton;
    private JTextField voucherID;
    private JButton submitPaymentButton;
    private JButton returnToReservationButton;
    private JPanel panel;
    private JTextField subTotal;
    private JTextField seatsSelected;
    private JTextField email;

    /**
     * Instantiates a new Payment form.
     */
    public PaymentForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subTotal.setEditable(false);
        seatsSelected.setEditable(false);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Return to reservation.
     *
     * @param actionListener the action listener
     */
    public void returnToReservation (ActionListener actionListener) {
        returnToReservationButton.addActionListener(actionListener);
    }

    /**
     * Submit payment.
     *
     * @param actionListener the action listener
     */
    public void submitPayment (ActionListener actionListener) {
        submitPaymentButton.addActionListener(actionListener);
    }

    /**
     * Clear text fields.
     */
    public void clearTextFields() {
        email.setText("");
        cardName.setText("");
        ccNum.setText("");
        expiry.setText("");
        cvc.setText("");
        subTotal.setText("");
        seatsSelected.setText("");
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
     * Gets credit card radio button.
     *
     * @return the credit card radio button
     */
    public JRadioButton getCreditCardRadioButton() {
        return creditCardRadioButton;
    }

    /**
     * Gets voucher radio button.
     *
     * @return the voucher radio button
     */
    public JRadioButton getVoucherRadioButton() {
        return voucherRadioButton;
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
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public JTextField getVoucherID() {
        return voucherID;
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
     * Gets seats selected.
     *
     * @return the seats selected
     */
    public JTextField getSeatsSelected() {
        return seatsSelected;
    }
}
