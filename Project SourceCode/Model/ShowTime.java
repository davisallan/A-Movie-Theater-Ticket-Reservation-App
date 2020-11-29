package Model;

public class ShowTime {

	private int movieId;
	private String date;
	private String time;

	public ShowTime(int movieId, String date, String time) {
		setMovieId(movieId);
		setDate(date);
		setTime(time);
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
}
