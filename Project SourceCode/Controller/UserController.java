package Controller;

import Model.CreditCard;
import Model.RegisteredUser;
import Model.UCS;
import Model.User;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * The type User controller.
 */
public class UserController {

	/**
	 * The User ctrl sys.
	 */
	UCS userCtrlSys;

	/**
	 * Instantiates a new User controller.
	 *
	 * @param userCtrlSys the user ctrl sys
	 */
	public UserController(UCS userCtrlSys) {
		setUserCtrlSys(userCtrlSys);
	}

	/**
	 * Login boolean.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the boolean
	 */
	public boolean login(String email, String password) {
		return userCtrlSys.login(email, password);
	}

	/**
	 * Gets registered user.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the registered user
	 */
	public RegisteredUser getRegisteredUser(String email, String password) {
		return userCtrlSys.getRegisteredUser(email, password);
	}

	/**
	 * Load registered users.
	 *
	 * @param rs the rs
	 */
	public void loadRegisteredUsers(ResultSet rs) {
		userCtrlSys.loadRegisteredUsers(rs);
	}

	/**
	 * Create casual user user.
	 *
	 * @return the user
	 */
	public User createCasualUser() {
		return userCtrlSys.createCasualUser();
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
	public RegisteredUser createRegisteredUser(int userID, String fName, String lName,String email, String password, CreditCard creditCard) {
		return userCtrlSys.createRegisteredUser(userID,fName, lName, email, password, creditCard);
	}

	/**
	 * Get registered user list array list.
	 *
	 * @return the array list
	 */
	public ArrayList<RegisteredUser> getRegisteredUserList(){
		return userCtrlSys.getRegisteredUserList().getRegisteredUsers();
	}

	/**
	 * Gets user ctrl sys.
	 *
	 * @return the user ctrl sys
	 */
	public UCS getUserCtrlSys() {
		return userCtrlSys;
	}

	/**
	 * Sets user ctrl sys.
	 *
	 * @param userCtrlSys the user ctrl sys
	 */
	public void setUserCtrlSys(UCS userCtrlSys) {
		this.userCtrlSys = userCtrlSys;
	}
}
