package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PaymentForm extends JFrame {
    private JTextField name;
    private JTextField ccNum;
    private JTextField expiry;
    private JTextField cvc;
    private JRadioButton creditCardRadioButton;
    private JRadioButton voucherRadioButton;
    private JTextField textField1;
    private JButton submitPaymentButton;
    private JButton returnToReservationButton;
    private JPanel panel;

    public PaymentForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public void returnToReservation (ActionListener actionListener) {
        returnToReservationButton.addActionListener(actionListener);
    }

    public void submitPayment (ActionListener actionListener) {
        submitPaymentButton.addActionListener(actionListener);
    }
}
