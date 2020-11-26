package Model;

import java.util.ArrayList;

public class Movie {

	private int auditorium;
	private String movieName;
	private ArrayList<ShowTime> showTimes;
	private ArrayList<Seat> seatList;
	private ArrayList<Ticket> ticketList;
	
	public Movie(String movieName, int auditorium) {
		this.auditorium = auditorium;
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
	

	
}
