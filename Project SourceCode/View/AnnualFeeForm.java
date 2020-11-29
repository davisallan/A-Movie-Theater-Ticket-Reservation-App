package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AnnualFeeForm extends JFrame {
    private JPanel panel;
    private JTextField cardName;
    private JTextField ccNum;
    private JTextField expiry;
    private JTextField cvc;
    private JButton submitPaymentButton;
    private JTextField subTotal;
    private JTextField email;

    public AnnualFeeForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subTotal.setEditable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public void submitAnnualFeePayment (ActionListener actionListener) {
        submitPaymentButton.addActionListener(actionListener);
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

    public JTextField getSubTotal() {
        return subTotal;
    }

    public JTextField getEmail() {
        return email;
    }
}
