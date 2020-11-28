package Model;

import java.util.Calendar;
import java.util.Date;

public class RegisteredUser extends User{

	private int userID;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private CreditCard creditCard;
	private Date registrationDate;
	private Refund refund;
	
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

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Refund getRefund() {
		return refund;
	}

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
