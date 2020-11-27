package Controller;

import Model.*;

/*
 * Main Controller
 * talks to all other controllers to coordinate actions based on GUI input
 */

public class MainController {
	

	RegestiredUser loggedInUser; // keeps track of user that is currently logged in
	UserController userController;
	TheatreController theatreController;
	ReservationController reservationController;
	PaymentController paymentController;
	GUIController guiController;

	public MainController(UserController userController,
						  TheatreController theatreController,
						  ReservationController reservationController,
						  PaymentController paymentController,
						  GUIController guiController)
	{
		setUserController(userController);
		setTheatreController(theatreController);
		setReservationController(reservationController);
		setPaymentController(paymentController);
		setGuiController(guiController);
	}

	//login and set the loggedInUser attribute to keep track of the user that is logged in
	public RegestiredUser login(String email, String password) {
		boolean verifyLogin = userController.login(email, password);
		RegestiredUser loggedInUser = null;
		if(verifyLogin) {
			loggedInUser = userController.getLoggedInUser(email, password);
		}
		return loggedInUser;
	}
	
	public void createReservation(Theatre theatre, Movie movie, ShowTime showTime, Seat seat) {
		User user = null;
		if(loggedInUser == null) {
			user = userController.createCasualUser();
		}
		reservationController.reserve(user, theatre, movie, showTime, seat);
	}
	
	public void cancelReservation(int ticketId) {
		if(loggedInUser != null) {
			CreditCard cc = null;
			for(RegestiredUser u: userController.getRegisteredUserList()) {
				if(u.getEmail().contentEquals(loggedInUser.getEmail()) && u.getPassword().contentEquals(loggedInUser.getPassword())) {
					cc = u.getCreditCard();
				}
			}
			reservationController.cancel(loggedInUser, ticketId, cc);
		}
	}
	
	public void updateSelection(Theatre theatre, Movie movie, ShowTime showTime) {
		theatreController.getTheatreInfo();
	}

	public RegestiredUser getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(RegestiredUser loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public UserController getUserController() {
		return userController;
	}

	public void setUserController(UserController userController) {
		this.userController = userController;
	}

	public TheatreController getTheatreController() {
		return theatreController;
	}

	public void setTheatreController(TheatreController theatreController) {
		this.theatreController = theatreController;
	}

	public ReservationController getReservationController() {
		return reservationController;
	}

	public void setReservationController(ReservationController reservationController) {
		this.reservationController = reservationController;
	}

	public PaymentController getPaymentController() {
		return paymentController;
	}

	public void setPaymentController(PaymentController paymentController) {
		this.paymentController = paymentController;
	}

	public GUIController getGuiController() {
		return guiController;
	}

	public void setGuiController(GUIController guiController) {
		this.guiController = guiController;
	}

	public static void main(String[] args) {
		UserController userController = new UserController();
		TheatreController theatreController = new TheatreController();
		ReservationController reservationController = new ReservationController();
		PaymentController paymentController = new PaymentController();
		GUIController guiController = new GUIController();
		MainController mainController = new MainController(userController, theatreController,
															reservationController, paymentController,
															guiController);

	}
}
