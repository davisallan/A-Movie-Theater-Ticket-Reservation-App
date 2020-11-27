package Controller;

import Model.CreditCard;
import Model.RegisteredUser;
import Model.UCS;
import Model.User;

import java.util.ArrayList;

public class UserController {
	
	UCS ucs;

	public boolean login(String email, String password) {
		boolean loginVerified = ucs.login(email, password);
		return loginVerified;
	}
	
	public RegisteredUser getLoggedInUser(String email, String password) {
		RegisteredUser loggedInUser = null;
		for(RegisteredUser u: ucs.getRegisteredUserList()) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loggedInUser = u;
			}
		}
		return loggedInUser;
	}
	
	public User createCasualUser() {
		User casualUser = createCasualUser();
		return casualUser;
	}
	
	public RegisteredUser createRegestiredUser(String email, String password, CreditCard cc) {
		RegisteredUser registeredUser = createRegestiredUser(email, password, cc);
		return registeredUser;
	}
	
	public ArrayList<RegisteredUser> getRegisteredUserList(){
		return ucs.getRegisteredUserList();
	}
	
}
