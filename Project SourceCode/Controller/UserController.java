package Controller;

import Model.CreditCard;
import Model.RegestiredUser;
import Model.UCS;
import Model.User;

import java.util.ArrayList;

public class UserController {
	
	UCS ucs;

	public boolean login(String email, String password) {
		boolean loginVerified = ucs.login(email, password);
		return loginVerified;
	}
	
	public RegestiredUser getLoggedInUser(String email, String password) {
		RegestiredUser loggedInUser = null;
		for(RegestiredUser u: ucs.getRegestiredUserList()) {
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
	
	public RegestiredUser createRegestiredUser(String email, String password, CreditCard cc) {
		RegestiredUser regestiredUser = createRegestiredUser(email, password, cc);
		return regestiredUser;
	}
	
	public ArrayList<RegestiredUser> getRegestiredUserList(){
		return ucs.getRegestiredUserList();
	}
	
}
