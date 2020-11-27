package Model;

public class Voucher {
	
	private static int voucherId = 0;
	private double voucherValue;
	
	public Voucher(double value) {
		voucherId += 1;
		setVoucherValue(value);
	}

	public Voucher() {
		voucherId += 1;
		setVoucherValue(20);
	}

	public static int getVoucherId() {
		return voucherId;
	}

	public double getVoucherValue() {
		return voucherValue;
	}

	public void setVoucherValue(double voucherValue) {
		this.voucherValue = voucherValue;
	}
}
