package Model;

/**
 * The type User.
 */
public class User{

	/**
	 * The Ticket.
	 */
	protected Ticket ticket;
	private Voucher voucher;

	/**
	 * Instantiates a new User.
	 */
	public User() {

	}

	/**
	 * Gets ticket.
	 *
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * Sets ticket.
	 *
	 * @param ticket the ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * Gets voucher.
	 *
	 * @return the voucher
	 */
	public Voucher getVoucher() {
		return voucher;
	}

	/**
	 * Sets voucher.
	 *
	 * @param voucher the voucher
	 */
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
