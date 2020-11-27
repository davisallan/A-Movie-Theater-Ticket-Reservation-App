package Model;

public class User{

	protected static int userId = 0;
	protected Ticket ticket;
	private Voucher voucher;
	
	public User() {
		userId += 1;
	}
	
	public int getUserId() {
		return userId;
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

	public void makePayment() {

	}

	public void purchaseTicket() {

	}

	public void cancelTicket(Ticket ticket) {

	}
}
