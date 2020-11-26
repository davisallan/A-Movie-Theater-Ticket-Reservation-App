
public class Ticket {
	
	private int ticketId;
	private Theatre theatre;
	private Movie movie;
	private ShowTime showTime;
	private Seat seat;
	private User user;

	
	public Ticket(int ticketId, Theatre theatre, Movie movie, ShowTime showTime,  Seat seat) {
		this.ticketId = ticketId;
		this.movie = movie;
		this.showTime = showTime;
		this.seat = seat;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	
	public Theatre getTheatre() {
		return theatre;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public ShowTime getShowTime() {
		return showTime;
	}
	
	public Seat getSeat() {
		return seat;
	}
}
