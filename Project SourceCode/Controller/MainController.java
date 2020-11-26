package Controller;

import Model.*;

import java.util.ArrayList;

/*
 * Main Controller
 * talks to all other controllers to coordinate actions based on GUI input
 */


public class MainController {
	
	// keeps track of user thats currently logged in
	RegestiredUser loggedInUser;

	UserController UC = new UserController();
	TheatreController TC = new TheatreController();
	ReservationController RC = new ReservationController();
	PaymentController PC = new PaymentController();

	
	//login and set the loggedInUser attribute to keep track of the user thats logged in
	public RegestiredUser login(String email, String password) {
		boolean verifyLogin = UC.login(email, password);
		RegestiredUser loggedInUser = null;
		if(verifyLogin) {
			loggedInUser = UC.getLoggedInUser(email, password);
		}
		return loggedInUser;
	}
	
	public void createReservation(Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		User user = null;
		if(loggedInUser == null) {
			user = UC.createCasualUser();
		}
		RC.reserve(user, theatre, movie, showTime, seat);
	}
	
	public void cancelReservation(int ticketId) {
		if(loggedInUser != null) {
			CreditCard cc = null;
			for(RegestiredUser u: UC.getRegestiredUserList()) {
				if(u.getEmail().contentEquals(loggedInUser.getEmail()) && u.getPassword().contentEquals(loggedInUser.getPassword())) {
					cc = u.getCreditCard();
				}
			}
			RC.cancel(loggedInUser, ticketId, cc);
		}
	}
	
	public void updateSelection(Theatre theatre, Movie movie, ShowTime showTime) {
		TC.getTheatreInfo();
	}
	
	
}
