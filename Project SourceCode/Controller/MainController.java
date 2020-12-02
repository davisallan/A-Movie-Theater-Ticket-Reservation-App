package Controller;

import Model.*;

/*
 * Main Controller
 * talks to all other controllers to coordinate actions based on GUI input
 */

/**
 * The type Main controller.
 */
public class MainController {

	/**
	 * The Logged in user.
	 */
	RegisteredUser loggedInUser; // keeps track of user that is currently logged in
	/**
	 * The User ctrl.
	 */
	UserController userCtrl;
	/**
	 * The Theatre ctrl.
	 */
	TheatreController theatreCtrl;
	/**
	 * The Reserve ctrl.
	 */
	ReservationController reserveCtrl;
	/**
	 * The Payment ctrl.
	 */
	PaymentController paymentCtrl;
	/**
	 * The Db ctrl.
	 */
	DBController dbCtrl;
	/**
	 * The Gui ctrl.
	 */
	GUIController guiCtrl;

	/**
	 * Instantiates a new Main controller.
	 *
	 * @param userCtrl    the user ctrl
	 * @param theatreCtrl the theatre ctrl
	 * @param reserveCtrl the reserve ctrl
	 * @param paymentCtrl the payment ctrl
	 * @param guiCtrl     the gui ctrl
	 * @param dbCtrl      the db ctrl
	 */
	public MainController(UserController userCtrl, TheatreController theatreCtrl,
						  ReservationController reserveCtrl, PaymentController paymentCtrl,
						  GUIController guiCtrl, DBController dbCtrl) {
		setUserCtrl(userCtrl);
		setTheatreCtrl(theatreCtrl);
		setReserveCtrl(reserveCtrl);
		setPaymentCtrl(paymentCtrl);
		setGuiCtrl(guiCtrl);
		setDbCtrl(dbCtrl);
	}

	//login and set the loggedInUser attribute to keep track of the user that is logged in

	/**
	 * Login boolean.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the boolean
	 */
	public boolean login(String email, String password) {
		boolean successful =  userCtrl.login(email,password);
		if (successful) {
			setLoggedInUser(userCtrl.getRegisteredUser(email, password));
			System.out.println(getLoggedInUser().getfName() + " has logged in!");
		} else {
			System.out.println("incorrect username or password, or account does not exist");
		}
		return successful;
	}

	/**
	 * Load db.
	 */
	public void loadDB() {
		userCtrl.loadRegisteredUsers(dbCtrl.selectAll("REGISTERED_USER"));
		theatreCtrl.loadTheatres(dbCtrl.selectAll("THEATRE"));

		//setting the aggregation relationship for TRS to point to the same Theatre as TCS
		reserveCtrl.getTicketReserveSys().setTheatre(theatreCtrl.getTheatreCtrlSys().getTheatre());

		theatreCtrl.loadMovies(dbCtrl.selectAll("MOVIE"));
		theatreCtrl.loadShowTimes(dbCtrl.selectAll("SHOW_TIME"));
		theatreCtrl.loadAuditoriums(dbCtrl.selectAll("AUDITORIUM"));
	}

	/**
	 * Update selection.
	 *
	 * @param theatre  the theatre
	 * @param movie    the movie
	 * @param showTime the show time
	 */
	public void updateSelection(Theatre theatre, Movie movie, ShowTime showTime) {

	}

	/**
	 * Gets logged in user.
	 *
	 * @return the logged in user
	 */
	public RegisteredUser getLoggedInUser() {
		return loggedInUser;
	}

	/**
	 * Sets logged in user.
	 *
	 * @param loggedInUser the logged in user
	 */
	public void setLoggedInUser(RegisteredUser loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	/**
	 * Gets user ctrl.
	 *
	 * @return the user ctrl
	 */
	public UserController getUserCtrl() {
		return userCtrl;
	}

	/**
	 * Sets user ctrl.
	 *
	 * @param userCtrl the user ctrl
	 */
	public void setUserCtrl(UserController userCtrl) {
		this.userCtrl = userCtrl;
	}

	/**
	 * Gets theatre ctrl.
	 *
	 * @return the theatre ctrl
	 */
	public TheatreController getTheatreCtrl() {
		return theatreCtrl;
	}

	/**
	 * Sets theatre ctrl.
	 *
	 * @param theatreCtrl the theatre ctrl
	 */
	public void setTheatreCtrl(TheatreController theatreCtrl) {
		this.theatreCtrl = theatreCtrl;
	}

	/**
	 * Gets reserve ctrl.
	 *
	 * @return the reserve ctrl
	 */
	public ReservationController getReserveCtrl() {
		return reserveCtrl;
	}

	/**
	 * Sets reserve ctrl.
	 *
	 * @param reserveCtrl the reserve ctrl
	 */
	public void setReserveCtrl(ReservationController reserveCtrl) {
		this.reserveCtrl = reserveCtrl;
	}

	/**
	 * Gets payment ctrl.
	 *
	 * @return the payment ctrl
	 */
	public PaymentController getPaymentCtrl() {
		return paymentCtrl;
	}

	/**
	 * Sets payment ctrl.
	 *
	 * @param paymentCtrl the payment ctrl
	 */
	public void setPaymentCtrl(PaymentController paymentCtrl) {
		this.paymentCtrl = paymentCtrl;
	}

	/**
	 * Gets gui ctrl.
	 *
	 * @return the gui ctrl
	 */
	public GUIController getGuiCtrl() {
		return guiCtrl;
	}

	/**
	 * Sets gui ctrl.
	 *
	 * @param guiCtrl the gui ctrl
	 */
	public void setGuiCtrl(GUIController guiCtrl) {
		this.guiCtrl = guiCtrl;
	}

	/**
	 * Gets db ctrl.
	 *
	 * @return the db ctrl
	 */
	public DBController getDbCtrl() {
		return dbCtrl;
	}

	/**
	 * Sets db ctrl.
	 *
	 * @param dbCtrl the db ctrl
	 */
	public void setDbCtrl(DBController dbCtrl) {
		this.dbCtrl = dbCtrl;
	}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		UserController userCtrl = new UserController(new UCS(new RegisteredUserList()));
		TheatreController theatreCtrl = new TheatreController(new TCS());
		ReservationController reserveCtrl = new ReservationController(new TRS(new MasterTicketList(), new CancellationList()));
		PaymentController paymentCtrl = new PaymentController(new PCS());
		GUIController guiCtrl = new GUIController();
		DBController dbCtrl = new DBController();
		MainController mainCtrl = new MainController(userCtrl, theatreCtrl, reserveCtrl, paymentCtrl, guiCtrl, dbCtrl);
		guiCtrl.setMainController(mainCtrl);

		//load the database
		mainCtrl.loadDB();

//		Movie movie = mainCtrl.getTheatreCtrl().getTheatreCtrlSys().getMovies().get(0);
//		ShowTime time = movie.getShowTimeList().get(0);
//		ArrayList<Seat> seats = time.getSeats();
//		for (int i = 0; i < 20; i++) {
//			seats.get(i).setReserved();
//		}


//		mainCtrl.getTheatreCtrl().getTheatreCtrlSys().getTheatre().display();

//		System.out.println("Testing login...");
//		boolean success = mainCtrl.login("davis.allan@ucalgary.ca", "davis11");


	}
}
