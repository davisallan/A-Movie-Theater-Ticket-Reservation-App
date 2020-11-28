package Model;

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
	
}
