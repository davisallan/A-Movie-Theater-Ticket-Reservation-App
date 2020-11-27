package Controller;

import Model.*;

/*
 * Main Controller
 * talks to all other controllers to coordinate actions based on GUI input
 */

public class MainController {


	RegisteredUser loggedInUser; // keeps track of user that is currently logged in
	UserController userCtrl;
	TheatreController theatreCtrl;
	ReservationController reserveCtrl;
	PaymentController paymentCtrl;
	GUIController guiCtrl;

	public MainController(UserController userCtrl, TheatreController theatreCtrl,
						  ReservationController reserveCtrl, PaymentController paymentCtrl,
						  GUIController guiCtrl) {
		setUserCtrl(userCtrl);
		setTheatreCtrl(theatreCtrl);
		setReserveCtrl(reserveCtrl);
		setPaymentCtrl(paymentCtrl);
		setGuiCtrl(guiCtrl);
	}

	//login and set the loggedInUser attribute to keep track of the user that is logged in
	public RegisteredUser login(String email, String password) {
		boolean verifyLogin = userCtrl.login(email, password);
		RegisteredUser loggedInUser = null;
		if(verifyLogin) {
			loggedInUser = userCtrl.getLoggedInUser(email, password);
		}
		return loggedInUser;
	}
	
	public void createReservation(Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		User user = null;
		if(loggedInUser == null) {
			user = userCtrl.createCasualUser();
		}
		reserveCtrl.reserve(user, theatre, movie, showTime, seat);
	}
	
	public void cancelReservation(int ticketId) {
		if(loggedInUser != null) {
			CreditCard creditCard = null;
			for(RegisteredUser u: userCtrl.getRegisteredUserList()) {
				if(u.getEmail().contentEquals(loggedInUser.getEmail()) && u.getPassword().contentEquals(loggedInUser.getPassword())) {
					creditCard = u.getCreditCard();
				}
			}
			reserveCtrl.cancel(loggedInUser, ticketId, creditCard);
		}
	}
	
	public void updateSelection(Theatre theatre, Movie movie, ShowTime showTime) {
		theatreCtrl.getTheatreInfo();
	}

	public RegisteredUser getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(RegisteredUser loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public UserController getUserCtrl() {
		return userCtrl;
	}

	public void setUserCtrl(UserController userCtrl) {
		this.userCtrl = userCtrl;
	}

	public TheatreController getTheatreCtrl() {
		return theatreCtrl;
	}

	public void setTheatreCtrl(TheatreController theatreCtrl) {
		this.theatreCtrl = theatreCtrl;
	}

	public ReservationController getReserveCtrl() {
		return reserveCtrl;
	}

	public void setReserveCtrl(ReservationController reserveCtrl) {
		this.reserveCtrl = reserveCtrl;
	}

	public PaymentController getPaymentCtrl() {
		return paymentCtrl;
	}

	public void setPaymentCtrl(PaymentController paymentCtrl) {
		this.paymentCtrl = paymentCtrl;
	}

	public GUIController getGuiCtrl() {
		return guiCtrl;
	}

	public void setGuiCtrl(GUIController guiCtrl) {
		this.guiCtrl = guiCtrl;
	}

	public static void main(String[] args) {
		UserController userCtrl = new UserController();
		TheatreController theatreCtrl = new TheatreController();
		ReservationController reserveCtrl = new ReservationController();
		PaymentController paymentCtrl = new PaymentController();
		GUIController guiCtrl = new GUIController();
		MainController mainCtrl = new MainController(userCtrl, theatreCtrl, reserveCtrl, paymentCtrl, guiCtrl);

	}
}
