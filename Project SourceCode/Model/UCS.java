package Model;

import java.util.ArrayList;

/*
 * Model.User control system
 * verifies user login
 * creates casual user for ticket reservation
 * creates registered user for user registration
 * populates RegisteredUserList to keep track of all registered user info
 */


public class UCS {
	
	//list of registered users
	private final ArrayList<RegisteredUser> registeredUserList;

	//construct Model.UCS
	//receives registered UserList from database query
	public UCS(ArrayList<RegisteredUser> registeredUserList) {
		this.registeredUserList = registeredUserList;
	}
	
	//login user
	public boolean login(String email, String password) {
		boolean loginVerified = false;
		
		for(RegisteredUser u: registeredUserList) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loginVerified = true;
			}
		}		
		return loginVerified;
	}
	
	//create casual user
	public User createCasualUser() {
		return new User();
	}
	
	//create registered user
	public RegisteredUser createRegisteredUser(String email, String password, CreditCard creditCard) {
		RegisteredUser registeredUser = new RegisteredUser(email, password, creditCard);
		getRegisteredUserList().add(registeredUser);
		return registeredUser;
	}

	public ArrayList<RegisteredUser> getRegisteredUserList() {
		return registeredUserList;
	}
	
}
