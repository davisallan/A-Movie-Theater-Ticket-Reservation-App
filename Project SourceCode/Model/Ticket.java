package Model;

public class Ticket {

	private int ticketId;
	private Theatre theatre;
	private Movie movie;
	private ShowTime showTime;
	private Seat seat;
	private User user;

	
	public Ticket(int ticketId, Theatre theatre, Movie movie, ShowTime showTime,  Seat seat) {
		setTicketId(ticketId);
		setTheatre(theatre);
		setMovie(movie);
		setShowTime(showTime);
		setSeat(seat);
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "TicketID: " + getTicketId() + ", Movie: " + getMovie() + ", Showtime: " + getShowTime() + ", Seat" + getSeat();
	}
}
