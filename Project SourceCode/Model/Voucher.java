package Model;

import java.util.Calendar;
import java.util.Date;

public class Voucher {
	
	private static int globalVoucherID = 100;
	private int voucherID;
	private double voucherValue;
	private Date expiry;
	
	public Voucher(double value) {
		globalVoucherID += 1;
		setVoucherID(globalVoucherID);
		setVoucherValue(value);
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		setExpiry(nextYear);
	}

	public int getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	public int getVoucherId() {
		return voucherID;
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
		return String.format("VoucherID: %s \nAmount: $%.2f \nExpiry: %s", getVoucherId(), getVoucherValue(), getExpiry());
	}
}
