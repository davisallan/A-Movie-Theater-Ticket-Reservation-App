package Controller;

import Model.*;

import java.util.ArrayList;

public class ReservationController {
	
	private TRS ticketReserveSys;

	public ReservationController(TRS ticketReserveSys) {
		setTicketReserveSys(ticketReserveSys);
	}

	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, ArrayList<Seat> seat, double amount) {
		ticketReserveSys.reserve(user, theatre, movie, showTime, seat, amount);
	}
	
	public boolean cancelTicket(User user, int ticketId) {
		return ticketReserveSys.cancelReservation(user, ticketId);
	}

	public TRS getTicketReserveSys() {
		return ticketReserveSys;
	}

	public void setTicketReserveSys(TRS ticketReserveSys) {
		this.ticketReserveSys = ticketReserveSys;
	}
}
