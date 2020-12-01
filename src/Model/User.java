package Model;

public class User{

	protected Ticket ticket;
	private Voucher voucher;
	
	public User() {

	}

	public void makePayment() {

	}

	public void purchaseTicket() {

	}

	public void cancelTicket(Ticket ticket) {

	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
