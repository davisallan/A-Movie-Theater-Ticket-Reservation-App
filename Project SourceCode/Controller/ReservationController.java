package Controller;

import Model.*;

import java.util.ArrayList;

/**
 * The type Reservation controller.
 */
public class ReservationController {
	
	private TRS ticketReserveSys;

	/**
	 * Instantiates a new Reservation controller.
	 *
	 * @param ticketReserveSys the ticket reserve sys
	 */
	public ReservationController(TRS ticketReserveSys) {
		setTicketReserveSys(ticketReserveSys);
	}

	/**
	 * Reserve.
	 *
	 * @param user     the user
	 * @param theatre  the theatre
	 * @param movie    the movie
	 * @param showTime the show time
	 * @param seat     the seat
	 * @param amount   the amount
	 */
	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, ArrayList<Seat> seat, double amount) {
		ticketReserveSys.reserve(user, theatre, movie, showTime, seat, amount);
	}

	/**
	 * Cancel ticket boolean.
	 *
	 * @param ticketId the ticket id
	 * @return the boolean
	 */
	public boolean cancelTicket(int ticketId) {
		return ticketReserveSys.cancelReservation(ticketId);
	}

	/**
	 * Add cancellation.
	 *
	 * @param cancellation the cancellation
	 */
	public void addCancellation(Cancellation cancellation) {
		ticketReserveSys.addCancellation(cancellation);
	}

	/**
	 * Gets ticket reserve sys.
	 *
	 * @return the ticket reserve sys
	 */
	public TRS getTicketReserveSys() {
		return ticketReserveSys;
	}

	/**
	 * Sets ticket reserve sys.
	 *
	 * @param ticketReserveSys the ticket reserve sys
	 */
	public void setTicketReserveSys(TRS ticketReserveSys) {
		this.ticketReserveSys = ticketReserveSys;
	}
}
