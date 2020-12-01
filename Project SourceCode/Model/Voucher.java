package Model;

import java.util.Calendar;
import java.util.Date;

public class Voucher {
	
	private static int voucherId = 0;
	private double voucherValue;
	private Date expiry;
	
	public Voucher(double value) {
		voucherId += 1;
		setVoucherValue(value);
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		setExpiry(nextYear);
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

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "VoucherID: " + getVoucherId() + "\nAmount: $" + getVoucherValue() + "\nExpiry: " + getExpiry();
	}
}
