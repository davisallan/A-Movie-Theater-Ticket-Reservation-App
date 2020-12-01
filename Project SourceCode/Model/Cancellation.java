package Model;

import java.util.Calendar;
import java.util.Date;

public class Cancellation {

	private static int cancellationId = 0;
	private Voucher voucher;
	private Date date;

	public Cancellation(Voucher voucher) {
		cancellationId += 1;
		setVoucher(voucher);
		setDate(Calendar.getInstance().getTime());
	}
	
	public int getCancellationId() {
		return cancellationId;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
