package Controller;

import Model.*;

public class ReservationController {
	
	private TRS ticketReserveSys;

	public ReservationController(TRS ticketReserveSys) {
		setTicketReserveSys(ticketReserveSys);
	}

	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		ticketReserveSys.reserve(user, theatre, movie, showTime, seat);
	}
	
	public void cancel(User user, int ticketId, CreditCard cc) {
		ticketReserveSys.cancelReservation(user, ticketId, cc);
	}

	public TRS getTicketReserveSys() {
		return ticketReserveSys;
	}

	public void setTicketReserveSys(TRS ticketReserveSys) {
		this.ticketReserveSys = ticketReserveSys;
	}
}
