package Model;

import java.util.ArrayList;

/**
 * The type Show time.
 */
public class ShowTime {

	private int movieId;
	private String date;
	private String time;
	private ArrayList<Seat> seats;

	/**
	 * Instantiates a new Show time.
	 *
	 * @param movieId the movie id
	 * @param date    the date
	 * @param time    the time
	 */
	public ShowTime(int movieId, String date, String time) {
		setMovieId(movieId);
		setDate(date);
		setTime(time);
		seats = new ArrayList<>();
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
	 * Cancel seats.
	 *
	 * @param seats the seats
	 */
	public void cancelSeats(ArrayList<Seat> seats) {
		for (Seat seat: seats) {
			seat.setNotReserved();
		}
	}

	/**
	 * Gets seats.
	 *
	 * @return the seats
	 */
	public ArrayList<Seat> getSeats() {
		return seats;
	}

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets date.
	 *
	 * @param date the date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets time.
	 *
	 * @param time the time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * Gets movie id.
	 *
	 * @return the movie id
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * Sets movie id.
	 *
	 * @param movieId the movie id
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "Date: " + getDate() + ", Time: " + getTime();
	}
}
