package Model;

import java.util.ArrayList;

public class Movie {

	private int movieID;
	private String movieName;
	private ArrayList<ShowTime> showTimes;
	private ArrayList<Seat> seatList;
	private ArrayList<Ticket> ticketList;
	
	public Movie(int movieID, String movieName) {
		setMovieID(movieID);
		setMovieName(movieName);
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	// get show time list for this movie
	public ArrayList<ShowTime> getShowTimeList(){
		return showTimes;
	}
	
	// add reserved ticket to movie's ticketList
	public void reserve(Ticket myTicket) {
		ticketList.add(myTicket);
	}
	
	// remove reserved ticket from movie's ticketList
	public void cancel(Ticket myTicket) {
		ticketList.remove(myTicket);
	}

	@Override
	public String toString() {
		return "\tMovieID: " + getMovieID() + "\n" +
				"\tMovieName: " + getMovieName() + "\n";
	}
}
