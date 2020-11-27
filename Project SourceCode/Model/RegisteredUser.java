package Model;

import java.util.Calendar;
import java.util.Date;

public class RegisteredUser extends User{

	private String email;
	private String password;
	private CreditCard cc;
	private Date registrationDate;
	private Refund refund;
	
	public RegisteredUser(String email, String password, CreditCard creditCard) {
		super();
		setEmail(email);
		setPassword(password);
		setCc(creditCard);
		setRegistrationDate(Calendar.getInstance().getTime());
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

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
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
}
