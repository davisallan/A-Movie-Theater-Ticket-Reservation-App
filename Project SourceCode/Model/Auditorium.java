package Model;

import java.util.ArrayList;

/**
 * The type Auditorium.
 */
public class Auditorium {

    private String auditoriumName;
    private int moviePlayingID;
    private ArrayList<Seat> seats;

    /**
     * Instantiates a new Auditorium.
     *
     * @param auditoriumName the auditorium name
     * @param moviePlayingID the movie playing id
     */
    public Auditorium(String auditoriumName, int moviePlayingID) {
        setAuditoriumName(auditoriumName);
        setMoviePlayingID(moviePlayingID);
        seats = new ArrayList<>(50);
        createSeats();
    }

    /**
     * Create seats.
     */
    public void createSeats() {
        //creating auditorium to have 50 seats
        for (int i = 1; i < 51; i++) {
            seats.add(new Seat(i));
        }
    }

    /**
     * Gets auditorium name.
     *
     * @return the auditorium name
     */
    public String getAuditoriumName() {
        return auditoriumName;
    }

    /**
     * Sets auditorium name.
     *
     * @param auditoriumName the auditorium name
     */
    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    /**
     * Gets movie playing id.
     *
     * @return the movie playing id
     */
    public int getMoviePlayingID() {
        return moviePlayingID;
    }

    /**
     * Sets movie playing id.
     *
     * @param moviePlayingID the movie playing id
     */
    public void setMoviePlayingID(int moviePlayingID) {
        this.moviePlayingID = moviePlayingID;
    }

    @Override
    public String toString() {
        return "Auditorium #" + getAuditoriumName() + ", Playing MovieID: " + getMoviePlayingID();
    }
}
