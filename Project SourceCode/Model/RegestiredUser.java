package Model;

import java.util.Calendar;
import java.util.Date;

public class RegestiredUser extends User{

	private String email;
	private String password;
	private CreditCard cc;
	private Date registrationDate;
	private Refund refund;
	
	public RegestiredUser(String email, String password, CreditCard cc) {
		super();
		this.email = email;
		this.password = password;
		this.cc = cc;
		
		//set registration date 
		Date today = Calendar.getInstance().getTime();
		this.registrationDate = today;
	}
	
	
	public int getUserId() {
		return userId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public CreditCard getCreditCard() {
		return cc;
	}
	
	public Refund getRefund() {
		return refund;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
}
