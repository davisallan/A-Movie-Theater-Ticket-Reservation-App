package Model;

import Controller.TheatreController;

import java.util.ArrayList;

/*
 * Model.Theatre control system
 * queries theatres, movies, showtimes and seats
 * used by reservation GUI to display theatres, movies, showtimes and seats
 */


public class TCS {

	private Theatre theatre;

	public TCS(Theatre theatre) {
		setTheatre(theatre);
	}

	public ArrayList<Movie> getMovies(Theatre selectedTheatre){
		ArrayList<Movie> movieList = selectedTheatre.getMovieList();
		return movieList;
	}
	
	public ArrayList<ShowTime> getShowTimes(Theatre selectedTheatre, Movie selectedMovie){	
		ArrayList<ShowTime> showTimeList=null;
		ArrayList<Movie>  movieList = selectedTheatre.getMovieList();
		for(Movie m: movieList) {
			if(selectedMovie.equals(m)) {
				showTimeList = m.getShowTimeList();
			}
		}
		return showTimeList;
	}
	
	public ArrayList<Seat> getFreeSeats(Theatre selectedTheatre, Movie selectedMovie, ShowTime selectedShowTime){
		ArrayList<Seat> seatList=null;
		ArrayList<Movie>  movieList = selectedTheatre.getMovieList();
		return seatList;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
