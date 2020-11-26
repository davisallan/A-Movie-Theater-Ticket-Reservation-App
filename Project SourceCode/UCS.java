import java.util.ArrayList;

/*
 * User control system
 * verifies user login
 * creates casual user for ticket reservation
 * creates registerd user for user registration
 * populates RegisteredUserList to keep track of all registerd user info
 */


public class UCS {
	
	//list of registerd users
	private ArrayList<RegestiredUser> regestiredUserList;

	//construct UCS
	//receives regestiredUserList from database query
	public UCS(ArrayList<RegestiredUser> regestiredUserList) {
		this.regestiredUserList = regestiredUserList;
	}
	
	//login user
	public boolean login(String email, String password) {
		boolean loginVerified = false;
		
		for(RegestiredUser u: regestiredUserList) {
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
		return regestiredUser;
	}

	public ArrayList<RegestiredUser> getRegestiredUserList() {
		return regestiredUserList;
	}
	
}
