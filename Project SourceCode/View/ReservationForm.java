package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 * The type Reservation form.
 */
public class ReservationForm extends JFrame {
    private JList movies;
    private JList showtimes;
    private JButton seatSelectionButton;
    private JButton returnToMenuButton;
    private JPanel panel;

    /**
     * Instantiates a new Reservation form.
     */
    public ReservationForm () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,300));
        pack();
        setLocationRelativeTo(null);

    }

    /**
     * Movie list.
     *
     * @param mouseListener the mouse listener
     */
    public void movieList (MouseListener mouseListener) {
        movies.addMouseListener(mouseListener);
    }

    /**
     * Show time list.
     *
     * @param mouseListener the mouse listener
     */
    public void showTimeList (MouseListener mouseListener) {
        showtimes.addMouseListener(mouseListener);
    }

    /**
     * Return to menu.
     *
     * @param actionListener the action listener
     */
    public void returnToMenu (ActionListener actionListener) {
        returnToMenuButton.addActionListener(actionListener);
    }

    /**
     * Seat selection.
     *
     * @param actionListener the action listener
     */
    public void seatSelection (ActionListener actionListener) {
        seatSelectionButton.addActionListener(actionListener);
    }

    /**
     * Gets movies.
     *
     * @return the movies
     */
    public JList getMovies() {
        return movies;
    }

    /**
     * Gets showtimes.
     *
     * @return the showtimes
     */
    public JList getShowtimes() {
        return showtimes;
    }
}
