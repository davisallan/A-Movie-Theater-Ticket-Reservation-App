package Model;

import java.util.ArrayList;

public class Movie {

	private int movieID;
	private String movieName;
	private ArrayList<ShowTime> showTimes;
	
	public Movie(int movieID, String movieName) {
		setMovieID(movieID);
		setMovieName(movieName);
		showTimes = new ArrayList<>();
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void addShowTime(ShowTime time) {
		showTimes.add(time);
	}
	// get show time list for this movie
	public ArrayList<ShowTime> getShowTimeList(){
		return showTimes;
	}

	@Override
	public String toString() {
		return getMovieName();
	}
}
