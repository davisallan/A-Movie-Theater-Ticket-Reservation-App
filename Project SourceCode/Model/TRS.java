package Model;//Model.Ticket Reservation System

import java.util.ArrayList;

public class TRS {

	private Theatre theatre;
	private MasterTicketList masterTicketList;
	private ArrayList<Cancellation> cancellationList;
	private static int ticketId = 1000;


	public TRS(MasterTicketList masterTicketList) {
		setMasterTicketList(masterTicketList);
		cancellationList = new ArrayList<>();
	}

	
	// create a ticket and make the reservation for selected theatre, movie, showtime and seat
	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, ArrayList<Seat> seats) {

		ticketId += 1;
		int myTicketId = ticketId;
		//create mew ticket
		Ticket newTicket = new Ticket(myTicketId, user, theatre, movie, showTime, seats);
		//reserve ticket for specified movie and showtime

		//add ticket to masterTicketList (for tracking)
		masterTicketList.getTicketList().add(newTicket);
		System.out.println("Added ticket " + newTicket);
		//give user the ticket
		user.setTicket(newTicket);
	}
	
	// search ticket by ticketId in the master ticketList (all reservations for in the system for all theatres, movies, showtimes, seats)
	// cancel the reservation by removing that ticket from the master ticketList and the ticketList for the corresponding movie
	// TODO: add voucher creation (non registered user)
	// TODO: user should get the created voucher (non registered)
	// TODO: registered should get the refund confirmation (registerd)
	public void cancelReservation(User user, int ticketId, CreditCard cc) {
//		Ticket myTicket = searchTicket(ticketId);
//		Movie myMovie = myTicket.getMovie();
//		myMovie.cancel(myTicket);
//		masterTicketList.remove(myTicket);
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

	public MasterTicketList getMasterTicketList() {
		return masterTicketList;
	}

	public void setMasterTicketList(MasterTicketList masterTicketList) {
		this.masterTicketList = masterTicketList;
	}

	public ArrayList<Cancellation> getCancellationList() {
		return cancellationList;
	}

	public void setCancellationList(ArrayList<Cancellation> cancellationList) {
		this.cancellationList = cancellationList;
	}
}
