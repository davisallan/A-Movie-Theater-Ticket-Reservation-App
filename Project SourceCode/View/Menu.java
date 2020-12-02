package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * The type Menu.
 */
public class Menu extends JFrame {
    private JButton makeReservationButton;
    private JPanel panel1;
    private JButton cancelReservationButton;
    private JButton logoutButton;

    /**
     * Instantiates a new Menu.
     */
    public Menu () {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250,250));
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Reservation button.
     *
     * @param actionListener the action listener
     */
    public void reservationButton (ActionListener actionListener) {
        makeReservationButton.addActionListener(actionListener);
    }

    /**
     * Cancel reservation.
     *
     * @param actionListener the action listener
     */
    public void cancelReservation (ActionListener actionListener) {
        cancelReservationButton.addActionListener(actionListener);
    }

    /**
     * Logout button.
     *
     * @param actionListener the action listener
     */
    public void logoutButton (ActionListener actionListener) {
        logoutButton.addActionListener(actionListener);
    }

    /**
     * Gets make reservation button.
     *
     * @return the make reservation button
     */
    public JButton getMakeReservationButton() {
        return makeReservationButton;
    }

    /**
     * Gets cancel reservation button.
     *
     * @return the cancel reservation button
     */
    public JButton getCancelReservationButton() {
        return cancelReservationButton;
    }

    /**
     * Gets logout button.
     *
     * @return the logout button
     */
    public JButton getLogoutButton() {
        return logoutButton;
    }
}
