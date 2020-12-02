package Model;

import java.util.ArrayList;

/**
 * The type Movie.
 */
public class Movie {

	private int movieID;
	private String movieName;
	private ArrayList<ShowTime> showTimes;

	/**
	 * Instantiates a new Movie.
	 *
	 * @param movieID   the movie id
	 * @param movieName the movie name
	 */
	public Movie(int movieID, String movieName) {
		setMovieID(movieID);
		setMovieName(movieName);
		showTimes = new ArrayList<>();
	}

	/**
	 * Gets movie id.
	 *
	 * @return the movie id
	 */
	public int getMovieID() {
		return movieID;
	}

	/**
	 * Sets movie id.
	 *
	 * @param movieID the movie id
	 */
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	/**
	 * Gets movie name.
	 *
	 * @return the movie name
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * Sets movie name.
	 *
	 * @param movieName the movie name
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * Add show time.
	 *
	 * @param time the time
	 */
	public void addShowTime(ShowTime time) {
		showTimes.add(time);
	}

	/**
	 * Get show time list array list.
	 *
	 * @return the array list
	 */
// get show time list for this movie
	public ArrayList<ShowTime> getShowTimeList(){
		return showTimes;
	}

	@Override
	public String toString() {
		return getMovieName();
	}
}
