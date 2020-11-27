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
	private final ArrayList<RegestiredUser> registeredUserList;

	//construct Model.UCS
	//receives registered UserList from database query
	public UCS(ArrayList<RegestiredUser> registeredUserList) {
		this.registeredUserList = registeredUserList;
	}
	
	//login user
	public boolean login(String email, String password) {
		boolean loginVerified = false;
		
		for(RegestiredUser u: registeredUserList) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loginVerified = true;
			}
		}		
		return loginVerified;
	}
	
	//create casual user
	public User createCasualUser() {
		User casualUser = new User();
		return casualUser;
	}
	
	//create registered user
	public RegestiredUser createRegisteredUser(String email, String password, CreditCard cc) {
		RegestiredUser regestiredUser = new RegestiredUser(email, password, cc);
		getRegisteredUserList().add(regestiredUser);
		return regestiredUser;
	}

	public ArrayList<RegestiredUser> getRegisteredUserList() {
		return registeredUserList;
	}
	
}
