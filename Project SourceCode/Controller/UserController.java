package Controller;

import Model.CreditCard;
import Model.RegisteredUser;
import Model.UCS;
import Model.User;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserController {
	
	UCS userCtrlSys;

	public UserController(UCS userCtrlSys) {
		setUserCtrlSys(userCtrlSys);
	}

	public boolean login(String email, String password) {
		return userCtrlSys.login(email, password);
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

	public void loadRegisteredUsers(ResultSet rs) {
		userCtrlSys.loadRegisteredUsers(rs);
	}

	public User createCasualUser() {
		return userCtrlSys.createCasualUser();
	}
	
	public RegisteredUser createRegisteredUser(int userID, String fName, String lName,String email, String password, CreditCard creditCard) {
		return userCtrlSys.createRegisteredUser(userID,fName, lName, email, password, creditCard);
	}
	
	public ArrayList<RegisteredUser> getRegisteredUserList(){
		return userCtrlSys.getRegisteredUserList();
	}

	public UCS getUserCtrlSys() {
		return userCtrlSys;
	}

	public void setUserCtrlSys(UCS userCtrlSys) {
		this.userCtrlSys = userCtrlSys;
	}
}
