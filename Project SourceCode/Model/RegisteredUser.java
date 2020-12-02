package Model;

import java.util.Calendar;
import java.util.Date;

/**
 * The type Registered user.
 */
public class RegisteredUser extends User{

	private int userID;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private CreditCard creditCard;
	private Date registrationDate;
	private Refund refund;

	/**
	 * Instantiates a new Registered user.
	 *
	 * @param userID     the user id
	 * @param fName      the f name
	 * @param lName      the l name
	 * @param email      the email
	 * @param password   the password
	 * @param creditCard the credit card
	 */
	public RegisteredUser(int userID, String fName, String lName, String email, String password, CreditCard creditCard) {
		super();
		setUserID(userID);
		setfName(fName);
		setlName(lName);
		setEmail(email);
		setPassword(password);
		setCreditCard(creditCard);
		setRegistrationDate(Calendar.getInstance().getTime());
	}

	/**
	 * Gets user id.
	 *
	 * @return the user id
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * Sets user id.
	 *
	 * @param userID the user id
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Sets name.
	 *
	 * @param fName the f name
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * Sets name.
	 *
	 * @param lName the l name
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email.
	 *
	 * @param email the email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets credit card.
	 *
	 * @return the credit card
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * Sets credit card.
	 *
	 * @param creditCard the credit card
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * Gets registration date.
	 *
	 * @return the registration date
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * Sets registration date.
	 *
	 * @param registrationDate the registration date
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * Gets refund.
	 *
	 * @return the refund
	 */
	public Refund getRefund() {
		return refund;
	}

	/**
	 * Sets refund.
	 *
	 * @param refund the refund
	 */
	public void setRefund(Refund refund) {
		this.refund = refund;
	}

	@Override
	public String toString() {
		return "Name: " + getfName() + " " + getlName() + "\n" +
				"Email: " + getEmail() + "\n" +
				"Password: " + getPassword() + "\n" +
				"Credit Card: \n" + getCreditCard() + "\n";
	}
}
