package Model;

public class Cancellation {

	private static int cancellationId = 0;
	private Voucher voucher;

	
	public Cancellation() {
		cancellationId += 1;
	}
	
	public int getCancellationId() {
		return cancellationId;
	}
	
	public void cancellationVoucher() {
		
	}
	
}
