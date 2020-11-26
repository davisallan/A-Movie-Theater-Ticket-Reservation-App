
public class Voucher {
	
	protected static int voucherId = 0;
	private double voucherValue;
	
	public Voucher() {
		voucherId += 1;
		this.voucherValue = 20;
	}

}
