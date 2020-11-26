import java.util.ArrayList;

public class TheatreController {
	
	private TCS tcs;
	
	private Theatre selectedTheatre;
	private Movie selectedMovie;
	private ShowTime selectedShowTime;
	private ArrayList<Movie> movieList;
	private ArrayList<ShowTime> showTimeList;
	private ArrayList<Seat> freeSeatList;
	
	public void setSelectedTheatre(Theatre theatre) {
		this.selectedTheatre = theatre;
	}
	
	public void setSelectedMovie(Movie movie) {
		this.selectedMovie = movie;
	}
	
	public void setSelectedShowTime(ShowTime selectedShowTime) {
		this.selectedShowTime = selectedShowTime;
	}
	
	public void getTheatreInfo() {
		this.movieList = tcs.getMovies(selectedTheatre);
		this.showTimeList = tcs.getShowTimes(selectedTheatre, selectedMovie);
		this.freeSeatList = tcs.getFreeSeats(selectedTheatre, selectedMovie, selectedShowTime);
	}

}
