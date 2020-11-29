package Model;

import java.util.ArrayList;

public class Auditorium {

    private String auditoriumName;
    private int moviePlayingID;
    private ArrayList<Seat> seats;

    public Auditorium(String auditoriumName, int moviePlayingID) {
        setAuditoriumName(auditoriumName);
        setMoviePlayingID(moviePlayingID);
        seats = new ArrayList<>(50);
        createSeats();
    }

    public void createSeats() {
        //creating auditorium to have 50 seats
        for (int i = 0; i < 50; i++) {
            seats.add(new Seat(i));
        }
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public int getMoviePlayingID() {
        return moviePlayingID;
    }

    public void setMoviePlayingID(int moviePlayingID) {
        this.moviePlayingID = moviePlayingID;
    }

    @Override
    public String toString() {
        return "Auditorium #" + getAuditoriumName() + ", Playing MovieID: " + getMoviePlayingID();
    }
}
