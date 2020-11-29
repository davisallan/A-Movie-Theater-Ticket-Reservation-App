package Controller;

import Model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TheatreController {
	
	private TCS theatreCtrlSys;
	private Theatre selectedTheatre;
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

	public void setSelectedTheatre(Theatre theatre) {
		this.selectedTheatre = theatre;
	}
	
	public void setSelectedMovie(Movie movie) {
		this.selectedMovie = movie;
	}
	
	public void setSelectedShowTime(ShowTime selectedShowTime) {
		this.selectedShowTime = selectedShowTime;
	}

	public TCS getTheatreCtrlSys() {
		return theatreCtrlSys;
	}

	public void setTheatreCtrlSys(TCS theatreCtrlSys) {
		this.theatreCtrlSys = theatreCtrlSys;
	}

	public void getTheatreInfo() {
		this.movieList = theatreCtrlSys.getMovies(selectedTheatre);
		this.showTimeList = theatreCtrlSys.getShowTimes(selectedTheatre, selectedMovie);
	}

}
