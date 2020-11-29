package View;

import javax.swing.*;
import java.awt.event.ActionListener;

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

    public PaymentForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subTotal.setEditable(false);
        seatsSelected.setEditable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public void returnToReservation (ActionListener actionListener) {
        returnToReservationButton.addActionListener(actionListener);
    }

    public void submitPayment (ActionListener actionListener) {
        submitPaymentButton.addActionListener(actionListener);
    }

    public void clearTextFields() {
        email.setText("");
        cardName.setText("");
        ccNum.setText("");
        expiry.setText("");
        cvc.setText("");
        subTotal.setText("");
        seatsSelected.setText("");
    }

    public JTextField getEmail() {
        return email;
    }

    public JRadioButton getCreditCardRadioButton() {
        return creditCardRadioButton;
    }

    public JRadioButton getVoucherRadioButton() {
        return voucherRadioButton;
    }

    public JTextField getCardName() {
        return cardName;
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

    public JTextField getVoucherID() {
        return voucherID;
    }

    public JTextField getSubTotal() {
        return subTotal;
    }

    public JTextField getSeatsSelected() {
        return seatsSelected;
    }
}
