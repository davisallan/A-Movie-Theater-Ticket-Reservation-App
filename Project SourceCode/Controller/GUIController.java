package Controller;

import Model.CreditCard;
import Model.Movie;
import Model.ShowTime;
import Model.Theatre;
import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Controller for the GUI
 */

public class GUIController {

    private LoginForm loginForm;
    private RegistrationForm registrationForm;
    private Menu menu;
    private ReservationForm reservationForm;
    private MainController mainController;

    public GUIController() {
        setLoginForm(new LoginForm());
        setRegistrationForm(new RegistrationForm());
        setMenu(new Menu());
        setReservationForm(new ReservationForm());

        //setting up all action listeners
        loginForm.signUpButton(new SignUpButton());
        loginForm.loginButton(new LoginButton());
        loginForm.continueAsGuestButton(new ContinueAsGuest());

        registrationForm.registerButton(new RegisterButton());

        menu.reservationButton(new MakeReservationButton());
        menu.cancelReservation(new CancelReservationButton());
        menu.logoutButton(new LogoutButton());

        reservationForm.returnToMenu(new ReturnToMenu());
        reservationForm.movieList(new MovieList());
        reservationForm.showTimeList(new ShowTimeList());
        reservationForm.seatSelection(new SeatSelection());

        loginForm.setVisible(true);
    }

    //action listener for launching the registration form
    private class SignUpButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            registrationForm.setVisible(true);
        }
    }

    //action listener for logging in a user
    private class LoginButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            boolean login = mainController.login(loginForm.getEmail().getText(), new String((loginForm.getPassword().getPassword())));
            if (login) {
                loginForm.getErrorMsg().setText("Logging in!");
                loginForm.setVisible(false);
                menu.setVisible(true);
            } else {
                loginForm.getErrorMsg().setText("Incorrect email or password");
            }
        }
    }

    //action listener to continue as a guest in the system
    private class ContinueAsGuest implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    //action listener for registering a new registered user
    private class RegisterButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            try {
                mainController.getUserCtrl().createRegisteredUser(500,
                        registrationForm.getFirstName().getText(),
                        registrationForm.getLastName().getText(),
                        registrationForm.getEmail().getText(),
                        registrationForm.getPassword().getText(),
                        new CreditCard(registrationForm.getFirstName().getText()
                                + " " + registrationForm.getLastName().getText(),
                                registrationForm.getCcNum().getText(),
                                Integer.parseInt(registrationForm.getExpiry().getText()),
                                registrationForm.getCvc().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "An error occurred, please try again");
                return;
            }
            JOptionPane.showMessageDialog(null, "Thank you! Account created!");
            registrationForm.clearAllFields();
            registrationForm.setVisible(false);
            loginForm.setVisible(true);
        }
    }

    //action listener for making a reservation
    private class MakeReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            menu.setVisible(false);

            DefaultListModel<String> model = new DefaultListModel<>();
            Theatre theatre = mainController.getTheatreCtrl().getTheatreCtrlSys().getTheatre();
            for (Movie movie: theatre.getMovieList()) {
                model.addElement(movie.getMovieName());
            }
            reservationForm.getMovies().setModel(model);
            reservationForm.setVisible(true);

        }
    }

    //action listener for cancelling a reservation
    private class CancelReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    //action listener for logging out of the application
    private class LogoutButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            menu.setVisible(false);
            mainController.setLoggedInUser(null);
            loginForm.clearAllFields();
            loginForm.setVisible(true);
        }
    }

    //action listener for the movie list JList on the reservation page
    private class MovieList extends MouseAdapter {

        public void mouseClicked(MouseEvent me) {
            JList selection = (JList)me.getSource();
            int index = selection.locationToIndex(me.getPoint());
            Movie selected = mainController.getTheatreCtrl().getTheatreCtrlSys().getMovies().get(index);
            //setting the selected movie in the theatre controller
            mainController.getTheatreCtrl().setSelectedMovie(selected);
            DefaultListModel<String> model = new DefaultListModel<>();
            for (ShowTime time: selected.getShowTimeList()) {
                model.addElement("Date: " + time.getDate() + ", Time: " + time.getTime());
            }
            reservationForm.getShowtimes().setModel(model);
        }
    }

    //action listener for the show time list JList on the reservation page
    private class ShowTimeList extends MouseAdapter {

        public void mouseClicked(MouseEvent me) {
            JList selection = (JList)me.getSource();
            int index = selection.locationToIndex(me.getPoint());
            ShowTime selected = mainController.getTheatreCtrl().getSelectedMovie().getShowTimeList().get(index);
            //setting the selected showtime in the theatre controller
            mainController.getTheatreCtrl().setSelectedShowTime(selected);
        }
    }

    //action listener for the return to menu button on the reservation page
    private class ReturnToMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            reservationForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    //action listener for continuing to the seat selection page from the reservation page
    private class SeatSelection implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    public ReservationForm getReservationForm() {
        return reservationForm;
    }

    public void setReservationForm(ReservationForm reservationForm) {
        this.reservationForm = reservationForm;
    }

    public MainController getMainController() {
        return mainController;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void setRegistrationForm(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;
    }

    public RegistrationForm getRegistrationForm() {
        return registrationForm;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
