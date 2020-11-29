package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Theatre {

	private int theatreID;
	private String theatreName;
	private String address;
	private ArrayList<Movie> movieList;
	private ArrayList<Auditorium> auditoriums;
	
	
	public Theatre(int theatreID, String name, String address) {
		setTheatreID(theatreID);
		setTheatreName(name);
		setAddress(address);
		movieList = new ArrayList<>();
		auditoriums = new ArrayList<>();
	}

	public void loadMovies(ResultSet rs) {
		try {
			while (rs.next()) {
				addMovie(new Movie (
						rs.getInt("MovieID"),
						rs.getString("Mov_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void display() {
		System.out.println(this);
		System.out.println("Movies playing here: ");
		for (Movie movie: movieList) {
			System.out.println(movie);
		}
	}

	public void addMovie (Movie movie) {
		movieList.add(movie);
	}

	public int getTheatreID() {
		return theatreID;
	}

	public void setTheatreID(int theatreID) {
		this.theatreID = theatreID;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Auditorium> getAuditoriums() {
		return auditoriums;
	}

	// get movie list for this theatre
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}

	@Override
	public String toString() {
		return "TheatreID: " + getTheatreID() + "\n" +
				"Theatre Name: " + getTheatreName() + "\n" +
				"Address: " + getAddress() + "\n";
	}
}
