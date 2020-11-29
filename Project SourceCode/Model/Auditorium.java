package Model;

public class Auditorium {

    private String auditoriumName;
    private int moviePlayingID;

    public Auditorium(String auditoriumName, int moviePlayingID) {
        setAuditoriumName(auditoriumName);
        setMoviePlayingID(moviePlayingID);
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
