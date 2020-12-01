package Model;

//public class Voucher {
//
//	private static int voucherId = 0;
//	private double voucherValue;
//
//	public Voucher(double value) {
//		voucherId += 1;
//		setVoucherValue(value);
//	}
//
//	public Voucher() {
//		voucherId += 1;
//		setVoucherValue(20);
//	}
//
//	public static int getVoucherId() {
//		return voucherId;
//	}
//
//	public double getVoucherValue() {
//		return voucherValue;
//	}
//
//	public void setVoucherValue(double voucherValue) {
//		this.voucherValue = voucherValue;
//	}
//}


import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

/**
 * @author michael Adelure
 *
 */
public class Voucher implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int voucherId;
	private Date expDate;

	public Voucher() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 2);
		this.setExpDate((Date) cal.getTime());
		this.setId(generateID());


	}

	private int generateID() {
		Random r = new Random( System.currentTimeMillis() );
		return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}


	/**
	 * @return the voucherId
	 */
	public int getId() {
		return voucherId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.voucherId = id;
	}

	/**
	 * @return the expDate
	 */
	public Date getExpDate() {
		return expDate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}