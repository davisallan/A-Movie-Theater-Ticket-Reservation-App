package Model;

import java.util.ArrayList;

/**
 * The type Ticket.
 */
public class Ticket {

	private int ticketId;
	private Theatre theatre;
	private Movie movie;
	private ShowTime showTime;
	private ArrayList<Seat> seats;
	private User user;
	private double amount;


	/**
	 * Instantiates a new Ticket.
	 *
	 * @param ticketId the ticket id
	 * @param user     the user
	 * @param theatre  the theatre
	 * @param movie    the movie
	 * @param showTime the show time
	 * @param seat     the seat
	 * @param amount   the amount
	 */
	public Ticket(int ticketId, User user, Theatre theatre, Movie movie, ShowTime showTime, ArrayList<Seat> seat, double amount) {
		setTicketId(ticketId);
		setUser(user);
		setTheatre(theatre);
		setMovie(movie);
		setShowTime(showTime);
		setSeat(seat);
		setAmount(amount);
	}

	/**
	 * Sets ticket id.
	 *
	 * @param ticketId the ticket id
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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
	 * Sets movie.
	 *
	 * @param movie the movie
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * Sets show time.
	 *
	 * @param showTime the show time
	 */
	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}

	/**
	 * Sets seat.
	 *
	 * @param seat the seat
	 */
	public void setSeat(ArrayList<Seat> seat) {
		this.seats = seat;
	}

	/**
	 * Sets user.
	 *
	 * @param user the user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets ticket id.
	 *
	 * @return the ticket id
	 */
	public int getTicketId() {
		return ticketId;
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
	 * Gets movie.
	 *
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * Gets show time.
	 *
	 * @return the show time
	 */
	public ShowTime getShowTime() {
		return showTime;
	}

	/**
	 * Gets seat.
	 *
	 * @return the seat
	 */
	public ArrayList<Seat> getSeat() {
		return seats;
	}

	/**
	 * Gets amount.
	 *
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets amount.
	 *
	 * @param amount the amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TicketID: " + getTicketId() + "\nMovie: " + getMovie() + "\nShowtime: "
				+ getShowTime() + "\nSeats: " + getSeat() + "\nAmount: $" + getAmount();
	}
}
