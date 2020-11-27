package Controller;

import Model.CreditCard;
import Model.RegisteredUser;
import Model.UCS;
import Model.User;

import java.util.ArrayList;

public class UserController {
	
	UCS userCtrlSys;

	public boolean login(String email, String password) {
		boolean loginVerified = userCtrlSys.login(email, password);
		return loginVerified;
	}
	
	public RegisteredUser loginRegisteredUser(String email, String password) {
		RegisteredUser loggedInUser = null;
		for(RegisteredUser u: userCtrlSys.getRegisteredUserList()) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loggedInUser = u;
			}
		}
		return loggedInUser;
	}
	
	public User createCasualUser() {
		return userCtrlSys.createCasualUser();
	}
	
	public RegisteredUser createRegisteredUser(String email, String password, CreditCard creditCard) {
		return userCtrlSys.createRegisteredUser(email, password, creditCard);
	}
	
	public ArrayList<RegisteredUser> getRegisteredUserList(){
		return userCtrlSys.getRegisteredUserList();
	}
	
}
