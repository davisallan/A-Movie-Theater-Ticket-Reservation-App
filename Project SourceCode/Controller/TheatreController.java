package Controller;

import Model.*;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * The type Theatre controller.
 */
public class TheatreController {
	
	private TCS theatreCtrlSys;
	private Movie selectedMovie;
	private ShowTime selectedShowTime;
	private ArrayList<Movie> movieList;
	private ArrayList<ShowTime> showTimeList;


	/**
	 * Instantiates a new Theatre controller.
	 *
	 * @param theatreCtrlSys the theatre ctrl sys
	 */
	public TheatreController(TCS theatreCtrlSys) {
		setTheatreCtrlSys(theatreCtrlSys);
	}

	/**
	 * Load theatres.
	 *
	 * @param rs the rs
	 */
	public void loadTheatres(ResultSet rs) {
		theatreCtrlSys.loadTheatres(rs);
	}

	/**
	 * Load movies.
	 *
	 * @param rs the rs
	 */
	public void loadMovies(ResultSet rs) {
		theatreCtrlSys.loadMovies(rs);
	}

	/**
	 * Load show times.
	 *
	 * @param rs the rs
	 */
	public void loadShowTimes(ResultSet rs) {
		theatreCtrlSys.loadShowTimes(rs);
	}

	/**
	 * Load auditoriums.
	 *
	 * @param rs the rs
	 */
	public void loadAuditoriums(ResultSet rs) {
		theatreCtrlSys.loadAuditoriums(rs);
	}

	/**
	 * Sets selected movie.
	 *
	 * @param movie the movie
	 */
	public void setSelectedMovie(Movie movie) {
		this.selectedMovie = movie;
	}

	/**
	 * Sets selected show time.
	 *
	 * @param selectedShowTime the selected show time
	 */
	public void setSelectedShowTime(ShowTime selectedShowTime) {
		this.selectedShowTime = selectedShowTime;
	}

	/**
	 * Gets selected movie.
	 *
	 * @return the selected movie
	 */
	public Movie getSelectedMovie() {
		return selectedMovie;
	}

	/**
	 * Gets selected show time.
	 *
	 * @return the selected show time
	 */
	public ShowTime getSelectedShowTime() {
		return selectedShowTime;
	}

	/**
	 * Gets theatre ctrl sys.
	 *
	 * @return the theatre ctrl sys
	 */
	public TCS getTheatreCtrlSys() {
		return theatreCtrlSys;
	}

	/**
	 * Sets theatre ctrl sys.
	 *
	 * @param theatreCtrlSys the theatre ctrl sys
	 */
	public void setTheatreCtrlSys(TCS theatreCtrlSys) {
		this.theatreCtrlSys = theatreCtrlSys;
	}


}
