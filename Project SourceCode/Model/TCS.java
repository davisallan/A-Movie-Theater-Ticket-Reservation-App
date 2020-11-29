package Model;

import Controller.TheatreController;

import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * Model.Theatre control system
 * queries theatres, movies, showtimes and seats
 * used by reservation GUI to display theatres, movies, showtimes and seats
 */

//TODO add theatreID to the movie table so that diff theatres have diff movies - update queries and then build the movie/auditorium lists

public class TCS {

	private TheatreList theatreList;

	public TCS(TheatreList theatreList) {
		setTheatreList(theatreList);
	}

	public void loadTheatres(ResultSet rs) {
		theatreList.loadTheatres(rs);
	}

	public void loadMovies(ResultSet rs) {
		theatreList.loadMovies(rs);
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
		ArrayList<Seat> seatList = null;
		ArrayList<Movie>  movieList = selectedTheatre.getMovieList();
		return seatList;
	}

	public TheatreList getTheatreList() {
		return theatreList;
	}

	public void setTheatreList(TheatreList theatreList) {
		this.theatreList = theatreList;
	}
}
