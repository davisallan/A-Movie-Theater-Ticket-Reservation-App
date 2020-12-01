package Model;

import java.util.ArrayList;

public class ShowTime {

	private int movieId;
	private String date;
	private String time;
	private ArrayList<Seat> seats;

	public ShowTime(int movieId, String date, String time) {
		setMovieId(movieId);
		setDate(date);
		setTime(time);
		seats = new ArrayList<>();
		createSeats();
	}

	public void createSeats() {
		//creating auditorium to have 50 seats
		for (int i = 1; i < 51; i++) {
			seats.add(new Seat(i));
		}
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "Date: " + getDate() + ", Time: " + getTime();
	}
}
