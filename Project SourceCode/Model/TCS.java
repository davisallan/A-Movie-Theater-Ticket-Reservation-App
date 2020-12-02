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

/**
 * The type Tcs.
 */
public class TCS {

	private Theatre theatre;

	/**
	 * Instantiates a new Tcs.
	 */
	public TCS() {

	}

	/**
	 * Load theatres.
	 *
	 * @param rs the rs
	 */
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

	/**
	 * Load movies.
	 *
	 * @param rs the rs
	 */
	public void loadMovies(ResultSet rs) {
		theatre.loadMovies(rs);
	}

	/**
	 * Load show times.
	 *
	 * @param rs the rs
	 */
	public void loadShowTimes(ResultSet rs) {
		theatre.loadShowTimes(rs);
	}

	/**
	 * Load auditoriums.
	 *
	 * @param rs the rs
	 */
	public void loadAuditoriums(ResultSet rs) {
		theatre.loadAuditoriums(rs);
	}

	/**
	 * Get movies array list.
	 *
	 * @return the array list
	 */
	public ArrayList<Movie> getMovies(){
		return theatre.getMovieList();
	}

	/**
	 * Gets theatre.
	 *
	 * @return the theatre
	 */
	public Theatre getTheatre() {
		return theatre;
	}

	/**
	 * Sets theatre.
	 *
	 * @param theatre the theatre
	 */
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
