package Model;

//public class Payment {
//
//	private User user;
//	private CreditCard cc;
//	private String name;
//
//
//
//}

import java.sql.Date;
import java.util.Calendar;

/**
 * @author michael A
 *	Payment id should matches with the receipt id?
 */
public class Payment {

	private User user;
	private CreditCard cc;
	private String name;

	//added variables
	private int id;
	private double amount;
	private Date paidDate;

	public Payment(){

	}

	//when creating a payment automatically record the date
	public Payment(int id, double amount) {
		Calendar cal = Calendar.getInstance();
		this.setPaidDate(new Date(cal.getTime().getTime()));
		this.setId(id);
		this.setAmount(amount);
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the paidDate
	 */
	public Date getPaidDate() {
		return paidDate;
	}

	/**
	 * @param paidDate the paidDate to set
	 */
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}