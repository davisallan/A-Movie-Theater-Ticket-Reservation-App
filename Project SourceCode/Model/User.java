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
	
	public void setTicket(Ticket myTicket) {
		this.ticket = myTicket;
	}
	
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}
	
}
