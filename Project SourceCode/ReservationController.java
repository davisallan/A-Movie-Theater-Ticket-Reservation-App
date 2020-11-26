
public class ReservationController {
	
	private TRS trs;
	
	public void reserve(User user, Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		trs.reserve(user, theatre, movie, showTime, seat);
	}
	
	public void cancel(User user, int ticketId, CreditCard cc) {
		trs.cancelReservation(user, ticketId, cc);
	}

}
