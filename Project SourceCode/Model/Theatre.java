package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The type Theatre.
 */
public class Theatre {

	private int theatreID;
	private String theatreName;
	private String address;
	private ArrayList<Movie> movieList;
	private ArrayList<Auditorium> auditoriumList;


	/**
	 * Instantiates a new Theatre.
	 *
	 * @param theatreID the theatre id
	 * @param name      the name
	 * @param address   the address
	 */
	public Theatre(int theatreID, String name, String address) {
		setTheatreID(theatreID);
		setTheatreName(name);
		setAddress(address);
		movieList = new ArrayList<>();
		auditoriumList = new ArrayList<>();
	}

	/**
	 * Load movies.
	 *
	 * @param rs the rs
	 */
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

	/**
	 * Load show times.
	 *
	 * @param rs the rs
	 */
	public void loadShowTimes(ResultSet rs) {
		try {
			while (rs.next()) {
				int movieID = rs.getInt("MovieID");
				for (Movie movie: getMovieList()) {
					if (movieID == movie.getMovieID()) {
						movie.addShowTime(new ShowTime (
								rs.getInt("MovieID"),
								rs.getString("ShowDate"),
								rs.getString("ShowTime")));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load auditoriums.
	 *
	 * @param rs the rs
	 */
	public void loadAuditoriums(ResultSet rs) {
		try {
			while (rs.next()) {
				addAuditorium(new Auditorium(
						rs.getString("Auditorium_name"),
						rs.getInt("MovieID")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Add auditorium.
	 *
	 * @param auditorium the auditorium
	 */
	public void addAuditorium (Auditorium auditorium) {
		auditoriumList.add(auditorium);
	}

	/**
	 * Add movie.
	 *
	 * @param movie the movie
	 */
	public void addMovie (Movie movie) {
		movieList.add(movie);
	}

	/**
	 * Gets theatre id.
	 *
	 * @return the theatre id
	 */
	public int getTheatreID() {
		return theatreID;
	}

	/**
	 * Sets theatre id.
	 *
	 * @param theatreID the theatre id
	 */
	public void setTheatreID(int theatreID) {
		this.theatreID = theatreID;
	}

	/**
	 * Gets theatre name.
	 *
	 * @return the theatre name
	 */
	public String getTheatreName() {
		return theatreName;
	}

	/**
	 * Sets theatre name.
	 *
	 * @param theatreName the theatre name
	 */
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	/**
	 * Gets address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets auditorium list.
	 *
	 * @return the auditorium list
	 */
	public ArrayList<Auditorium> getAuditoriumList() {
		return auditoriumList;
	}

	/**
	 * Get movie list array list.
	 *
	 * @return the array list
	 */
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
