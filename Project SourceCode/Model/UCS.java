package Model;

import java.sql.ResultSet;

/*
 * Model.User control system
 * verifies user login
 * creates casual user for ticket reservation
 * creates registered user for user registration
 * populates RegisteredUserList to keep track of all registered user info
 */


/**
 * The type Ucs.
 */
public class UCS {

	private RegisteredUserList registeredUserList;

	/**
	 * Instantiates a new Ucs.
	 *
	 * @param registeredUserList the registered user list
	 */
	public UCS(RegisteredUserList registeredUserList) {
		setRegisteredUserList(registeredUserList);
	}

	/**
	 * Login boolean.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the boolean
	 */
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

	/**
	 * Gets registered user.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the registered user
	 */
	public RegisteredUser getRegisteredUser(String email, String password) {
		RegisteredUser loggedInUser = null;
		for(RegisteredUser u: registeredUserList.getRegisteredUsers()) {
			if(u.getEmail().contentEquals(email) && u.getPassword().contentEquals(password)) {
				loggedInUser = u;
			}
		}
		return loggedInUser;
	}

	/**
	 * Create casual user user.
	 *
	 * @return the user
	 */
//create casual user
	public User createCasualUser() {
		return new User();
	}

	/**
	 * Load registered users.
	 *
	 * @param rs the rs
	 */
//building registeredUserList from db query
	public void loadRegisteredUsers(ResultSet rs) {
		registeredUserList.loadRegisteredUsers(rs);
	}

	/**
	 * Create registered user registered user.
	 *
	 * @param userID     the user id
	 * @param fName      the f name
	 * @param lName      the l name
	 * @param email      the email
	 * @param password   the password
	 * @param creditCard the credit card
	 * @return the registered user
	 */
//create registered user
	public RegisteredUser createRegisteredUser(int userID, String fName, String lName, String email, String password, CreditCard creditCard) {
		RegisteredUser registeredUser = new RegisteredUser(userID, fName, lName, email, password, creditCard);
		getRegisteredUserList().getRegisteredUsers().add(registeredUser);
		return registeredUser;
	}


	/**
	 * Display.
	 */
	public void display() {
		for (RegisteredUser user : getRegisteredUserList().getRegisteredUsers()) {
			System.out.println(user);
		}
	}

	/**
	 * Gets registered user list.
	 *
	 * @return the registered user list
	 */
	public RegisteredUserList getRegisteredUserList() {
		return registeredUserList;
	}

	/**
	 * Sets registered user list.
	 *
	 * @param registeredUserList the registered user list
	 */
	public void setRegisteredUserList(RegisteredUserList registeredUserList) {
		this.registeredUserList = registeredUserList;
	}
}
