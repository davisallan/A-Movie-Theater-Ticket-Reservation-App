package Model;

import java.sql.ResultSet;

/*
 * Model.User control system
 * verifies user login
 * creates casual user for ticket reservation
 * creates registered user for user registration
 * populates RegisteredUserList to keep track of all registered user info
 */


public class UCS {

	private RegisteredUserList registeredUserList;

	public UCS(RegisteredUserList registeredUserList) {
		setRegisteredUserList(registeredUserList);
	}
	
	//login user
	public boolean login(String email, String password) {
		boolean loginVerified = false;
		
		for(RegisteredUser u: registeredUserList.getRegisteredUsers()) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loginVerified = true;
			}
		}		
		return loginVerified;
	}

	public RegisteredUser getRegisteredUser(String email, String password) {
		RegisteredUser loggedInUser = null;
		for(RegisteredUser u: registeredUserList.getRegisteredUsers()) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loggedInUser = u;
			}
		}
		return loggedInUser;
	}

	//create casual user
	public User createCasualUser() {
		return new User();
	}

	//building registeredUserList from db query
	public void loadRegisteredUsers(ResultSet rs) {
		registeredUserList.loadRegisteredUsers(rs);
	}

	//create registered user
	public RegisteredUser createRegisteredUser(int userID, String fName, String lName, String email, String password, CreditCard creditCard) {
		RegisteredUser registeredUser = new RegisteredUser(userID, fName, lName, email, password, creditCard);
		getRegisteredUserList().getRegisteredUsers().add(registeredUser);
		return registeredUser;
	}



	public void display() {
		for (RegisteredUser user : getRegisteredUserList().getRegisteredUsers()) {
			System.out.println(user);
		}
	}

	public RegisteredUserList getRegisteredUserList() {
		return registeredUserList;
	}

	public void setRegisteredUserList(RegisteredUserList registeredUserList) {
		this.registeredUserList = registeredUserList;
	}
}
