package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class ReservationForm extends JFrame {
    private JList movies;
    private JList showtimes;
    private JButton seatSelectionButton;
    private JButton returnToMenuButton;
    private JPanel panel;

    public ReservationForm () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,300));
        pack();
        setLocationRelativeTo(null);

    }

    public void movieList (MouseListener mouseListener) {
        movies.addMouseListener(mouseListener);
    }

    public void showTimeList (MouseListener mouseListener) {
        showtimes.addMouseListener(mouseListener);
    }

    public void returnToMenu (ActionListener actionListener) {
        returnToMenuButton.addActionListener(actionListener);
    }

    public void seatSelection (ActionListener actionListener) {
        seatSelectionButton.addActionListener(actionListener);
    }

    public JList getMovies() {
        return movies;
    }

    public JList getShowtimes() {
        return showtimes;
    }
}
