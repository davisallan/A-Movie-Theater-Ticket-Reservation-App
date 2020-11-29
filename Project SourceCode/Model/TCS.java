package Model;

import Controller.TheatreController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Model.Theatre control system
 * queries theatres, movies, showtimes and seats
 * used by reservation GUI to display theatres, movies, showtimes and seats
 */

public class TCS {

	private Theatre theatre;

	public TCS() {

	}

	public void loadTheatres(ResultSet rs) {
		try {
			while (rs.next()) {
				setTheatre(new Theatre(rs.getInt("TheatreID"),
						rs.getString("Theatre_name"),
						rs.getString("Address")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void loadMovies(ResultSet rs) {
		theatre.loadMovies(rs);
	}

	public void loadShowTimes(ResultSet rs) {
		theatre.loadShowTimes(rs);
	}

	public void loadAuditoriums(ResultSet rs) {
		theatre.loadAuditoriums(rs);
	}

	public ArrayList<Movie> getMovies(){
		return theatre.getMovieList();
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

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
