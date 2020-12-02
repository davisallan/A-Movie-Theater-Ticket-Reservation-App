package Model;

import java.util.Calendar;
import java.util.Date;

/**
 * The type Voucher.
 */
public class Voucher {
	
	private static int globalVoucherID = 100;
	private int voucherID;
	private double voucherValue;
	private Date expiry;

	/**
	 * Instantiates a new Voucher.
	 *
	 * @param value the value
	 */
	public Voucher(double value) {
		globalVoucherID += 1;
		setVoucherID(globalVoucherID);
		setVoucherValue(value);
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1);
		Date nextYear = cal.getTime();
		setExpiry(nextYear);
	}

	/**
	 * Gets voucher id.
	 *
	 * @return the voucher id
	 */
	public int getVoucherID() {
		return voucherID;
	}

	/**
	 * Sets voucher id.
	 *
	 * @param voucherID the voucher id
	 */
	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	/**
	 * Gets voucher id.
	 *
	 * @return the voucher id
	 */
	public int getVoucherId() {
		return voucherID;
	}

	/**
	 * Gets voucher value.
	 *
	 * @return the voucher value
	 */
	public double getVoucherValue() {
		return voucherValue;
	}

	/**
	 * Sets voucher value.
	 *
	 * @param voucherValue the voucher value
	 */
	public void setVoucherValue(double voucherValue) {
		this.voucherValue = voucherValue;
	}

	/**
	 * Gets expiry.
	 *
	 * @return the expiry
	 */
	public Date getExpiry() {
		return expiry;
	}

	/**
	 * Sets expiry.
	 *
	 * @param expiry the expiry
	 */
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return String.format("VoucherID: %s \nAmount: $%.2f \nExpiry: %s", getVoucherId(), getVoucherValue(), getExpiry());
	}
}
