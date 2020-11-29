package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton makeReservationButton;
    private JPanel panel1;
    private JButton cancelReservationButton;
    private JButton logoutButton;

    public Menu () {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public void reservationButton (ActionListener actionListener) {
        makeReservationButton.addActionListener(actionListener);
    }

    public void cancelReservation (ActionListener actionListener) {
        cancelReservationButton.addActionListener(actionListener);
    }

    public void logoutButton (ActionListener actionListener) {
        logoutButton.addActionListener(actionListener);
    }

    public JButton getMakeReservationButton() {
        return makeReservationButton;
    }

    public JButton getCancelReservationButton() {
        return cancelReservationButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }
}
