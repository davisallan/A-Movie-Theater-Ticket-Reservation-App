package Model;

import java.util.Calendar;
import java.util.Date;

/**
 * The type Cancellation.
 */
public class Cancellation {

	private static int cancellationId = 0;
	private Voucher voucher;
	private Date date;

	/**
	 * Instantiates a new Cancellation.
	 *
	 * @param voucher the voucher
	 */
	public Cancellation(Voucher voucher) {
		cancellationId += 1;
		setVoucher(voucher);
		setDate(Calendar.getInstance().getTime());
	}

	/**
	 * Gets cancellation id.
	 *
	 * @return the cancellation id
	 */
	public int getCancellationId() {
		return cancellationId;
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

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets date.
	 *
	 * @param date the date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
