package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
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
	private ArrayList<RegisteredUser> registeredUserList;

	//construct Model.UCS
	//receives registered UserList from database query
	public UCS() {
		registeredUserList = new ArrayList<>();
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

	public void loadRegisteredUsers(ResultSet rs) {
		try {
			while (rs.next()) {
				getRegisteredUserList().add (new RegisteredUser (
						rs.getInt("UserID"),
						rs.getString("FName"),
						rs.getString("LName"),
						rs.getString("Email"),
						rs.getString("UserPassword"),
						new CreditCard(rs.getString("Card_name"),
								rs.getString("Credit_card"),
								rs.getInt("CVC"),
								rs.getString("Expiry"))));

			}
			display();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//create registered user
	public RegisteredUser createRegisteredUser(int userID, String fName, String lName, String email, String password, CreditCard creditCard) {
		RegisteredUser registeredUser = new RegisteredUser(userID, fName, lName, email, password, creditCard);
		getRegisteredUserList().add(registeredUser);
		return registeredUser;
	}

	public void display() {
		for (RegisteredUser user : getRegisteredUserList()) {
			System.out.println(user);
		}
	}

	public ArrayList<RegisteredUser> getRegisteredUserList() {
		return registeredUserList;
	}
	
}
