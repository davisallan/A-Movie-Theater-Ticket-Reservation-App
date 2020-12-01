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
	DBController dbCtrl;
	GUIController guiCtrl;

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

	public void loadDB() {
		userCtrl.loadRegisteredUsers(dbCtrl.selectAll("REGISTERED_USER"));
		theatreCtrl.loadTheatres(dbCtrl.selectAll("THEATRE"));

		//setting the aggregation relationship for TRS to point to the same Theatre as TCS
		reserveCtrl.getTicketReserveSys().setTheatre(theatreCtrl.getTheatreCtrlSys().getTheatre());

		theatreCtrl.loadMovies(dbCtrl.selectAll("MOVIE"));
		theatreCtrl.loadShowTimes(dbCtrl.selectAll("SHOW_TIME"));
		theatreCtrl.loadAuditoriums(dbCtrl.selectAll("AUDITORIUM"));
	}

	public void updateSelection(Theatre theatre, Movie movie, ShowTime showTime) {

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

	public DBController getDbCtrl() {
		return dbCtrl;
	}

	public void setDbCtrl(DBController dbCtrl) {
		this.dbCtrl = dbCtrl;
	}

	public static void main(String[] args) {
		UserController userCtrl = new UserController(new UCS(new RegisteredUserList()));
		TheatreController theatreCtrl = new TheatreController(new TCS());
		ReservationController reserveCtrl = new ReservationController(new TRS(new MasterTicketList()));
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
