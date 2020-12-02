package Model;//Model.Ticket Reservation System

import java.util.ArrayList;

/**
 * The type Trs.
 */
public class TRS {

	private Theatre theatre;
	private MasterTicketList masterTicketList;
	private CancellationList cancellationList;
	private static int ticketId = 1000;


	/**
	 * Instantiates a new Trs.
	 *
	 * @param masterTicketList the master ticket list
	 * @param cancellationList the cancellation list
	 */
	public TRS(MasterTicketList masterTicketList, CancellationList cancellationList) {
		setMasterTicketList(masterTicketList);
		setCancellationList(cancellationList);
	}


	/**
	 * Reserve.
	 *
	 * @param user     the user
	 * @param theatre  the theatre
	 * @param movie    the movie
	 * @param showTime the show time
	 * @param seats    the seats
	 * @param amount   the amount
	 */
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

	/**
	 * Cancel reservation boolean.
	 *
	 * @param ticketId the ticket id
	 * @return the boolean
	 */
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

	/**
	 * Add cancellation.
	 *
	 * @param cancellation the cancellation
	 */
	public void addCancellation(Cancellation cancellation) {
		cancellationList.addCancellation(cancellation);
	}

	/**
	 * Gets theatre.
	 *
	 * @return the theatre
	 */
	public Theatre getTheatre() {
		return theatre;
	}

	/**
	 * Sets theatre.
	 *
	 * @param theatre the theatre
	 */
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	/**
	 * Gets master ticket list.
	 *
	 * @return the master ticket list
	 */
	public MasterTicketList getMasterTicketList() {
		return masterTicketList;
	}

	/**
	 * Sets master ticket list.
	 *
	 * @param masterTicketList the master ticket list
	 */
	public void setMasterTicketList(MasterTicketList masterTicketList) {
		this.masterTicketList = masterTicketList;
	}

	/**
	 * Gets cancellation list.
	 *
	 * @return the cancellation list
	 */
	public CancellationList getCancellationList() {
		return cancellationList;
	}

	/**
	 * Sets cancellation list.
	 *
	 * @param cancellationList the cancellation list
	 */
	public void setCancellationList(CancellationList cancellationList) {
		this.cancellationList = cancellationList;
	}
}
