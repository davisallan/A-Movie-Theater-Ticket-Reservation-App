package Model;//Model.Ticket Reservation System

import java.util.ArrayList;

public class TRS {

	private Theatre theatre;
	private MasterTicketList masterTicketList;
	private CancellationList cancellationList;
	private static int ticketId = 1000;


	public TRS(MasterTicketList masterTicketList, CancellationList cancellationList) {
		setMasterTicketList(masterTicketList);
		setCancellationList(cancellationList);
	}


	// create a ticket and make the reservation for selected theatre, movie, showtime and seat
	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, ArrayList<Seat> seats, double amount) {
		ticketId += 1;
		int myTicketId = ticketId;
		//create mew ticket
		Ticket newTicket = new Ticket(myTicketId, user, theatre, movie, showTime, seats, amount);
		//add ticket to masterTicketList (for tracking)
		masterTicketList.getTicketList().add(newTicket);
		//give user the ticket
		user.setTicket(newTicket);
	}

	// search ticket by ticketId in the master ticketList (all reservations for in the system for all theatres, movies, showtimes, seats)
	// cancel the reservation by removing that ticket from the master ticketList and the ticketList for the corresponding movie
	public boolean cancelReservation(int ticketId) {
		Ticket ticketToCancel = masterTicketList.searchTicket(ticketId);
		if (ticketToCancel == null) {
			return false;
		}
		masterTicketList.removeTicket(ticketToCancel);
		return true;
	}

	public void addCancellation(Cancellation cancellation) {
		cancellationList.addCancellation(cancellation);
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

	public CancellationList getCancellationList() {
		return cancellationList;
	}

	public void setCancellationList(CancellationList cancellationList) {
		this.cancellationList = cancellationList;
	}
}
