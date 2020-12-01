package Model;//Model.Ticket Reservation System

import java.util.ArrayList;

public class TRS {

	private Theatre theatre;
	private ArrayList<Ticket> masterTicketList;
	private ArrayList<Cancellation> cancellationList;
	private static int ticketId = 1000;

	

	public TRS() {

	}

	// search for the provided movie in the movieList of the selected theatre and return that movie
	public Movie searchMovie(Theatre theatre, Movie movie) {
		Movie myMovie = null;
		for(Movie m: theatre.getMovieList()) {
			if(m.equals(movie)) {
				myMovie = m;
			}
		}
		return myMovie;
	}
	
	public ShowTime searchShowTime(Theatre theatre, Movie movie, ShowTime showTime) {
		ShowTime myShowTime = null;
		for(ShowTime s: movie.getShowTimeList()) {
			if(s.equals(showTime)) {
				myShowTime = s;
			}
		}
		return myShowTime;
	}
	
	public Ticket searchTicket(int ticketId) {
		Ticket myTicket = null;
		for(Ticket t: masterTicketList) {
			if(t.getTicketId() == ticketId) {
				myTicket = t;
			}
		}
		return myTicket;
	}
	
	
	// create a ticket and make the reservation for selected theatre, movie, showtime and seat
	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		Theatre myTheatre = theatre;
		Movie myMovie = searchMovie(theatre, movie);
		ShowTime myShowTime = searchShowTime(theatre, movie, showTime);
		ticketId += 1;
		int myTicketId = ticketId;
		//create mew ticket
		Ticket newTicket = new Ticket(myTicketId, myTheatre, myMovie, myShowTime, seat);
		//reserve ticket for specified movie and showtime
		myMovie.reserve(newTicket);
		//add ticket to masterTicketList (for tracking)
		masterTicketList.add(newTicket);
		//give user the ticket
		user.setTicket(newTicket);
	}
	
	// search ticket by ticketId in the master ticketList (all reservations for in the system for all theatres, movies, showtimes, seats)
	// cancel the reservation by removing that ticket from the master ticketList and the ticketList for the corresponding movie
	// TODO: add voucher creation (non registered user)
	// TODO: user should get the created voucher (non registered)
	// TODO: registered should get the refund confirmation (registerd)
	public void cancelReservation(User user, int ticketId, CreditCard cc) {
		Ticket myTicket = searchTicket(ticketId);
		Movie myMovie = myTicket.getMovie();
		myMovie.cancel(myTicket);
		masterTicketList.remove(myTicket);
		//create voucher and give to user if not registered
		Voucher newVoucher = new Voucher();
		user.setVoucher(newVoucher);
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public ArrayList<Ticket> getMasterTicketList() {
		return masterTicketList;
	}

	public void setMasterTicketList(ArrayList<Ticket> masterTicketList) {
		this.masterTicketList = masterTicketList;
	}

	public ArrayList<Cancellation> getCancellationList() {
		return cancellationList;
	}

	public void setCancellationList(ArrayList<Cancellation> cancellationList) {
		this.cancellationList = cancellationList;
	}
}
