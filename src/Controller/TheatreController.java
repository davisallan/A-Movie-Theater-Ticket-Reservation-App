package Controller;

import Model.*;

import java.sql.ResultSet;
import java.util.ArrayList;

public class TheatreController {
	
	private TCS theatreCtrlSys;
	private Movie selectedMovie;
	private ShowTime selectedShowTime;
	private ArrayList<Movie> movieList;
	private ArrayList<ShowTime> showTimeList;


	public TheatreController(TCS theatreCtrlSys) {
		setTheatreCtrlSys(theatreCtrlSys);
	}

	public void loadTheatres(ResultSet rs) {
		theatreCtrlSys.loadTheatres(rs);
	}

	public void loadMovies(ResultSet rs) {
		theatreCtrlSys.loadMovies(rs);
	}

	public void loadShowTimes(ResultSet rs) {
		theatreCtrlSys.loadShowTimes(rs);
	}

	public void loadAuditoriums(ResultSet rs) {
		theatreCtrlSys.loadAuditoriums(rs);
	}
	
	public void setSelectedMovie(Movie movie) {
		this.selectedMovie = movie;
	}
	
	public void setSelectedShowTime(ShowTime selectedShowTime) {
		this.selectedShowTime = selectedShowTime;
	}

	public Movie getSelectedMovie() {
		return selectedMovie;
	}

	public ShowTime getSelectedShowTime() {
		return selectedShowTime;
	}

	public TCS getTheatreCtrlSys() {
		return theatreCtrlSys;
	}

	public void setTheatreCtrlSys(TCS theatreCtrlSys) {
		this.theatreCtrlSys = theatreCtrlSys;
	}


}
